import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class jsonmaker_3 {

	public static void main(String[] args) throws ParseException {
	    String input = "[{\"SKU\":\"10001\",\"Name\":\"iPhone Charger cable\",\"Qty\":2,\"Unit Price\":10.99,\"tax\":1.99},{\"SKU\":\"10002\",\"Name\":\"Tooth paste\",\"Qty\":1,\"Unit Price\":4.99,\"tax\":1},{\"SKU\":\"10003\",\"Name\":\"Shirt\",\"Qty\":3,\"Size\":\"M\",\"Unit Price\":{\"S\":29.99,\"M\":35,\"L\":40.99},\"tax\":10}]";

	    // Adding all json elements to the itemlist
	    ArrayList<Object> itemlist = new ArrayList<Object>();
	    JSONParser parser = new JSONParser();
	    JSONArray array = (JSONArray) parser.parse(input);
	    itemlist.addAll(Arrays.asList(array.toArray()));

	    // creating item object form each item in the list, and storing in the object_itemlist
	    ArrayList<item> object_itemlist = new ArrayList<item>();
	    for (int i = 0; i < itemlist.size(); i++) {
	        Map<String, Object> item = (Map<String, Object>) itemlist.get(i);
	        Object unitPrice = item.get("Unit Price");
	        if (unitPrice instanceof Map<?, ?>) {
	            item itm = new item(item.get("SKU"), item.get("Name"), item.get("Qty"), (Map<?, ?>) unitPrice,
	                checkifnull(item.get("Size")), item.get("tax"));
	            object_itemlist.add(itm);
	        } else {
	            item itm = new item(item.get("SKU"), item.get("Name"), item.get("Qty"), ((Number) unitPrice).doubleValue(),
	                checkifnull(item.get("Size")), item.get("tax"));
	            object_itemlist.add(itm);
	        }

	    }

	    calculate(object_itemlist);
	}


	public static void calculate(ArrayList<item> o) {
	    Double totalprice = 0.0;
	    Double price;

	    for (item item : o) {
	        if (String.valueOf(item.getName()).equals("Shirt")) {
	            
	            // Creates a new map and puts the unit price map in it.
	            Map<Object, Object> sizepricemap = new HashMap<Object, Object>();
	            sizepricemap.putAll((Map<? extends Object, ? extends Object>) item.getUnit_price());
	            
	            price = ((Double) item.getQnt()).doubleValue() * ((Double) sizepricemap.get(item.getSize())).doubleValue() + ((Double) item.getTax()).doubleValue();
	            
	        } else {
	            price = ((Double) item.getUnit_price()).doubleValue() * ((Double) item.getQnt()).doubleValue() + ((Double) item.getTax()).doubleValue();
	        }
	   
	        totalprice = totalprice + price;
	    }

	    System.out.print("Total is: " + totalprice);
	}

    
    public static Object checkifnull(Object o) {
    	if(o != null) {return o;}
		return "";
    }
}

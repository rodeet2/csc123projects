import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class jsonmaker {

	public static void main(String[] args) {

		
		//i 
		
		Integer[] iarray ={30,31,34,28,49};
		
		JSONArray jarray = new JSONArray();
		  
		  for (int i = 0; i < iarray.length; i++) {
			    jarray.add(iarray[i]);
			}  
		  
		  System.out.print(jarray);
		  
		  
		 //ii
		  
		 String[] sarray = {"One", "Two", "Three", "Four"};

		 JSONArray jsarray = new JSONArray();
		  
		  for (int i = 0; i < sarray.length; i++) {
			    jsarray.add(sarray[i]);
			}  
		  
		  System.out.print(jsarray);
		  		
		//Object[] array={31, 32, “Hello World”, new String[]{“One”,
		  
			 JSONArray jsarray1 = new JSONArray();
			 JSONArray jsarray2 = new JSONArray();
			 
			 jsarray1.add(31);
			 jsarray1.add(32);
			 jsarray1.add("Hello World");
			 jsarray1.add(jsarray2);
			 
			 jsarray2.add("one");
			 jsarray2.add("two");
			 jsarray2.add("three");
			 
			 System.out.print(jsarray1);
			 
			 
			 Map<String, String> map = new TreeMap<String, String>();
			 map.put("Name", "Name1");
			 map.put("Address", "213 Washington Blvd");
			 map.put("Zip", "90532");

			 JSONObject jobject1 = new JSONObject();
			 
			 jobject1.put("Name", "Name1");
			 jobject1.put("Address", "213 Washington Blvd");
			 jobject1.put("Zip", "90532");
			 
			 System.out.print(jobject1);
			 
			 
			 Map<String, Object> map2 = new TreeMap<String, Object>();
			 Set<String> friends = new TreeSet<String>();
			
			 friends.add("Friend 1");
			 friends.add("Friend 2");
			 
			 map2.put("Name", "Name1");
			 map2.put("Address", "213 Washington Blvd");
			 map2.put("Zip", "90532");
			 map2.put("Friends", friends);
			 
			 
			 JSONObject jobj1 = new JSONObject();
			 JSONArray jarry = new JSONArray();
			 
			 jarry.add("Friend 1");
			 jarry.add("Friend 2");             
			 jobj1.put("Name", "Name1");
			 jobj1.put("Address", "213 Washington Blvd");
			 jobj1.put("Zip", "90532");
			 jobj1.put("Friends", jarry);
		
			 System.out.print(jobj1);

	}
	
	

}

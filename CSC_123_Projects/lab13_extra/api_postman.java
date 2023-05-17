import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class api_postman {

	public static void main(String[] args) {
		
		first_api();          // returns recent bitcoin prices
		second_api("jack");   // returns id name is male or female
		
		
	}
	
	public static void second_api( String name) {
		
        try {
            String urlStr = "https://api.genderize.io?name=" + name;
            URL url = new URL(urlStr);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            JSONParser parser = new JSONParser();
            JSONObject json = (JSONObject) parser.parse(response.toString());

            if (json != null) {
                String gender = (String) json.get("gender");
                Double probability = (Double) json.get("probability");
                System.out.println("Name: " + name);
                System.out.println("Gender: " + gender);
                System.out.println("Probability: " + probability);
            }
            
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            
        }
    }
	
	public static void first_api() {
		
		try {
			URL url = new URL("https://api.coindesk.com/v1/bpi/currentprice.json");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer output = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				output.append(inputLine);
			}

			in.close();

			
	        // Parse the JSON string
	        JSONParser parser = new JSONParser();
	        JSONObject json = (JSONObject) parser.parse(output.toString());

	        //print
	        String updatedISO = (String) ((JSONObject) json.get("time")).get("updatedISO");
	        System.out.println("Updated time (ISO): " + updatedISO);
	        JSONObject bpi = (JSONObject) json.get("bpi");
	        String usdRate = ((JSONObject) bpi.get("USD")).get("rate").toString();
	        String gbpRate = ((JSONObject) bpi.get("GBP")).get("rate").toString();
	        String eurRate = ((JSONObject) bpi.get("EUR")).get("rate").toString();
	        System.out.println("Bitcoin rate in USD: " + usdRate);
	        System.out.println("Bitcoin rate in GBP: " + gbpRate);
	        System.out.println("Bitcoin rate in EUR: " + eurRate);
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}
	
		
}

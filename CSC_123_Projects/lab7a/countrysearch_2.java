import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countrysearch_2 {
	
	static ArrayList<String> names = new ArrayList<String>();
	static ArrayList<String> population = new ArrayList<String>();
	static HashMap<String, Integer> map = new HashMap<>();

	

	public static void main(String[] args) {

		File countries = new File("C:\\Users\\srozbu1\\Desktop\\countries.txt");
		
		
		
		
		try {
			Scanner sc = new Scanner(countries);
			
			while (sc.hasNextLine()) {
				 String wholeline = sc.nextLine();
				 String[] twoparts = wholeline.split(",");
				map.put(twoparts[0], Integer.parseInt(twoparts[1]));
				 
			}
			
			
		} catch (FileNotFoundException e) {
	         System.err.print("File not found!");
			
		}
		
		
		System.out.print("Enter search term: ");
		
		Scanner sc = new Scanner(System.in);
		CharSequence item = sc.nextLine().toUpperCase();
        
		System.out.print(find(item));
		
	
		
	}
	
	public static String find(CharSequence item) {
		
		String result = "";
		
		for (String key : map.keySet()) {
		    String upcase = key.toUpperCase();
		   
		    if(upcase.equals(item)) {result = result + key + "\n" + "Population: " + map.get(key); break;}
		    
		    		}
		  
		if (result=="") { result = "item not found!";}
				
		return result;}

}

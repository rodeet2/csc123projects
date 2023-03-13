//Name: Shimran Rodeet Rozbu, email: srozbu1@toromail.csudh.edu


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class countrysearch {
	
	static ArrayList<String> names = new ArrayList<String>();
	static ArrayList<String> population = new ArrayList<String>();
	

	public static void main(String[] args) {

		File countries = new File("C:\\Users\\srozbu1\\Desktop\\countries.txt");
		
		
		
		try {
			Scanner sc = new Scanner(countries);
			
			while (sc.hasNextLine()) {
				 String wholeline = sc.nextLine();
				 String[] twoparts = wholeline.split(",");
				 names.add(twoparts[0]);                         
				 population.add(twoparts[1]);	 
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
		
		for (int i = 0; i < names.size(); i++) {
		    
			if(names.get(i).toUpperCase().contains(item)) {result = result + names.get(i) + "     - Population: " + population.get(i)+ "\n";}
		
		}
		if (result=="") { result = "item not found!";}
				
		return result;}

}

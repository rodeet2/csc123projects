
//Name: Shimran Rodeet Rozbu, email: srozbu1@toromail.csudh.edu

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class noduplicates {

	static String onlylines = "";
	static int match = 0;

	public static void main(String[] args) {
		
		System.out.print("Enter file location");
		
		Scanner sc = new Scanner(System.in);

		File toread =  new File(sc.nextLine());
		
		try {
			Scanner thefile = new Scanner(toread);
		
			while (thefile.hasNextLine()) {
				match = 0;
			 	 
				String line = thefile.nextLine();
				
				Scanner thefileagain = new Scanner(toread);
				while (thefileagain.hasNextLine()) {
					
				String 	lineagain = thefileagain.nextLine();
				if(lineagain.equals(line)) {match++;}	
				}
				thefileagain.close();
				//here if there is less than 1 match, then adds to the onlylines string
				//also, adds the duplicate line once, if not added yet.
				if(match<2) {onlylines = onlylines + line + "\n";}else {
					if(!(onlylines).contains(line)){onlylines = onlylines + line + "\n";}
				}
				//System.out.print(counter);
			}
			
			thefile.close();
			
		} catch (FileNotFoundException e) {
			System.err.print("File Not Found!");
			return;
		}
		
try {
			
			PrintWriter tosave = new PrintWriter(new File("C:\\Users\\srozbu1\\Desktop\\result.txt"));
		    
		    tosave.write(onlylines);
		    tosave.close();
		   System.out.print("\nsuccess");
		   
		} catch (IOException e) {
			System.out.print("\nError!" + e.getMessage());
  
		}
		
		
	}

}

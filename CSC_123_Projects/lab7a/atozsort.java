import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class atozsort {

	public static void main(String[] args) {

		TreeSet<String> alllines = new TreeSet<String>();

		
		System.out.print("Enter the location of the text file:"); 
		Scanner sc = new Scanner(System.in);
		File toread = new File(sc.nextLine()); // Make file
		
		Scanner thefile;
		try {
			thefile = new Scanner(toread);
			while (thefile.hasNextLine()) {
				
				alllines.add(thefile.nextLine());
				
			}
		} catch (FileNotFoundException e1) {
			System.out.print("File not found!");
  
		}
		
		try {
			
			PrintWriter tosave = new PrintWriter(new File("C:\\Users\\srozbu1\\Desktop\\sorted_data.txt"));
		    
			 for (String line : alllines) {
				 tosave.write(line + "\n");
		        }
			
		    tosave.close();
		   System.out.print("\nsuccess");
		   
		} catch (IOException e) {
			System.out.print("\nError!" + e.getMessage());
  
		}
		
		
	}

}

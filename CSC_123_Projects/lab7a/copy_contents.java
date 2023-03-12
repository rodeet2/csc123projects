import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class copy_contents {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the location of the text file:");
		
		File toread = new File(sc.nextLine()); // Make file
		
	    Scanner filedata = null;
		try {
			filedata = new Scanner(toread);    //read file
		} catch (FileNotFoundException e1) {
			System.err.print("File was not found!");
			return;
		}catch(NoSuchElementException e2){
			System.err.print("File was not found!");
			return;
		}
	    
		
		String data = "";
		while (filedata.hasNextLine()) {
			data = data + filedata.nextLine() + "\n";
		}

		System.out.print("\nEnter the location (with file name) to make copy:");
		 String newfilepath = sc.nextLine();
		 

		File check = new File(newfilepath);
		if (check.exists()) { System.out.println("File already exists!"); return;}
		
		try {
			
			PrintWriter tosave = new PrintWriter(new File(newfilepath));
		    
		    tosave.write(data);
		    tosave.close();
		   System.out.print("\nsuccess");
		   
		} catch (IOException e) {
			System.out.print("\nError!" + e.getMessage());
  
		}
		

		  }
		
		

	}




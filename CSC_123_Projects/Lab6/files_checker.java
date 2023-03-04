import java.io.File;
import java.util.Scanner;

public class files_checker {


	public static void main(String[] args) {
		
		 int count =0;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the directory: ");
		
		File directory = new File(sc.next());
		
		 if (!directory.exists()) {
	            System.err.println("Directory not found: " + directory.getAbsolutePath());
	            return;
	        }
		 
		 if (!directory.isDirectory()) {
	            System.err.println("Not a directory: " + directory.getAbsolutePath());
	            return;
	        }
		
		 File[] allfiles = directory.listFiles();

		 for (File af : allfiles) {
			
			 String dtext;
			 String readness;
			 String execution;
			 String writable;
			 
			 count++;
			if(af.isDirectory()==true) {dtext = "Directory";}else {dtext = "File";
			if(af.canRead()==true) {readness = "Readable";}else {readness = "Not readable";}
			if(af.canExecute()==true) {execution = "Executable";}else {execution = "Not Executable";}
			if(af.canWrite()==true) {writable = "Writable";}else {writable = "Not writable";
			
			}
			 System.out.print(count+" - " + af.getName() + " , " + dtext + " , " + readness + " , " + execution + ", " + writable + "\n");
			
			 
		 }
		

		 }
	}

}

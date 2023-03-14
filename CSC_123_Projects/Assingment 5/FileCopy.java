import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileCopy {
	//Shimran Rodeet Rozbu (srozbu1@toromail.csudh.edu)

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the location of the file:");
		String sourcefilepath = sc.nextLine();
		System.out.print("Enter the location of New file:");
		String targetfilepath = sc.nextLine();
		
		checkerrors(sourcefilepath,targetfilepath);
		readandwrite(sourcefilepath,targetfilepath);
		
	}

	
	
	
	public static void checkerrors (String s, String t) {
		
		File source = new File(s);
		File target = new File(t);
		
		if(source.exists() == false) {System.err.print("Source file does not exist!"); System.exit(1);}
		
		if(source.isDirectory() == true || target.isDirectory() == true) {System.err.print("Can not take directory!"); System.exit(1);}
		
		if(target.exists() == true) {System.err.print("New file already exist! Cannot Overwrite"); System.exit(1);}

		if(source == null || target == null) {System.err.print("Missing input!"); System.exit(1);}
		
		if(target.exists() == false) {
            target.mkdirs();
		}

		
	}
	
	public static void readandwrite(String s, String t) {
		
		try {
			byte[] fileBytes = Files.readAllBytes(Paths.get(s));	
			
			Files.write(Paths.get(t),fileBytes );
			
            System.out.println("File written successfully!");
		} catch (Exception e) {
			
		}
		
	}
	
}

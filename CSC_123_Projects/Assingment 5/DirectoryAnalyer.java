//Shimran Rodeet Rozbu (srozbu1@toromail.csudh.edu)

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DirectoryAnalyer {
	


	public static void main(String[] args) {
		
	    int totalfilecount = 0;
	    int totalalphachar = 0;
	    int totalnumchar = 0;
	    int totalspcae = 0;
	    int totalsize = 0;
		 
	     Scanner enter = new Scanner(System.in);
	     
		 String input = enter.next(); 
		 
	     File dr = new File(input);
	     if (!dr.exists()) {
	            System.out.println("Directory does not exist.");
	            return;
	        }
	     
	     
    	 System.out.printf("Name    Bytes   Alphabetical Chars     Numerical Chars     Blank Spaces \n  ");

	        
	        for (File file : dr.listFiles()) {
	        	
	            if (file.isFile()) {
	            	 int alphachar = 0;
		             int numchar = 0;
		             int space = 0;
		             long fileSize = file.length();
	            	 totalfilecount++;
	            	 totalsize += fileSize;
	            	 
	            	 //get inside file information
	            	 try {
	                     Scanner sc = new Scanner(file);
	                     while (sc.hasNext()) {
	                         String text = sc.next();
	                         for (int i = 0; i < text.length(); i++) {
	                             char c = text.charAt(i);
	                             if (Character.isAlphabetic(c)) { alphachar++;} 
	                             if (Character.isDigit(c)) {numchar++;} 
	                             if (Character.isWhitespace(c)) {space++;}
	                           }
	                     }
	                
	                 } catch (FileNotFoundException e) {
	                     e.printStackTrace();
	                 }
	            	 
	            	 System.out.printf(file.getName() + " File Size: " + fileSize + " Aplha Char: " + alphachar + " Num Char: " + numchar+ " Space: " +space + "\n");
	            	 
	            	 //count total:
	
	            	 totalalphachar += alphachar;
	            	 totalnumchar += numchar;
	            	 totalspcae += space;
	            	 
	            }
	            
	        }
	        
	        
	     // Print totals
	        System.out.printf("\nTotal Files: %d\n", totalfilecount);
	        System.out.printf("Total Alpha Chars: %d\n", totalalphachar);
	        System.out.printf("Total Numeric Chars: %d\n", totalnumchar);
	        System.out.printf("Total Space Chars: %d\n", totalspcae);
	        System.out.printf("Total Size Disk: %dKB\n", totalsize / 1024);

	}



	
}



//Shimran Rodeet Rozbu (srozbu1@csudh.edu)

import java.util.Scanner;

public class ChangeMaker {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int totalcent =0;
		
	     System.out.println("Please enter the number of dollars: ");
	     int dollar = sc.nextInt();
	     System.out.println("Please enter the number of cents: ");
	     int cents = sc.nextInt();
	     
	     totalcent = (dollar * 100) + cents;
	     
	     int qat = totalcent / 25;
	     
	     totalcent = totalcent % 25;  // this is the remaining money
		
	     int dim = totalcent / 10;
	     
	     totalcent = totalcent % 10; 
	     
	     System.out.println(dollar + " dollars and " + cents + " cents is: ");
	     System.out.println(qat + " quaters, " + dim + " dimes, " + cents + " cents.");

	}
     
    
}

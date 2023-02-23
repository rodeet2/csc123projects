//Shimran Rodeet Rozbu (srozbu1@csudh.edu)

import java.util.Scanner;

public class TipCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter bill amount: ");
		int bill = sc.nextInt();
		System.out.println("How happy are you with the service [1-5]: ");
		int happyvalue = sc.nextInt();
		
		//validation
		
		if (bill < 0) {
			System.out.println("Bill is less than zero");
			System.exit(0);
		}
        
		if (happyvalue > 5 || happyvalue < 1) {
			System.out.println("Invalid Feedback");
			System.exit(0);
		}

		// calculation
		
		double tax = (bill * (0.0713));
		double tip = 0;
		String tipper = "";
		
		switch(happyvalue) {
		  case 1:
		    tip = (bill * (0.05));
		    tipper = "5%)";
		    break;
		  case 2:
			  tip = (bill * (0.075));
			  tipper = "7.5%)";
		    break;
		  case 3:
			  tip = (bill * (0.1));
			  tipper = "10%)";
		    break;
		  case 4:
			  tip = (bill * (0.15));
			  tipper = "15%)";
		    break;
		  case 5:
			  tip = (bill * (0.2));
			  tipper = "20%)";
		    break;
		  default:
			  
		}
	
		double totalbill = bill + tax + tip;
		
		// output 
		System.out.println("Your bill total: " + bill);
		System.out.println("Tax(@7.13%): " + tax);
		System.out.println("Tip(@"+ tipper +" based on happiness value " + happyvalue + ": " + tip);
		System.out.println("Total to pay: " + totalbill);

	}

}

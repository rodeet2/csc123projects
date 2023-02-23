
//Shimran Rodeet Rozbu (srozbu1@csudh.edu)

import java.util.Scanner;

public class Gravity {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Height in metters:");
		int h = sc.nextInt();
		System.out.println("Enter the time in seconds:");
		int t = sc.nextInt();
		
		//x(t) = 0.5 × at2 + vit + xi 
		
		double xt = (0.5 * (-9.81) * (t*t)) + h; // distance from ground
		
		double disfromintial = h - xt;   // fallen distance
	
		
		System.out.println("After being dropped from " + h +" meters, the object fell " + Math.round(disfromintial)+" meters in "+ t +
				" seconds. The distance from the ground at the time was " + Math.round(xt) + " meters. ");

	}

}

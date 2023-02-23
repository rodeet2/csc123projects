
//Shimran Rodeet Rozbu (srozbu1@csudh.edu)

import java.util.Scanner;

public class CoinCounter {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int totalcent =0;
		
    System.out.println("Please enter the number of pennies: ");
	int pen = sc.nextInt();
	System.out.println("Please enter the number of Nickels: ");
	int nik = sc.nextInt();
	System.out.println("Please enter the number of Dimes: ");
    int dim = sc.nextInt();
    System.out.println("Please enter the number of quarters: ");
   	int qat = sc.nextInt();
	
   	totalcent = pen + (nik * 5) + (dim * 10) + (qat * 25);
   	
   	double money = (totalcent * 0.01);
   	
   	int onlydollar = (int) money;
   	double onlycents = money % 100;
   	
   	System.out.println("You have dollar: " + onlydollar + " and " + onlycents + " cents" );
   	
	}

}


import java.util.Scanner;

public class BillCalculator {

	public static void main(String[] args) {
		
		// input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Voice call minutes: ");
		int voice = sc.nextInt();
		System.out.println("Enter Text messages sent: ");
		int text = sc.nextInt();
		System.out.println("Enter MB data used: ");
		int data = sc.nextInt();
		System.out.println("Enter Package code: ");
		int pc = sc.nextInt();
		
		//validation
		
		if (voice < 0){
			System.out.println("Invalid input");
			System.exit(0);
		}
		if (text < 0){
			System.out.println("Invalid input");
			System.exit(0);
		}
		if (data < 0){
			System.out.println("Invalid input");
			System.exit(0);
		}
		if (pc < 0 || pc > 3){
			System.out.println("Invalid input");
			System.exit(0);
		}

		
		//calculations
		
		int mc = 0;
		double add_voice = 0;
		double add_text = 0;
		double add_data = 0;
		double totalcharges = 0;
		
		String usedvoice ="non";
		String usedtext ="non";
		String useddata ="non";
		
		switch(pc) {
		  case 1:
		    mc = 20;
		    if (voice>100) {
		    	add_voice = (voice - 100) * 0.20;
		    	usedvoice = "You used " +voice+"/100 minutes, you exceeded your monthly limit";
		    }else {
		    	usedvoice = "You used " +voice+"/100 minutes,  you are within your monthly limit";
		    }
		    
		    if (text>150) {
		    	add_text = (text - 150) * 0.20;
		    	usedtext = "You used " +text+"/150 text, you exceeded your monthly limit";
		    }else {
		    	usedtext = "You used " +text+"/150 text,  you are within your monthly limit";
		    }
		    
		    if (data>1024) {
		    	add_data = (data - 150) * 0.25;
		    	useddata = "You used " +data+"/1024 MB, you exceeded your monthly limit";
		    }else {
		    	useddata = "You used " +data+"/1024 MB,  you are within your monthly limit";
		    }
		    
		    totalcharges = mc + add_voice + add_text + add_data;

			  
		    break;
		  case 2:
			  
			    mc = 30;
			    if (voice>200) {
			    	add_voice = (voice - 200) * 0.13;
			    	usedvoice = "You used " +voice+"/200 minutes, you exceeded your monthly limit";
			    }else {
			    	usedvoice = "You used " +voice+"/200 minutes,  you are within your monthly limit";
			    }
			    
			    if (text>300) {
			    	add_text = (text - 300) * 0.10;
			    	usedtext = "You used " +text+"/300 text, you exceeded your monthly limit";
			    }else {
			    	usedtext = "You used " +text+"/300 text,  you are within your monthly limit";
			    }
			    
			    if (data>2048) {
			    	add_data = (data - 2048) * 0.25;
			    	useddata = "You used " +data+"/2048 MB, you exceeded your monthly limit";
			    }else {
			    	useddata = "You used " +data+"/2048 MB,  you are within your monthly limit";
			    }
			    
			    totalcharges = mc + add_voice + add_text + add_data;
		   
		    break;
		    
		  case 3:
			  
			    mc = 40;
			    if (voice>400) {
			    	add_voice = (voice - 400) * 0.8;
			    	usedvoice = "You used " +voice+"/400 minutes, you exceeded your monthly limit";
			    }else {
			    	usedvoice = "You used " +voice+"/400 minutes,  you are within your monthly limit";
			    }
			    
			    if (text>600) {
			    	add_text = (text - 600) * 0.8;
			    	usedtext = "You used" +text+"/600 text, you exceeded your monthly limit";
			    }else {
			    	usedtext = "You used" +text+"/600 text,  you are within your monthly limit";
			    }
			    
			    if (data>4096) {
			    	add_data = (data - 4096) * 0.13;
			    	useddata = "You used" +data+"/4096 MB, you exceeded your monthly limit";
			    }else {
			    	useddata = "You used" +data+"/4096 MB,  you are within your monthly limit";
			    }
			    
			    totalcharges = mc + add_voice + add_text + add_data;
			  
			  
			    break;
		  default:
		    
		}
		
		
		//output
		
		System.out.println("Summary of Usage:");
		
		System.out.println(usedvoice);
		System.out.println(usedtext);
		System.out.println(useddata);
		
		System.out.println("--Charges-- ");
		
		System.out.println("Package Code: " + pc);
		System.out.println("Monnthly Charges: " + mc);
		System.out.println("Additional voice charges: " + add_voice);
		System.out.println("Additional SMS charges: " + add_text);
		System.out.println("Additional data charges: " + add_data);
		System.out.println("Sub Total: " + totalcharges);
		System.out.println("State Tax(6.5%): " + (totalcharges * (6.5/100)));
		System.out.println("Total Due: " + (totalcharges + (totalcharges * (6.5/100))));
	}

}

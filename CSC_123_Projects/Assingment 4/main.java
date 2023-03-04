 //Shimran Rodeet Rozbu (srozbu1@toromail.csudh.edu)


import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		loadmenu();
		
	}
	
	
	public static void loadmenu() {
		
		System.out.print(
				"...................................."
				+"\r\n\1–1 Open a Checking account\r\n"
				+ "2 – Open Saving Account\r\n"
				+ "3 – List Accounts\r\n"
				+ "4 – Account Statement\r\n"
				+ "5 – Deposit funds\r\n"
				+ "6 – Withdraw funds\r\n"
				+ "7 – Close an account\r\n"
				+ "8 – Exit\r\n"
				+ "Please enter your choice:"
				);
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		switch(input) {
		  case 1:
			  
			  System.out.println("Enter first name: ");
			  String name = sc.next();
			  System.out.println("Enter last name: ");
			  String lastname = sc.next();
			  System.out.println("Enter social security number: ");
			  String SSN = sc.next();
			  System.out.println("Enter Email: ");
			  String email = sc.next();
			  System.out.println("Enter overdraft limit: ");
			  int limt = sc.nextInt();
			  
			 Account acc=  Bank.openAccount(name, lastname, SSN, email, "Checking", limt);
	
			  System.out.print("Thank you, the account number is " + acc.getAccountNumber());
			  
			  loadmenu();
			  
		    break;
		  case 2:
		    
			  System.out.println("Enter first name: ");
			  String name1 = sc.next();
			  System.out.println("Enter last name: ");
			  String lastname1 = sc.next();
			  System.out.println("Enter social security number: ");
			  String SSN1 = sc.next();
			  System.out.println("Enter Email: ");
			  String email1 = sc.next();
			
			  int limt1 = 0; // Saving accounts have limit of 0
			  
			  Account acc1=  Bank.openAccount(name1, lastname1, SSN1,email1, "Saving", limt1);
	
			  System.out.print("Thank you, the account number is " + acc1.getAccountNumber() );
			  
			  loadmenu();
			  
		    break;
		  case 3:
			    
			
			  Bank.printAccounts();
	
			  loadmenu();
			  
			    break;
			    
		  case 4:
			  System.out.println("Enter account number: ");
			  int accountnum4 = sc.nextInt();
				
			  if(Bank.findAccount(accountnum4) == null){
					 System.out.print("Account not found");
				 }else {
					 Account a = Bank.findAccount(accountnum4);
					 a.getTrans();
				 }
	
			  loadmenu();
			  
			    break;
		    case 5:
		    	 System.out.println("Enter account number: ");
				  int accountnum = sc.nextInt();
				  System.out.println("Enter ammount: ");
				  int ammount = sc.nextInt();
				  
				 if(Bank.findAccount(accountnum) == null){
					 System.out.print("Account not found");
				 }else {
					Boolean a = Bank.deposit(accountnum, ammount);
					 if(a == true) {System.out.print("Deposit Success, the balance is: " + (Bank.findAccount(accountnum)).getBalance() );}
					 if(a == false) {System.out.print("Deposit failed, the balance is: " + (Bank.findAccount(accountnum)).getBalance() );}
				 }
				 
				  
				 loadmenu();
				 
			    break; 
			    
		    case 6:
		    	
		    	 System.out.println("Enter account number: ");
				  int accountnum1 = sc.nextInt();
				  System.out.println("Enter ammount for withdrawl: ");
				  int withrawlamount = sc.nextInt();
				  
				  if(Bank.findAccount(accountnum1) == null){
						 System.out.print("Account not found");
					 }else {
					  
						 Boolean a = Bank.withdraw(accountnum1, withrawlamount);
						 if(a == true) {System.out.print("Withdraw Success, the balance is: " + (Bank.findAccount(accountnum1)).getBalance() );}
						 if(a == false) {System.out.print("Withdraw failed, the balance is: " + (Bank.findAccount(accountnum1)).getBalance() );}
			    
					 }
				  
				  loadmenu();
				   
				    break;
		    case 7:
				  
		    	System.out.print("account number to close: " ); 
		    	int accountnumber = sc.nextInt();
		    	
		    	if(Bank.findAccount(accountnumber) == null){
					 System.out.print("Account not found");
				 }else {
					 
					 Bank.closeAccount(accountnumber);
					 
					 System.out.print("Account closed, current balance is ," +Bank.findAccount(accountnumber).getBalance() + "deposits are no longer possible"); 

				 }
		    	
		    	loadmenu();
		    	
				    break;
				    
		    case 8:
				  
		    	System.exit(0);
		    	
				    break;
		  default:
			  
			  System.out.print("Please choose between 1 to 8\r\n");
		
			  loadmenu();
		}
		
		
	}
	
}

 //Shimran Rodeet Rozbu (srozbu1@toromail.csudh.edu)


import java.util.ArrayList;

public class Bank {
	private static ArrayList<Account> accounts=new ArrayList<Account>();
	private static int accountNumbers=100;
	private Bank() {}
	
	
	
	public static Account openAccount(String firstName, String lastName, String email, String SSN, String type, int limit) {
		Person customer=new Person(firstName, lastName,email,SSN);
		Account account=new Account(accountNumbers++, type, limit, customer);
		accounts.add(account);
		return account;
	}
	
	public static void printAccounts() {
	
		for(Account a: accounts) {
			System.out.println(a);
		}

	}	
	
	//The following methods must be implemented
	
	public static Account findAccount(int accountNumber) {
		
		for (Account a : accounts) {
	        if (a.getAccountNumber() == accountNumber) {
	            return a;
	        }
	    }
		
	    return null;
		
	}
	
	
	public static boolean deposit(int accountNumber, int amount) {

		Account a = findAccount(accountNumber);
		if(a==null) {return false;}
		return a.deposit(amount);
	
    }

   	
	public static boolean withdraw(int accountNumber, int amount) {
		
		Account a = findAccount(accountNumber);
		if(a==null) {return false;}
		return a.withdraw(amount);
	
    } 
    

	public static boolean closeAccount(int accountNumber) {
		Account a = findAccount(accountNumber);
		if(a==null) {return false;}
		a.closeAccount();
		return true;
	
    }
    
   
	
}

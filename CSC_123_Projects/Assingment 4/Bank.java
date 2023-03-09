 //Shimran Rodeet Rozbu (srozbu1@toromail.csudh.edu)


import java.util.ArrayList;

public class Bank {
	private static ArrayList<Account1> accounts=new ArrayList<Account1>();
	private static int accountNumbers=100;
	private Bank() {}
	
	
	
	public static Account1 openAccountchecking(String firstName, String lastName, String email, String SSN, String type, int limit) {
		Person1 customer=new Person1(firstName, lastName,email,SSN);
		Account1 account=new Account1(accountNumbers++, type, limit, customer);
		accounts.add(account);
		return account;
	}
	
	public static Account1 openAccountsaving(String firstName, String lastName, String email, String SSN, String type, int limit) {
		Person1 customer=new Person1(firstName, lastName,email,SSN);
		Account1 account=new checking_account1(accountNumbers++, type, limit, customer);
		accounts.add(account);
		return account;
	}
	
	public static void printAccounts() {
	
		for(Account1 a: accounts) {
			System.out.println(a);
		}

	}	
	
	//The following methods must be implemented
	
	public static Account1 findAccount(int accountNumber) {
		
		for (Account1 a : accounts) {
	        if (a.getAccountNumber() == accountNumber) {
	            return a;
	        }
	    }
		
	    return null;
		
	}
	
	
	public static boolean deposit(int accountNumber, int amount) {

		Account1 a = findAccount(accountNumber);
		if(a==null) {return false;}
		return a.deposit(amount);
	
    }

   	
	public static boolean withdraw(int accountNumber, int amount) {
		
		Account1 a = findAccount(accountNumber);
		if(a==null) {return false;}
		return a.withdraw(amount);
	
    } 
    

	public static boolean closeAccount(int accountNumber) {
		Account1 a = findAccount(accountNumber);
		if(a==null) {return false;}
		a.closeAccount();
		return true;
	
    }
    
   
	
}

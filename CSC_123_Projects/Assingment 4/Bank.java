//Shimran Rodeet Rozbu (srozbu1@toromail.csudh.edu)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Bank {
	private static ArrayList<Account> accounts = new ArrayList<>();
	private static int accountNumbers = 100;
	
	static  Map<Integer, Account> map = new HashMap<Integer, Account>();
	
	
	

	private Bank() {
	}

	public static Account openAccountchecking(String firstName, String lastName, String email, String SSN, String type,
			int limit) {
		Person customer = new Person(firstName, lastName, email, SSN);
		Account account = new checking_account(accountNumbers++, type, limit, customer);
		accounts.add(account);
        map.put(accountNumbers = accountNumbers-1 , account);
		return account;
		
	}

	public static Account openAccountsaving(String firstName, String lastName, String email, String SSN, String type,
			int limit) {
		Person customer = new Person(firstName, lastName, email, SSN);
		Account account = new savings_account(accountNumbers++, type, 0, customer);
		accounts.add(account);
		return account;
	}

	public static void printAccounts() {

		for (Account a : accounts) {
			System.out.println(a);
		}

	}

	public static Account findAccount(int accountNumber) {

		/*
		 * for (Account a : accounts) { if (a.getAccountNumber() == accountNumber) {
		 * return a; } }
		 */
		
		
		if (map.containsKey(accountNumber)) {
		    return map.get(accountNumber);   
		}

		return null;

	}

	public static void deposit(int accountNumber, int amount) throws Throwable {

		Account a = findAccount(accountNumber);
		 a.deposit(amount);

	}

	public static void withdraw(int accountNumber, int amount)throws Throwable {

		Account a = findAccount(accountNumber);
		 a.withdraw(amount);

	}

	public static boolean closeAccount(int accountNumber) {
		Account a = findAccount(accountNumber);
		if (a == null) {
			return false;
		}
		a.closeAccount();
		return true;

	}
	
	public static boolean save(int accountNumber) {
		Account a = findAccount(accountNumber);
		if (a == null) {
			return false;
		}
		
		return a.maketxt();
		
	}

}

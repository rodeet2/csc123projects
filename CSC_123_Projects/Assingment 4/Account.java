//Shimran Rodeet Rozbu (srozbu1@toromail.csudh.edu)

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Account {
	// Fields

	private int accountNumber;
	protected int limit;
	private String type;
	protected boolean accountOpen;
	protected double balance;
	private Person accountHolder;

	protected ArrayList<String> trans = new ArrayList<>();
	protected int transindex;

	// Constructor
	public Account(int accountNumber, String type, int limit, Person accountHolder) {
		this.accountNumber = accountNumber;
		this.limit = limit;
		this.type = type;
		this.accountHolder = accountHolder;
		accountOpen = true;
		
		
		
	}

	public void getTrans() {

		for (String trans : trans) {
			System.out.println(trans);
		}

		System.out.println("\r\n Balance: " + getBalance());

	}


	public boolean isOpen() {
		return this.accountOpen;
	}

	public void closeAccount() {
		this.accountOpen = false;
	}

	public double getBalance() {
		return this.balance;
	}

	@Override
	public String toString() {
		// 1001(Checking) : Joe : Blogs : 999-999-9999 : 17.0 : Account Open
		return this.accountNumber + this.type + " : " + accountHolder.getFirstName() + " : "
				+ accountHolder.getLastName() + " : " + accountHolder.getSSN() + " : " + this.balance + " : "
				+ " Account open: " + this.accountOpen;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void deposit(double amount) throws Throwable {
		System.out.print("Should not print");
	}
	public void withdraw(double amount) throws Throwable {
		
	}
	public boolean maketxt() {
	
		try {
			PrintWriter tosave = new PrintWriter(new File("C:\\Users\\srozbu1\\Desktop\\transactions.txt"));
			for (String trans : trans) {
			tosave.write(trans);
			}
			tosave.write("\r\n Balance: " + getBalance());
			tosave.close();
			return true;
			
		} catch (FileNotFoundException e) {
			System.err.print("File not found!");
			return false;
		}
		
	}
}
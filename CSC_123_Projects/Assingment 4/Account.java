 //Shimran Rodeet Rozbu (srozbu1@toromail.csudh.edu)

import java.util.ArrayList;

public class Account {
	//Fields
	
	private int accountNumber;
	protected int limit;
	private String type;
	protected boolean accountOpen;
	protected double balance;
	private Person1 accountHolder;
	
	
	protected  ArrayList<String> trans=new ArrayList<String>();
	protected  int transindex;
	
	
	//Constructor
	public Account(int accountNumber, String type, int limit, Person1 accountHolder) {
		this.accountNumber = accountNumber;
		this.limit = limit;
		this.type = type;
		this.accountHolder = accountHolder;
		accountOpen=true;
	}


	public void getTrans() {
		
		for(String trans: trans) {
			System.out.println(trans);
		}
		
		System.out.println("\r\n Balance: " + getBalance() );
		
	}


	public boolean withdraw(double amount) {
		
		if(amount<0) return false;  // checks if amount is more than zero.
		
	if(this.accountOpen == false && this.balance<0) {return false;} // if account is closed, balance is less than 0, no more withdraws allowed.
		
		if((this.balance+this.limit)-amount<0) {return false;}else{this.balance=this.balance-amount;}
		
		transindex++;
		trans.add(transindex + ": Debit : " + amount);
		return true;
	}
	
	public boolean deposit(double amount) {
		
		if(amount<0) return false;  // checks if amount is more than zero.
		
		if(this.balance > 0 == true && this.accountOpen == false) {return false;} // if account is closed, and balance isn't negative, no more deposits allowed 
		if (this.balance+amount > 0 && this.accountOpen == false) {return false;} // if account is close, and amount to be added will make total more than 0 then not allowed. 
		this.balance=this.balance+amount;
		transindex++;
		trans.add(transindex + ": Credit : " + amount);
		return true;
		
	}
	
	public boolean isOpen() {
		return this.accountOpen;
	}
	
	public void closeAccount() {
		this.accountOpen=false;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	
	public String toString() {
		//1001(Checking) : Joe : Blogs : 999-999-9999 : 17.0 : Account Open
		return this.accountNumber+this.type +" : " + accountHolder.getFirstName()+" : "  + accountHolder.getLastName()+" : "  + accountHolder.getSSN()+" : "  + this.balance+" : "  +" Account open: " + this.accountOpen;
	}

	public int getAccountNumber() {
		return accountNumber ;
	}
	
	
}
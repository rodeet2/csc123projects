
public class savings_account extends Account1 {

	public savings_account(int accountNumber, String type, int limit, Person1 accountHolder) {
		super(accountNumber, type, limit, accountHolder);
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
	
	public boolean withdraw(double amount) {
		
		if(amount<0) return false;  // checks if amount is more than zero.
		
	if(this.accountOpen == false && this.balance<0) {return false;} // if account is closed, balance is less than 0, no more withdraws allowed.
		
		if((this.balance+this.limit)-amount<0) return false;
		this.balance=this.balance-amount;
		transindex++;
		trans.add(transindex + ": Debit : " + amount);
		return true;
	}
	
	

}

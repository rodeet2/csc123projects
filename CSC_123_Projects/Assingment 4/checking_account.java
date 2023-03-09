
public class checking_account extends Account1 {

	public checking_account(int accountNumber, String type, int limit, Person1 accountHolder) {
		super(accountNumber, type, limit, accountHolder);
		// TODO Auto-generated constructor stub
	}
	
	public boolean deposit(double amount) {
		
		if(amount<0) return false;  // checks if amount is more than zero.
		
		if(this.accountOpen == true) {
			this.balance=this.balance+amount;
			transindex++;
			trans.add(transindex + ": Credit : " + amount);
		}
		
		if(this.accountOpen==false) {
			if(this.balance+amount > 0) {return false;};
			this.balance=this.balance+amount;
			transindex++;
			trans.add(transindex + ": Credit : " + amount);
		}
		
		return true;
		
	}
	
	public boolean withdraw(double amount) {
		
		if(amount<0) return false;  // checks if amount is more than zero.
		
		if(this.accountOpen == true) {
			if((this.balance+this.limit)-amount<0) {return false;}
			this.balance=this.balance-amount;
			transindex++;
			trans.add(transindex + ": Credit : " + amount);
		}
		
		if(this.accountOpen==false) {
			if(this.balance<0) {return false;}
			this.balance=this.balance-amount;
			transindex++;
			trans.add(transindex + ": Credit : " + amount);
		}
	
		return true;
	}

}

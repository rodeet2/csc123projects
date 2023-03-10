
public class savings_account extends Account {

	public savings_account(int accountNumber, String type, int limit, Person accountHolder) {
		super(accountNumber, type, limit, accountHolder);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean deposit(double amount) {

		if (amount < 0)
			return false; // checks if amount is more than zero.

		if (this.accountOpen) {
			this.balance = this.balance + amount;
			transindex++;
			trans.add(transindex + ": Credit : " + amount);
		}

		if (!this.accountOpen) {
			if (this.balance + amount > 0) {
				return false;
			}
			this.balance = this.balance + amount;
			transindex++;
			trans.add(transindex + ": Credit : " + amount);
		}

		return true;

	}

	@Override
	public boolean withdraw(double amount) {

		 // checks if amount is more than zero.

		if ((amount < 0) || ((this.balance - amount) <= 0)) {
			return false;
		}

		this.balance = this.balance - amount;
		transindex++;
		trans.add(transindex + ": Debit : " + amount);

		return true;
	}

}

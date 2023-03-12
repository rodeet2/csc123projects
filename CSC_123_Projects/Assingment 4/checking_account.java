
public class checking_account extends Account {

	public checking_account(int accountNumber, String type, int limit, Person accountHolder) {
		super(accountNumber, type, limit, accountHolder);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean deposit(double amount) throws Throwable {

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
				continue;
              throw new NoSuchAccountException();
              

			}
			this.balance = this.balance + amount;
			transindex++;
			trans.add(transindex + ": Credit : " + amount);
		}

		return true;

	}

	@Override
	public boolean withdraw(double amount) {

		if (amount < 0)
			return false; // checks if amount is more than zero.

		if (this.accountOpen) {
			if ((this.balance + this.limit) - amount < 0) {
				return false;
			}
			this.balance = this.balance - amount;
			transindex++;
			trans.add(transindex + ": Credit : " + amount);
		}

		if (!this.accountOpen) {
			if (this.balance < 0) {
				return false;
			}
			this.balance = this.balance - amount;
			transindex++;
			trans.add(transindex + ": Credit : " + amount);
		}

		return true;
	}

}

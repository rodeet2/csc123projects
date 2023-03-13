
public class savings_account extends Account {

	public savings_account(int accountNumber, String type, int limit, Person accountHolder) {
		super(accountNumber, type, limit, accountHolder);
	}
	
	
	public void deposit(double amount) throws Throwable {

		if (this.accountOpen) {
			this.balance = this.balance + amount;
			transindex++;
			trans.add(transindex + ": Credit : " + amount);
			System.out.print("Deposit Success, the balance is: " + (Bank.findAccount(this.getAccountNumber())).getBalance());
		}

		if (!this.accountOpen) {
			if (this.balance + amount > 0) {
			 System.out.print("Deposit failed, the balance is: " + (Bank.findAccount(this.getAccountNumber())).getBalance());
			 throw new AccountClosedException("Account is closed and balace is more than zero, therefore can not deposit");
			}
			this.balance = this.balance + amount;
			transindex++;
			trans.add(transindex + ": Credit : " + amount);
			System.out.print("Deposit Success, the balance is: " + (Bank.findAccount(this.getAccountNumber())).getBalance());
		}

	}

	
	public void withdraw(double amount) throws Throwable {
			
		if (this.accountOpen) {
			if ((this.balance + this.limit) - amount < 0) {
				 //if  amount cross limit
				 System.out.print("Withdraw failed, the balance is: " + (Bank.findAccount(this.getAccountNumber())).getBalance());
				 throw new InsufficientBalanceException("The ammount is over the limit!");

			}
			this.balance = this.balance - amount;
			transindex++;
			trans.add(transindex + ": Debit : " + amount);
			System.out.print("Withdrawl Success, the balance is: " + (Bank.findAccount(this.getAccountNumber())).getBalance());

		}

		if (!this.accountOpen) {
			if (this.balance <= 0) {
				System.out.print("Withdraw failed, the balance is: " + (Bank.findAccount(this.getAccountNumber())).getBalance());
				 throw new AccountClosedException("Account closed and balance is zero, can not withdraw!");
			}
			
			this.balance = this.balance - amount;
			System.out.print("Withdraw Success, the balance is: " + (Bank.findAccount(this.getAccountNumber())).getBalance());

			transindex++;
			trans.add(transindex + ": Debit : " + amount);
		}

	}

}

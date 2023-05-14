class BankAccount {

	private int balance = 0;

	public void open() {
		// TODO Auto-generated method stub

	}

	public int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	public void deposit(int amount) throws BankAccountActionInvalidException {
		if (amount <= 0) {
			throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
		}
		balance += amount;
	}

	public void withdraw(int amount) throws BankAccountActionInvalidException {
		if (amount <= 0) {
			throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
		}
		if (balance == 0) {
			throw new BankAccountActionInvalidException("Cannot withdraw money from an empty account");
		}
		if (balance - amount < 0) {
			throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account");
		}
		balance -= amount;
	}

	public void close() {
		// TODO Auto-generated method stub

	}

}
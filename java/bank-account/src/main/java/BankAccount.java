class BankAccount {

	private int balance = 0;

	public void open() {
		// TODO Auto-generated method stub

	}

	public int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public void withdraw(int amount) throws BankAccountActionInvalidException {
		if (balance - amount < 0) {
			throw new BankAccountActionInvalidException("Cannot withdraw money from an empty account");
		}
		balance -= amount;
	}

	public void close() {
		// TODO Auto-generated method stub

	}

}
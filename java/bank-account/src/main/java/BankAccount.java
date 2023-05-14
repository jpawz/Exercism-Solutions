class BankAccount {
	private boolean isOpen = false;
	private int balance = 0;

	public void open() {
		isOpen = true;
	}

	public int getBalance() throws BankAccountActionInvalidException {
		if (!isOpen) {
			throw new BankAccountActionInvalidException("Account closed");
		}
		return balance;
	}

	public void deposit(int amount) throws BankAccountActionInvalidException {
		if (!isOpen) {
			throw new BankAccountActionInvalidException("Account closed");
		}
		if (amount <= 0) {
			throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
		}
		balance += amount;
	}

	public void withdraw(int amount) throws BankAccountActionInvalidException {
		if (!isOpen) {
			throw new BankAccountActionInvalidException("Account closed");
		}
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
		isOpen = false;
	}

}
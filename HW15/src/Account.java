public class Account {
	double balance;
	int accountNumber;

	public Account(double bal, int accNum) {
		this.balance = bal;
		this.accountNumber = accNum;
	}

	public String getAccountType() {
		return null;
	}

	public String toString() {
		return getAccountType() + " -   " + "ID = " + accountNumber + " : $" + balance;
	}

	public static void main(String[] args) {
		Account account = new Account(2000, 44);
		if (account.toString().equals("ID = 44 : $2000")) {
			System.out.println(true);
			
		} else {
			System.out.println(false);
			
		}
		if (account.getAccountType() == null) {
			System.out.println(true);
			
		} else {
			System.out.println(false);
			
		}

	}
}

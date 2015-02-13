public class Monthly {

	public static void main(String[] args) {

		Account[] accounts = new Account[5];
		accounts[0] = new SavingsAccount(3400, 1);
		accounts[1] = new SavingsAccount(1520, 2);
		accounts[2] = new CheckingAccount(1800, 3);
		accounts[3] = new CheckingAccount(2400, 4);
		accounts[4] = new SavingsAccount(20, 5);

		System.out.println("Beginning Balance");
		for (int i = 0; i < accounts.length; i++) {
			System.out.println(accounts[i]);
			if (accounts[i] instanceof SavingsAccount == true) {
				SavingsAccount savingsAccount = (SavingsAccount) accounts[i];
				savingsAccount.balance = savingsAccount.computeMonthlySavingsBalance();
			}

			if (accounts[i] instanceof CheckingAccount == true) {
				CheckingAccount checkingAccount = (CheckingAccount) accounts[i];
				checkingAccount.balance = checkingAccount.monthlyCheckingBalance();
			}
		}

		for (int i = 1; i <= 12; i++) {
			System.out.println(" After month: " + i);
			for (int j = 0; j < accounts.length; j++) {
				System.out.println(accounts[j]);
				if (accounts[j] instanceof SavingsAccount == true) {
					SavingsAccount savingsAccount = (SavingsAccount) accounts[j];
					savingsAccount.balance = savingsAccount.computeMonthlySavingsBalance();
				}

				if (accounts[j] instanceof CheckingAccount == true) {
					CheckingAccount checkingAccount = (CheckingAccount) accounts[j];
					checkingAccount.balance = checkingAccount.monthlyCheckingBalance();
				}
			}
			System.out.println();
		}
	}
}

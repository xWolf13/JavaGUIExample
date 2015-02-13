public class CheckingAccount extends Account {
	double monthlyFee = 12;
	double minBalance = 1500;

	public CheckingAccount(double bal, int actNum) {
		super(bal, actNum);
	}

	public double monthlyCheckingBalance() {
		if (this.balance < this.minBalance) {
			return balance - monthlyFee;
		} else {
			return balance;
		}
	}

	public String getAccountType() {
		return "CHECKING";
	}

	public static void main(String[] args) {
		CheckingAccount checkAcc2 = new CheckingAccount(3834, 42);
		
		if (checkAcc2.monthlyCheckingBalance() == 988) {
			System.out.println(true);
			
		} else {
			System.out.println(false);
			
		}

		CheckingAccount checkAcc = new CheckingAccount(3531, 42);
		if (checkAcc.monthlyCheckingBalance() == 2000) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		if (checkAcc.getAccountType().equals("CHECKING")) {
			System.out.println(true);
			
		} else {
			System.out.println(false);
		}
	}
}

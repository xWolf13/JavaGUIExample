public class SavingsAccount extends Account {
	double interestRate = 0.03;

	public SavingsAccount(double bal, int accNum) {
		super(bal, accNum);
	}

	public double computeMonthlySavingsBalance() {
		return this.balance + ((this.balance * this.interestRate) / 12);

	}

	public String getAccountType() {
		return "SAVINGS";
	}

	public static void main(String[] args) {
		SavingsAccount account = new SavingsAccount(2000, 43);
		if (account.getAccountType().equals("SAVINGS")) {
			System.out.println(true);
			
		} else {
			System.out.println(false);
			
		}
		if (account.computeMonthlySavingsBalance() == 2005) {
			System.out.println(true);
			
		} else {
			System.out.println(false);
			
		}
	}
}


public class AccountBalanceCalcAPP {

	public static void main(String[] args) {
		System.out.println("Welcome to the Account application");
		
		CheckingAccount ca = new CheckingAccount(1000,1);
		SavingsAccount sa = new SavingsAccount(1000,.01);
		
		System.out.println("Starting Balances");
		
		displayBalance(ca,sa);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		System.out.println("Enter the tranactions for them month");
		System.out.println();
		String action = Console.getString("Withdraw or Deposit? (w/d): ", "w", "d");
		String account = Console.getString("Account: Checking or Saving? (c/s): ", "c", "s");
		double amount = Console.getDouble("Amount? ", 0,99000);
		
		Account a;
		if (account.equalsIgnoreCase("c")) {
			a = ca;
		}
		else {
			a = sa;
		}
		if (action.equalsIgnoreCase("w")) {
			a.withdraw(amount);
		}
		else {
			a.deposit(amount);
		}
		choice = Console.getString("Continue? (y/n)", true);
		}
		
		displayFinal(ca,sa);
	}
	private static void displayBalance(CheckingAccount ca, SavingsAccount sa) {
		System.out.println("Checking: " + ca.getBalance());
		System.out.println("Saving: " + sa.getBalance());
	}
	private static void displayFinal(CheckingAccount ca, SavingsAccount sa) {
		ca.subtractMonthlyFee();
		sa.applyPaymentToBalance();
		System.out.println("Monthly Payments and Fees");
		System.out.println("Checking Fee: " + ca.getMonthlyFee());
		System.out.println("Savings interest payment:" + sa.getMonthlyInterestPayment());
	}

}

import java.text.NumberFormat;

public class Account implements Balanceable, Withdrawable, Depositable {

	protected double balance;
	
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) {
		balance -= amount;

	}

	@Override
	public void withdraw(double amount) {
		balance += amount;

	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void setBalance(double amount) {
		balance = amount;
	}
	public String displayBalance() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(balance);
	}
}

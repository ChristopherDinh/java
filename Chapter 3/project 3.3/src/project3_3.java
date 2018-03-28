import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class project3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Interest Calculator");
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		
		while (choice.equalsIgnoreCase("y")) {
		

			System.out.print("Enter loan amount: ");
			double loan = sc.nextDouble();
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			currency.setMaximumFractionDigits(2);

			System.out.print("Enter interest rate: ");
			double rate = sc.nextDouble();
			NumberFormat percent = NumberFormat.getPercentInstance();
			percent.setMaximumFractionDigits(3);

			BigDecimal interest = new BigDecimal(loan * rate);
			

			System.out.println("Loan Amount: " + currency.format(loan));
			System.out.println("Interest Rate: " + percent.format(rate));
			System.out.println("Interest Amount: " + currency.format(interest.doubleValue()));
			System.out.println("Continue? (y/n)");
			choice = sc.next();		

		}
		
	sc.close();
	}

}

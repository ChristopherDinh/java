import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class project4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Tip Calculator");

	


		String message = "";
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat percent = NumberFormat.getPercentInstance();
			System.out.print("Cost of Meal: ");
			Scanner sc = new Scanner(System.in);
			double cost = sc.nextDouble();
			for (double rate = .15; rate < .30; rate += .05) {
				BigDecimal tipAmount = new BigDecimal(rate * cost).setScale(2, RoundingMode.HALF_UP);
				double total = cost + tipAmount.doubleValue();
				message = percent.format(rate) + "\n" + "Tip Amount:  " + currency.format(tipAmount) + "\n"
						+ "Total Amount:   " + currency.format(total);
				
				System.out.println(message);
			}
			
			System.out.println("Continue? (y/n)");
			choice = sc.next();
			System.out.println();

		}
	}
}
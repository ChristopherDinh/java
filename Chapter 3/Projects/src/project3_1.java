import java.text.NumberFormat;
import java.util.Scanner;

public class project3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Tempature Coverter");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter degrees in Fahrenheit:");
			double f = sc.nextDouble();
			double c = (f - 32) * 5 / 9;

			NumberFormat number = NumberFormat.getNumberInstance();
			number.setMaximumFractionDigits(2);
			String cString = number.format(c);

			System.out.println("Degrees in Celsius: " + cString + "\n");

			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
	}
}

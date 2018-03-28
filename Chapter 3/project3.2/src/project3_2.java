import java.text.NumberFormat;
import java.util.Scanner;

public class project3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Travel Time Calculator");
		System.out.println();
		
		double min = 60;
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter Miles: ");
			double miles = sc.nextDouble();

			System.out.print("Enter MPH: ");
			double mph = sc.nextDouble();

			double time = miles * (1 / mph) * (min);
			int minutes = (int) (time % min);
			int hours = (int) (miles * (1 / mph));

			System.out.println("Estimated travel time");
			System.out.println("Hours: " + hours);
			System.out.println("Minutes: " + minutes);
			
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
	}	
}

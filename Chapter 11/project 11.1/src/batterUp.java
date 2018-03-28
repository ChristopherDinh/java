import java.text.NumberFormat;
import java.util.Scanner;

public class batterUp {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to the Batting Average Calculator");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			int bats = Console.getInt("Enter number of times at bat: ", 1, 30);
			System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = hommeeeerrrrr");

			int[] player = new int[bats];

			double average = 0;
			int counter = 0;
			int results = 0;
			double slugg = 0;
			double sum = 0;
			NumberFormat number = NumberFormat.getNumberInstance();
			number.setMaximumFractionDigits(3);
			for (int i = 0; i < bats; i++) {
				results = Console.getInt("Result for at bat " + (i + 1) + " :", 0, 4);
				if (results > 0) {
					counter += 1;
					sum += results;
				} else {
					counter += 0;
				}
				results = results + 1;
				average= (double) counter / (double) bats;
				slugg = sum / (double) bats;
			}	
				System.out.println("Batting average: " + number.format(average));
				System.out.println("Slugging percent: " + number.format(slugg));
			
			choice = (Console.getString("Another player? (y/n)", true));
		}
	}

}

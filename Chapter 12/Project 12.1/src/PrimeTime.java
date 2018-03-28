import java.util.ArrayList;

import ConsoleHelper.util.*;

public class PrimeTime {

	public static void main(String[] args) {
		System.out.println("Prime Number Checker");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int input = Console.getInt("Please enter an integer between 1 and 5000: ", 1, 5000);
			if (input%2 == 1 || input == 2) {
				System.out.println(input + " is a prime number.");
				
			}
			else {
				ArrayList<Integer> numbers = new ArrayList<>();
				for (int i = 1; i < input + 1; i++) {
					int remainder = input % i;
					if (remainder == 0) {
						numbers.add(i);
					}
					
					}
					
				
				System.out.println(input + " is a NOT prime number");
				System.out.println("It has " + numbers.size() + " factors: " + numbers);
			}
		choice = Console.getString("Would you like to continue? (y/n)", true);
		}
	}

}

import java.util.Scanner;

public class project4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the Factorial Calculator");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter an integer that's greater than 0 and less than 10: ");
			long number = sc.nextInt();
			long fact = 1;
			for (int i = 1; i <= number; ++i) {
				fact *= i;
			}
			System.out.println("The factorial of " + number + " is " + fact);
			
			System.out.print("Continue? (y/n) ");
			choice = sc.next();
			System.out.println();
			
		}
		sc.close();
		
	}
}

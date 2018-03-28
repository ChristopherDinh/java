import java.util.Scanner;

public class project5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		
		displayWelcome();
		int number = randomNumber();
		System.out.println(number);
		guessNumber(sc, number);
		}
		



	private static void displayWelcome() {
		System.out.println("Welcome to the Guessing Game");
		System.out.println();
	}
	public static int randomNumber() {
		System.out.println("I'm guessing a number between 1 and 100 ");
		double d = (Math.random() * 100) +1;
		int randomNumber = (int) d;
		return randomNumber;
	}

	public static int guessNumber(Scanner sc, int number) {
		boolean input = false;
		int a = 0;
		while (!input) {
			int guess = sc.nextInt();
			if (guess <= 0) {
				System.out.println("Invalid Number, not between 1 and 100");
				continue;
			} else if (guess >= 101) {
				System.out.println("Invalid Number, not between 1 and 100");
				continue;
			}
			if (guess < number && (number - guess >= 10)) {
				System.out.println("Way too Low");
				continue;
			} else if (guess < number) {
				System.out.println("too Low");
				continue;
			} else if (guess > number && (guess - number >= 10)) {
				System.out.println("Way too High");
				continue;
			} else if (guess > number) {
				System.out.println("too High");
				continue;
			} else  {
				System.out.println("Correct Number");
				input = true;
			} 
		a = guess;
		}
		return a;
	}
}


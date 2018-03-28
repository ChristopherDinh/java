package project5_3;

import java.util.Scanner;

public class project5_3redone {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		
		displayWelcome();
		int number = randomNumber();
		boolean correctGuess = false;
		while (!correctGuess) {
			int guess = getIntWithinRange(sc, "Enter number", 1, 100);
			int diff = guess - number;
			if (diff <= -10) {
				System.out.println("too low");
			}
			else
				System.out.println("too high");
		}
		
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
	private static int getInt(Scanner sc, String prompt) {
		int guessNumber = 0;
		boolean isVaild = false;
		while (!isVaild) {
			System.out.println(prompt);
			if (sc.hasNextInt()) {
				guessNumber = sc.nextInt();
				isVaild = true;
			}
			else {
				System.out.println("Error invalid interger");
				sc.nextLine();
			}
		}
		return guessNumber;
	}
	private static int getIntWithinRange (Scanner sc, String prompt, int max, int min) {
		int guessNumber = 0;
		boolean isVaild = false;
		while (!isVaild) {
			guessNumber = getInt(sc, prompt);
			if (guessNumber >= min)
				isVaild = true;
			else
				System.out.println("Error number must be greater than the " +(min+1));
				continue;
			if (guessNumber <= max)
				isVaild = true;
			else
				System.out.println("Error number must be less than the " +(max+1));
				continue;
		}
		return guessNumber;
	}
}

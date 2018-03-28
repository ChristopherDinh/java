package test;

import java.util.Scanner;

public class testi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Euler's Number Calculations");
		
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			double num = input(sc, "Please enter a number");
			double output = calc(num);
			System.out.println(output);
			System.out.println("Continue? (y/n)");
			choice = sc.next();
		}
		
	}

	public static double input (Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.println(prompt);
		if (sc.hasNextDouble()) {
			d = sc.nextDouble();
			isValid = true;
		}
		else {
			System.out.println("Error: Invalid Interger. Try again.");
		}
		sc.nextLine();
	}
		return d;
	}
	public static double calc (double input) {
		double e = 0;
		e = Math.pow(1 + (1/input),input);
		return e;
	}
	
	
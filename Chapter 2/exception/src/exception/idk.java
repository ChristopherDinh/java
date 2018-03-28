package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class idk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("exception");
		
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("enter an interger");
			
			try {
				int i = sc.nextInt();
				System.out.println(i);
			} 
			catch (InputMismatchException ime) {
				System.out.println(" Error! Invalid number. Try again. \n");
				sc.nextLine();
				continue;
			}
			
			System.out.println("Null Pointer");
			String s = null;
			System.out.println("Length of string: " s.length());
			System.out.println("Continue? (y/n)");
			choice = sc.next();
		}
		sc.close();
	}

}

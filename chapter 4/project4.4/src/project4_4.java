import java.util.Scanner;

public class project4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Greatest Common Divisor Finder");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter First Number: ");
			int x = sc.nextInt();
			System.out.println("Enter Second Number: ");
			int y = sc.nextInt();
			
			while (x != 0) {
				while (y >= x) {
					y -= x;
				}
				int z = y;
				y = x;
				x = z;
			}
			System.out.println("The greatest common denominator is " + y);
			System.out.println("Continue? (y/n)");
			choice = sc.next();
			System.out.println();
		}
	}
}

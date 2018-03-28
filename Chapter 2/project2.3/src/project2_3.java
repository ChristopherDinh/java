import java.util.Scanner;

public class project2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Welcome to the Area ad Perimeter Calculator");
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		while (choice.equalsIgnoreCase("y")) {

			System.out.print("Enter Width: ");
			double width = sc.nextInt();

			System.out.print("Enter Length: ");
			double length = sc.nextInt();

			double area = width * length;
			double perimeter = 2 * width + 2 * length;
			
			System.out.println("Area: " + area);
			System.out.println("Length: " + length);
			System.out.println();
			System.out.println("Continue? (y/n)");
			
			choice = sc.next();

		}
		sc.close();
	}

}

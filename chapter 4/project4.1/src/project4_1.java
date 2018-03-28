import java.util.Scanner;

public class project4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Table of Powers");
		Scanner sc = new Scanner(System.in);
		

		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter an Interger: ");
			int number = sc.nextInt();
			String table = "";
			String headerRow = "Number "+"Squared "+"Cubed";
			table += headerRow + "\n";
			
			for (int count=1; count <= number; count++) {
				int squared = (count * count);
				int cubed = (count * count * count);
				String row = count + "      " + squared + "     " + cubed;
				
			table += row + "\n";
			}
			System.out.println(table);
		
		System.out.println("Continue? (y/n): ");
		choice = sc.next();
		System.out.println();
				
		}
		sc.close();
	}

}
	
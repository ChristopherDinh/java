import java.util.Scanner;

public class projects {

	public static void main(String[] args) {
		System.out.println("Student Registration Form");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First Name? ");
		String first = sc.next();
		
		System.out.println("Last Name? ");
		String last = sc.next();
		
		System.out.println("Year of Birth? ");
		String year = sc.next();
		
		String message = "\n"
				+ first + " " + last + "\n"
				+ "Your registration is complete." + "\n"
				+ "Your Temporary Password is " + first + "*" + year;
		System.out.println(message);
		
		
		
		
		
		
		
		
		
	}

}

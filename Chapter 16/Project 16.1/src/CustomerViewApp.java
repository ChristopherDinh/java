import ConsoleHelper.util.Console;

public class CustomerViewApp {

	public static void main(String[] args) {
	System.out.println("Customer Viewer");
	
	
	String choice = "y";
	while (choice.equalsIgnoreCase("y")) {
		int input = Console.getInt("Enter a customer number: ");
		try {
		Customer c = CustomerDB.getCustomer(input);
		System.out.println(c.getNameAndAddress());
		}
		catch (NullPointerException e) {
			System.out.println("No customer found for number " + input);
		}
		choice = Console.getString("Display another customer? (y/n): ", true);
	}
	}

}


public class Customer extends Person {
	
	private String customerNumber;
	
	public Customer(String first, String last, String number) {
	        super(first, last);
	        customerNumber = number;
	    }

	public String getNumber() {
		return customerNumber;
	}

	public void setNumber(String number) {
		this.customerNumber = number;
	}
	
	@Override
	public String toString() {
		return "You have entered a new customer: \n" + super.toString() + "\n" + "Customer Number: " +  customerNumber;
	}


}

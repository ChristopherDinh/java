
public class Employee extends Person {
	
	private String ssn;
	
	public Employee(String first, String last, String ssn) {
		super(first, last);
		this.ssn = ssn;
	}

	public String getSsn() {
		return "xxx-xx-" + ssn.substring(5,9);
	}
	

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	@Override
	public String toString() {
		return "You have entered a new employee: \n" + super.toString() + "\n" + "ssn: " +  getSsn();
	}


}

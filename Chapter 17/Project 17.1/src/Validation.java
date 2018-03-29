
public class Validation {
	private String lineEnd;

	public Validation(String lineEnd) {
		this.lineEnd = lineEnd;
	}
	
	public Validation() {
		this.lineEnd = "\n";
	}

	public String isDouble(String value, String name) {
		String msg = "";
		try {
			Double.parseDouble(value);
		}
		catch (NumberFormatException e){
			msg = name + " must be valid number." +lineEnd;
		}
		return msg;
	}
	
}

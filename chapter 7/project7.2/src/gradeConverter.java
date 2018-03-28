
public class gradeConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Letter Grade Converter");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		int numGrade = Console.getInt("Enter numerical grade: ", 0, 101);
		Grade grade = new Grade(numGrade);
		System.out.println("Letter Grade = " + grade.getLetter());
		
		choice = Console.getString("Continue? (y/n): ", "y", "n");
		
		}
		System.out.println("K, Bye!");
	}

}

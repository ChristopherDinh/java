import ConsoleHelper.util.Console;

public class PigLatinTranslator {

	public static void main(String[] args) {
		System.out.println("Pig Latin Translator");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String input = Console.getString("Enter a line: ", true);
			String[] inputParts = input.split(" ");
			String vowels = "aeiou";
			String ending = "";
			String word = "";
			String output = "";
			int firstChar = 0;
			String beginning;
			
			for (int i = 0; i < inputParts.length; i++) {
				for (int j = 0; j < inputParts[i].length(); j++) {
					firstChar = vowels.indexOf(inputParts[i].charAt(0));
					if (firstChar > 0) {
						ending = "way";
						word = inputParts[i].substring(0);
						output += word + ending + " ";
					}
					int index  = inputParts[i].indexOf(vowels.charAt(j));
					if (index > 0) {
						beginning = inputParts[i].substring(0, index);
						ending = "ay";
						word = inputParts[i].substring(index);
						output = word + beginning + ending + " ";
					}
					
					System.out.println(output);
				}
				}
		}
	}
}
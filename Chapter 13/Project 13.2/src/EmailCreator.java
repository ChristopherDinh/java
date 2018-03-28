
public class EmailCreator {

	public static void main(String[] args) {
		System.out.println("Email Creator");
		String[] csv = {"   james   ,butler,jbutler@gmail.com",
                "Josephine,Darakjy,Josephine_Darakjy@darakjy.org",
                "ART,VENERE,ART@VENERE.ORG"};
		
		String firstName = "";
		String lastName = "";
		String email = "";
		for (int i = 0; i < csv.length; i++) {
			String[] csvSplit = csv[i].split(",");
			for (int j = 0; j < csvSplit.length; j += 3) {
				firstName = csvSplit[j];
				firstName = firstName.trim();
				firstName = firstName.toLowerCase();
				firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
			}
			for (int h = 1; h < csvSplit.length; h += 3) {
				lastName = csvSplit[h];
			}
			for (int g = 2; g < csvSplit.length; g += 3) {
				email = csvSplit[g];
				email = email.toLowerCase();
			}
				
			String template = 
				    "To:      " + email + "\n" +
				    "From:    noreply@deals.com\n" +
				    "Subject: Deals!\n\n" +
				    "Hi "+ firstName + ",\n\n" +
				    "We've got some great deals for you. Check our website! \n";
			System.out.println(template);
		}
	}

}

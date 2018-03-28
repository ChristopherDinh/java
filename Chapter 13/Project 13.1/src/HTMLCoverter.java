
public class HTMLCoverter {

	public static void main(String[] args) {
		System.out.println("HTML Coverter");
		String html = "<h1>Grocery List</h1>\n" +
	              "<ul>\n" +
	              "    <li>Eggs</li>\n" +
	              "    <li>Milk</li>\n" +
	              "    <li>Butter</li>\n" +
	              "</ul>";
		System.out.println("Input \n" + html);
		String[] output = html.split("\n ");
		System.out.println("Outcome: \n");
		for (int i = 0; i < output.length; i++) {
			output[i] = output[i].replace("<h1>","");
			output[i] = output[i].replace("</h1>","");
			output[i] = output[i].replace("<ul>","");
			output[i] = output[i].replace("<li>","*");
			output[i] = output[i].replace("</ul>","");
			output[i] = output[i].replace("</li>","");
			output[i] = output[i].trim();
			System.out.println(output[i]);
			}
		}
	}


import java.text.NumberFormat;

public class MonthSelectorApp {

    public static void main(String[] args) {
        System.out.println("Monthly Sales\n");
        
        String[] monthName = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Oct","Nov","Dec"};
        double[] monthSales = new double[12];
        for (int i = 0; i < monthSales.length; i++) {
        	monthSales[i] = Math.random() * 237744;
        	
        }
        
        // get currency formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // get one or more months
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            int monthNumber = Console.getInt("Enter month number: ");
            
            // validate input
            if (monthNumber < 1 || monthNumber > monthName.length) {
                Console.displayLine("Invalid month number. Try again.");
                continue;                
            }
            // get the index number for the month
            int monthIndex = monthNumber -1;
            
            // and display the month name and sales            
            System.out.println("Sales for " + monthName[monthIndex] +" : "+ currency.format(monthSales[monthNumber]));

            // check if the user wants to continue
            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        }
        
        // display the total sales for the year
        
        
        Console.displayLine();
    }    

}

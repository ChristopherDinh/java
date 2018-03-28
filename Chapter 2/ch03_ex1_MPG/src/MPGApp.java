import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class MPGApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Miles Per Gallon calculator");
        System.out.println();  // print a blank line
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter miles driven: ");
            String milesString = sc.next();
            
            System.out.print("Enter gallons of gas used: ");
            String gallonsString = sc.next();
            
            /*double mpg = miles/gallons;
            double mphRound = (double) Math.round(mpg *100) /100;
            
            NumberFormat mphRound = NumberFormat.getNumberInstance();
            mphRound.setMaximumFractionDigits(3);
            String mphString =mphRound.format(mpg);*/
            
            BigDecimal mpg = new BigDecimal (mphString);
            BigDecimal mpg = 
            
            System.out.println("Miles per gallon is " + mphString + ".");
            System.out.println(); 
            
            System.out.print("Calculate another MPG? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
    
}

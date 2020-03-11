/**
   Lab 4.
   
*/
import java.util.*;
import java.lang.*;
import java.text.*;

class Lab4Part2 {

   public static void main(String[] args) {
   
      // Scanner object
      Scanner scanner = new Scanner(System.in);
      // DecimalFormat
      DecimalFormat df = new DecimalFormat("0.000");
      
      // Declaring variables
      
      double Investment;
      int Principal; // dollars
      double Rate; // Interest rate
      int Number; // number of years
      
      System.out.print("Enter the number of dollars: ");
      Principal = scanner.nextInt();
      System.out.print("Enter the interest rate: ");
      Rate = scanner.nextDouble();
      System.out.print("Enter the number of years: ");
      Number = scanner.nextInt();
      
      System.out.println(); // blank space
      
      // Calculating the Investment
      Investment = Principal * Math.pow( (1 + (Rate/100)), Number); 
      
      System.out.println("The money earned after " + Number + " years is " + df.format(Investment));
      
   
   }

}

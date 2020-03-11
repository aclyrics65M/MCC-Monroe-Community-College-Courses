/**
   Project 1, Part 2
   Change.java
*/
import java.util.*;

class Change {

   public static void main(String[] args) {
      
      // Creating a Scanner object and declaring the variables   
      Scanner scanner = new Scanner(System.in);
      double productCost;
      double amountTendered;
      double change;
      
      System.out.println("Welcome to my Change maker.");
      
      // Prompt user to input the product Cost
      System.out.print("Please enter cost of product: $ ");
      productCost = scanner.nextDouble();
      System.out.print("Please enter amount tendered: $ ");
      amountTendered = scanner.nextDouble();
      
      // Check to see if amount paid is less than product cost
      while (amountTendered < productCost) {
         System.out.println("Error. Amount tendered should be greater than product cost.");
         System.out.print("Please enter amount tendered: $ ");
         amountTendered = scanner.nextDouble();
      }
      
      System.out.println(); // blank space
      
      // Calculate the change
      change = amountTendered - productCost;      
      double cents = change * 100;
      
      double oneDollar = 100;
      double quarter = 25;
      double dime = 10;
      double nickel = 5;
      double penny = 1;
      
      // Calculating the total number of one dollar bills, quarters
      // dimes, nickels, and pennies
      int totalOneDollar = (int) (cents / oneDollar);
      cents %= oneDollar;
      
      int totalQuarter = (int) (cents / quarter);
      cents %= quarter;

      int totalDime = (int) (cents / dime);
      cents %= dime;

      int totalNickel = (int) (cents / nickel);
      cents %= nickel;

      int totalPenny = (int) (cents / penny);
      cents %= penny;
         
      // Outputting the Final results
      System.out.println("Your change is: $ " + change);
      System.out.println(totalOneDollar + " one-dollar bills");
      System.out.println(totalQuarter + " quarters");
      System.out.println(totalDime + " dimes");
      System.out.println(totalNickel + " nickels");
      System.out.println(totalPenny + " pennies");
      
      System.out.println(); // blank space
      System.out.println("Thank you for your business!");
      
   
   } // End Main

} // End Class
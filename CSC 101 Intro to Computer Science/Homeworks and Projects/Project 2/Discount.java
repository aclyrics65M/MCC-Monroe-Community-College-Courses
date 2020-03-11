/*
   CSC 101: Intro to Computer Science
   Programming Assignment #2
   Program 2: Discount.java
*/

/*
   Your program is going to calculate the price of some bags of coffee.  
   You will first ask the user; how many bags of coffee do they want.   
   The price per bag is $5.50 each.  Your price must also include the shipping 
   of how many boxes this shipment will require.  There are three size shipping boxes available.  
   A large box can hold 20 bags, a medium box holds 10 bags, and a small box can hold up to 5 bags.  
   You cannot ship large or medium boxes that are not full. (but small ones can have 1-5 bags in them) 
   The price of shipping per box is large = $1.80, medium = $1.00, and small = $0.60 .  
   You also give a discount on the coffee for large quantities.  
*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class Discount {

   public static void main(String[] args) {
      
      // Welcome Statement
      System.out.println("Hello there! Welcome to the Java Discount program!");
      
      // Constant variables
      final double PRICE_PER_BAG       = 5.50;
      final double PRICE_PER_LARGEBOX  = 1.80;
      final double PRICE_PER_MEDIUMBOX = 1.00;
      final double PRICE_PER_SMALLBOX  = 0.60;
      
      // Variables
      double totalPrice; // The total overall price
      double totalCostOfBoxes; // Total cost of Boxes
      double totalCostOfBags; // Total cost of Bags
      double discountPrice; // The discount value
      double discountPercentage = 0; // Initialize discount percentage to 0.
      
      int numLargeBoxes; // The number of large boxes
      int numMediumBoxes; // The number of medium boxes
      int numSmallBoxes; // The number of small boxes
      int numberCoffeeBags; // The number of coffee bags
      
      // Create a Scanner and DecimalFormat object
      Scanner javaScanner = new Scanner(System.in);
      DecimalFormat javaDecimal = new DecimalFormat("0.00");
      
      
      // Prompt user to input the number of coffee bags
      System.out.print("Please enter the number of bags of coffee you wish to purchase: ");
      numberCoffeeBags = javaScanner.nextInt(); // The number of coffee bags
      
      // Check to see if input is correct
      while (numberCoffeeBags < 0) {
         System.out.println("Error! Number must be positive. Try again.");
         System.out.print("Please enter the number of bags of coffee you wish to purchase: ");
         numberCoffeeBags = javaScanner.nextInt();
      }
      
      // Determine the discount percentage:
      if (numberCoffeeBags >=0 && numberCoffeeBags <= 24) {
         discountPercentage = 0;
         
      } else if (numberCoffeeBags >= 25 && numberCoffeeBags <= 49) {
         discountPercentage = 5;
         
      } else if (numberCoffeeBags >= 50 && numberCoffeeBags <= 99) {
         discountPercentage = 10;
         
      } else if (numberCoffeeBags >= 100 && numberCoffeeBags <= 149) {
         discountPercentage = 15;
         
      } else if (numberCoffeeBags >= 150 && numberCoffeeBags <= 199) {
         discountPercentage = 20;
         
      } else if (numberCoffeeBags >= 200 && numberCoffeeBags <= 299) {
         discountPercentage = 25;
         
      } else if (numberCoffeeBags >= 300) {
         discountPercentage = 30;
      }
      
      // Calculate the total cost of Bags and Discounted Price
      totalCostOfBags = numberCoffeeBags * PRICE_PER_BAG;
      discountPrice = totalCostOfBags * (discountPercentage / 100); 
      
      // Calculating the number of large, medium, and small boxes.
      numLargeBoxes = (int) numberCoffeeBags / 20;
      numMediumBoxes = (int) (numberCoffeeBags % 20) / 10;
      
      // For small boxes use an if-else statement
      if (numberCoffeeBags % 10 <= 5) {
         numSmallBoxes = 1;
         
      } else if (numberCoffeeBags % 10 > 5) {
         numSmallBoxes = 2;
         
      } else {
         numSmallBoxes = 0;
      }
      
      // Calculating the total cost of boxes
      totalCostOfBoxes = (numLargeBoxes * PRICE_PER_LARGEBOX) + (numMediumBoxes * PRICE_PER_MEDIUMBOX) 
         + (numSmallBoxes * PRICE_PER_SMALLBOX);
         
      // Calculating the total overall price
      totalPrice = totalCostOfBags - discountPrice + totalCostOfBoxes;
      
      System.out.println(); // blank space
      System.out.println(); // blank space
      
      // Displaying the output
      System.out.println("Number of Bags Ordered:   " + numberCoffeeBags + "-" + "  $ " + javaDecimal.format(totalCostOfBags));
      System.out.println("            Discount:     " + (int) discountPercentage + "%-" + " $ " + javaDecimal.format(discountPrice));
      System.out.println(); // blank space
      System.out.println("     Boxes Used: ");
      System.out.println("               " + numLargeBoxes + " Large - " + "   $ " + javaDecimal.format(numLargeBoxes * PRICE_PER_LARGEBOX));
      System.out.println("               " + numMediumBoxes + " Medium - " + " $ " + javaDecimal.format(numMediumBoxes * PRICE_PER_MEDIUMBOX));
      System.out.println("               " + numSmallBoxes + " Small - " + "   $ " + javaDecimal.format(numSmallBoxes * PRICE_PER_SMALLBOX));
      System.out.println(); // blank space
      System.out.println("Your total charge is:   $ " + javaDecimal.format(totalPrice));
      
      // Goodbye statement
      System.out.println(); // blank space
      System.out.println("Thank you! Good bye!");
      
   } // End of Main class

} // End of Discount class

/*
   CSC 101: Intro to Computer Science
   Lab 7 Creation of Static Methods
   Part 1
*/
import java.util.Scanner;
import java.lang.Math;

public class Lab7Part1 {

   public static void main(String[] args) {
      
      // Create a scanner object
      Scanner javascanner = new Scanner(System.in);
      
      // Variables
      int numberOne;
      int numberTwo;
      boolean loopStatus = false;
      
      while(!loopStatus) {
      
         // Prompt user to input the two values
         System.out.print("Please enter the first integer value: ");
         numberOne = javascanner.nextInt();
         System.out.print("Please enter the second integer value: ");
         numberTwo = javascanner.nextInt();
         
         // Check to see if both values are equal to zero.
         if( (numberOne == 0) && (numberTwo == 0)) {
            System.out.println("Both input values are 0. The program is quitting!");
            // Reverse loopStatus to true to make statement false
            loopStatus = true;
         } else {
            // Output the final results using the static method
            System.out.println("The greater of the integers " + numberOne + " and " + numberTwo + " is " 
               + largerNumber(numberOne, numberTwo));
            System.out.println(); // blank space
         
         }
      }
      
      
   }
   
   // Static method
   // Question to ask, can an integer name be the same as the method name?
   // Like can I declare an integer largerNumber just like the method name?
   public static int largerNumber(int num1, int num2) {
      int greaterValue = 0;
      
      int absoluteValueA = Math.abs(num1);
      int absoluteValueB = Math.abs(num2);
      
      // If else statement
      if (absoluteValueA >= absoluteValueB) {
         greaterValue = absoluteValueA;
      
      } else if (absoluteValueB > absoluteValueA) {
         greaterValue = absoluteValueB;
         
      }
      
      // Return statement
      return greaterValue;
   
   
   }
  

}
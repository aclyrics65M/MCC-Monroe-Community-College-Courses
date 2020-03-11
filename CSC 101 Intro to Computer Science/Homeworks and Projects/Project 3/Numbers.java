/*
   Name: Faraz Mamaghani
   CSC 101: Intro to Computer Science
   Programming Assignment #3
   Program 3: Numbers.java
*/

/*
   Write two static functions that each take two integer parameters, 
   one that calculates and returns the least common multiple of those 
   two values and the other that calculates and returns the greatest common divisor 
   of the two.  The main method will ask the user for the two inputs and then 
   output the results from each method call.  The user also should be given 
   the option of inputting a new set of numbers.  The least common multiple 
   is the smallest value that both numbers divide into.  Such as the LCM(12,15) = 60.  
   Algorithm for calculating the LCM can be done easiest by calculating the greatest 
   common divisor first as there is a simple relationship between the two.  
   Calling the GCD method from inside the LCM method is required.  To calculate the GCD; 
   the Euclidean Algorithm can do this and is defined on many places on the web.  
   Do not use the recursive method from the book.  Do not copy directly from outside 
   source and do not look for an already made method in the JAVA API.
*/

import java.util.Scanner;
import java.lang.*;
//import java.lang.Math;

public class Numbers {

   public static void main(String[] args) {
   
      // Welcome Statement
      System.out.println("Hello there! Welcome to the Numbers Java Program!");
      
      // Create a scanner object
      Scanner readScanner = new Scanner(System.in);
      
      // Two integer variables
      int integerVariableOne;
      int integerVariableTwo;
      
      // Boolean variable for while loops 
      boolean runLoop = true;

      
      // While Loop
      while(runLoop == true) {
         // Second boolean loop 
         boolean secondLoop = true;
         
         // Prompt user to input the two integer variables
         System.out.print("Please enter the first integer: ");
         integerVariableOne = readScanner.nextInt();
         System.out.print("Please enter the second integer: ");
         integerVariableTwo = readScanner.nextInt();      
         System.out.println(); // blank space
         
         // Check to make sure both integers are not zero
         if (integerVariableOne == 0 || integerVariableTwo == 0) {
            System.out.println("The program is quitting!");
            runLoop = false;
            
         } else {
         
            // Output the final results
            System.out.println("The Least Common Multiple for " 
               + integerVariableOne + " and " + integerVariableTwo 
               + " is " + leastCommonMultiple(integerVariableOne, integerVariableTwo));
            System.out.println("The Greatest Common Divisor for "
               + integerVariableOne + " and " + integerVariableTwo
               + " is " + greatestCommonDivisor(integerVariableOne, integerVariableTwo));
         
            // Ask user if they would like to continue
            System.out.println(); // blank space
            System.out.print("Would you like to continue?(Press 0 to quit) ");
            int answer = readScanner.nextInt();
         
            while (secondLoop == true) {
                  
               if (answer == 0) {
                  System.out.println("The program is quitting!");
                  secondLoop = false;
                  runLoop = false;
               } else {
                  secondLoop = false;
                  System.out.println("The program will continue!");              
               }   

            }
         }
         System.out.println(); // blank space
            
      }

      
      // Goodbye Statement
      System.out.println("Thank you! Good bye!");
      
   
   } // End of Main class
   
   // Create two static methods. One for Least Common Multiple (LCM)
   // Another for Greatest Common Divisor (GCD)
   
   // Static method for Least Common Multiple (LCM)
   public static int leastCommonMultiple(int numberOne, int numberTwo) {
      
      // Create variable for LCM value
      int LCM_Value = 0;
      
      // Other variables
      int num;
      int max = 0;
      int min = 0;
      
      // If Loop to see which number is greater
      if (numberOne > numberTwo) {
         max = numberOne; // The first integer is the max
         min = numberTwo; // The second integer is the min
      } else if (numberTwo > numberOne) {
         max = numberTwo; // The second integer is the max
         min = numberOne; // The first integer is the min
      }
      
      // For Loop to determine the LCM
      for (int i = 1; i <= min; i++) {
         if ((max * i) % min == 0) {
         
            LCM_Value = i * max;
            break;
         }

      }
      
      // Return statement
      return LCM_Value;
   
   
   }
   
   
   // Static method for Greatest Common Divisor (GCD)
   public static int greatestCommonDivisor(int numberOne, int numberTwo) {
      
      // Create variable for GCD value
      int GCD_Value = 0;
      
      // Other variables
      int min = 0;
      
      // If Loop to determine the minimum value
      if (numberOne < numberTwo) {
         min = numberOne;
      } else {
         min = numberTwo;
      }
      
      // For loop to determine the greatest common divisor (GCD)
      for (int j = min; j > 0; j--) {
         
         if ( (numberOne % j == 0) && (numberTwo % j == 0)) {
            GCD_Value = j;
            break;
         }
      
      }
      
      // Return statement
      return GCD_Value;
   
   }


}
/*
   CSC 101: Intro to Computer Science
   Programming Assignment #2
   Program 4: Digits.java
*/

/*
   Your program will read in a value as an integer data type.  
   You will then report back to the screen; how many digits your 
   value has. For example, 23115 will report back that you have 
   5 digits. Your input must be read in as an integer and you must 
   use some kind of a loop to process the number of digits. Converting 
   to a string and then counting the size is too easy of a shortcut.  
   Allow the program to repeat (using a loop) until the user types 
   in a negative value.
*/
import java.util.Scanner;

public class Digits {

   public static void main(String[] args) {
      
      // Welcome Statement
      System.out.println("Hello there! Welcome to the Java Digits program!");
      
      // Creating a scanner object
      Scanner scanning = new Scanner(System.in);
      
      // Variables
      int numberValue; // number value to be inputted
      int digitCount = 0; // digit count value 
      boolean loopStatus = false; // initialize boolean loop status to false
      
      // While loop
      while(!loopStatus) {
         
         // Prompt user to input an integer under a while loop
         System.out.print("Please enter an integer value: ");
         numberValue = scanning.nextInt();
         int num = numberValue; // Create another variable num for evaluation
         
         // If integer input is negative
         if (num < 0) {
            System.out.println("The program is quitting!");
            loopStatus = true;
         
         // If integer input is 0   
         } else if (num == 0) {
            System.out.println("The number of digits in the integer " 
               + num + " is 0");
            System.out.println(); // blank space   
         
         // If integer is positive and therefore valid to resume      
         } else {
         
            // Counting the number of digits in the integer
            while (numberValue > 0) {
               numberValue /= 10;
               digitCount++; // increment the digit count   
            }
            
            // Outputting the final results
            System.out.println("The number of digits in the integer "
               + num + " is " + digitCount);
            System.out.println(); // blank space             
            
            digitCount = 0; // reset digitCount to zero
         }         
     }    
    
      System.out.println(); // blank space   
      System.out.println("Thank you! Good bye!"); 
        
   } // End of Main class

} // End of Digits class



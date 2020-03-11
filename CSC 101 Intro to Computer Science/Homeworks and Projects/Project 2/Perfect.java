/*
   CSC 101: Intro to Computer Science
   Programming Assignment #2
   Program 3: Perfect.java
*/

/*
   Your program will search for perfect numbers.  A perfect number is 
   defined as a number that equals the sum of its divisors.  Such as the number 6.  
   The values 1,2, and 3 are the only divisors of 6 and they sum up to 6.  
   Start by writing the code to pull out all of the divisors for a single number. 
   (Again use the modulus operator to find which numbers are divisors)  
   As you find them, print them to the screen and keep a running total (sum).  
   Test your final total with the original number to see if it is perfect.  
   Report to the screen if the number was perfect.  Put this entire code in a loop and 
   allow the user to try additional numbers until they decide they are done.  
   The user can input a negative value to signal that they are finished searching.  

*/

import java.util.Scanner;

public class Perfect {

   public static void main(String[] args) {
   
      System.out.println("Hello, welcome! This is known as the Perfect number finder for Java!");
      System.out.println(); // blank space
      
      // Create a Scanner object
      Scanner javaScanning = new Scanner(System.in);
      
      // Variables
      int number; // number variable
      int summation = 0; // summation variable initialized to 0
      
      // Prompt user to input the number
      System.out.print("Please enter a number: ");
      number = javaScanning.nextInt();
      
      System.out.println(); // blank space
      
      
      // Do-While loop
      do {

         

         // If statement for summation
         if (number > 0) {
         
            // Perfect divisiors statement
            System.out.println("Perfect divisors: ");
           // For loop
           for(int i = 1; i < number; i++) {
               if (number % i == 0) {
                  System.out.println(i); // Print out the factors
                  summation += i;
               }
         
            }
                     
            // Print out the summation
            System.out.println("The summation is: " + summation);
         }
         
         // If statement to check if the Number is a perfect number
         if (number == 0) {
            System.out.println("The number " + number + " is not a perfect number.");
            System.out.print("Please enter a number: ");
            number = javaScanning.nextInt();
                       
         } else if (summation == number) {
            System.out.println("The number " + number + " is a perfect number.");
            System.out.print("Please enter a number: ");
            number = javaScanning.nextInt();
             
         } else {
            System.out.println("The number " + number + " is not a perfect number.");
            System.out.print("Please enter a number: ");
            number = javaScanning.nextInt();
            
         }
         
         // Reset summation to zero
         summation = 0;
      
      } while (number >= 0); // End of Do-While loop
      
      System.out.println(); // blank space
      System.out.println("Thank you! Good bye!");
   
   } // End of Main class

} // End of Perfect class


/*
   CSC 101: Intro to Computer Science
   Programming Assignment #2
   Program 2: Prime.java
*/

/*
   Your program will search for prime numbers.  
   You will first ask the user for the range of values to search, 
   and use for loops to progress through all the numbers chosen.  
   Note to determine if a number is a prime number, you must check 
   to find out if there are any values besides 1 and itself that 
   divide into it evenly.  If any other numbers found then it is not prime.  
   To check if any number is divisible, use the modulus operator which gives 
   the value of the remainder of a division.  List off all prime numbers found 
   within a range given by the user.  Do not list off numbers that are not prime.  
   Also output at bottom the total number of primes from.
*/

import java.util.Scanner;

public class Prime {

   public static void main(String[] args) {
      
      // Welcome Statement
      System.out.println("Hello there! Welcome to the Java Prime program!");
      System.out.println(); // blank space
      
      // Create a scanner object
      Scanner scanner = new Scanner(System.in);
      
      // Variables
      int lowerNumberRange; // The lower number range
      int upperNumberRange; // The upper number range
      int numPerRow; // The number of prime numbers per row
      
      int currentPrime = 1; // Initialize current prime to 1
      int numberOfPrimes = 0; // Number of prime numbers
      int primeNum = 0; // Variable to check the status of prime number
      
      // Prompt user to input the lower and upper range values
      System.out.print("Please enter in the lower bound for my search: ");
      lowerNumberRange = scanner.nextInt();
      
      // Check to see if lower range value is positive.
      while(lowerNumberRange <= 1) {
         System.out.println("Error! The value entered must be greater than one!");
         System.out.print("Please enter in the lower bound for my search: ");
         lowerNumberRange = scanner.nextInt();
      } // End while
      
      System.out.print("Please enter in the upper bound for my search: ");
      upperNumberRange = scanner.nextInt();
      
      // Check to see if upper range value is greater than lower range value
      while(upperNumberRange <= lowerNumberRange) {
         System.out.println("Error! Upper range value must be greater than lower range value!");
         System.out.print("Please enter in the upper bound for my search: ");
         upperNumberRange = scanner.nextInt();
      } // End while
      
      System.out.print("Please enter in the number of primes per row to display: ");
      numPerRow = scanner.nextInt();
      
      // Check to see if the number of primes per row is positive
      while(numPerRow < 1) {
         System.out.println("Error! Number of primes per row must be at least one!");
         System.out.print("Please enter in the number of primes per row to display: ");
         numPerRow = scanner.nextInt();
      }
      
      System.out.println(); // Blank space
      System.out.println("Primes found: ");
      
      // For loop to search for prime numbers within range
      // Apply a Nested for loop
      for (int i = lowerNumberRange; i <= upperNumberRange; i++) {
         
         for (int j = 2; j < i; j++) {
            
            if (i % j == 0) {
               primeNum = 0;
               break;
               
            } else {
               primeNum = 1;
               
            }   
         
         }
         if (primeNum == 1) {
            numberOfPrimes++; // Increment the number of prime numbers
            System.out.print(i + " ");
            
            currentPrime++; // Increment the current prime number
            // If statement to add new row after amount per row
            if((currentPrime % numPerRow) == 1) {
               System.out.print("\n"); // Start on the next line
            } 
              
         }
      
      
      }
      
      System.out.println("\n"); // Two blank sapces
      System.out.println("There were " + numberOfPrimes + " primes found between " 
         + lowerNumberRange + " and " + upperNumberRange);
      
      System.out.println(); // blank space
      System.out.println("Thank you! Good bye!");
      
   } // End of Main class

} // End of Prime class
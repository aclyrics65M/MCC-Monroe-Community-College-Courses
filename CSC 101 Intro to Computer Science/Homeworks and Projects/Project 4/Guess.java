/*
   Name: Faraz Mamaghani
   CSC 101: Intro to Computer Science
   Programming Assignment #4
   Program 1: Guess.java
*/

/*
   This problem is not from the book, but it is based on chapter 8 information.  
   The program will randomly pick a number between one and ten.  
   Then it will ask the user to make a guess as to what the number is.  
   Their inputs should have try and catch blocks to protect from them entering 
   strings or values outside the range, forcing them to reenter.  Exceptions 
   should be thrown for all cases, illegal and legal but outside the range. 
   After each guess you will respond with a higher or lower (The direction that they need to go).  
   If there next guess is not higher or lower, again catch this error and tell them to try again. 
   The range of acceptable inputs changes based on past guesses. For example, if 
   they guess a 5 and the real answer is higher, any value 5 or below should 
   now throw an exception.  Continue until the number is finally guessed. 
   Exceptions should be thrown for every time that the user does not follow instructions.
*/

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class Guess {

   public static void main(String[] args) {
   
      // Welcome statement
      System.out.println("Hello there! Welcome to the Java Guess Program!");
      System.out.println(); // blank space
      
      // Create a scanner object and random object
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();
      
      // Create a random integer between one and ten
      int minimum = 1;
      int maximum = 10;
      int randomNumber = random.nextInt((maximum - minimum) + 1) + minimum;
      
      // Create a guessing number. Initialize it to zero.
      int guessingNumber = 0;
      int guessCount = 1; // Variable to count number of guesses
      boolean loop = true;
      
      // Prompt the user to guess the number between 1 and 10
      System.out.print("Guess a number between 1 and 10: ");
      
      // While loop
      while (loop == true) {
         
         // Try-catch statement
         try {
            
            guessingNumber = scanner.nextInt();
            
            
            // Check to make sure the number is between 1 and 10
            while (guessingNumber < minimum || guessingNumber > maximum) {
               System.out.println("Error! The number must be between " + minimum + " and " + maximum + "! ");
               System.out.print("Guess a number between " + minimum + " and " + maximum + ": ");
               guessingNumber = scanner.nextInt(); 
            }
            
            if (guessingNumber < randomNumber) {
               // set minimum to the guessing number if guess is lower than random number
               minimum = guessingNumber;
               System.out.println("The number is too low");
               System.out.print("Guess a number between " + minimum + " and " + maximum + ": ");
               guessCount++;
            
            } else if (guessingNumber > randomNumber) {
               // set maximum to the guessing number if guess is higher than random number
               maximum = guessingNumber; 
               System.out.println("The number is too high");
               System.out.print("Guess a number between " + minimum + " and " + maximum + ": ");
               guessCount++;
            
            } else if (guessingNumber == randomNumber) {
               System.out.println("Congratulations! You got the number right after " + guessCount + " guesses.");
               System.out.println("The random number is " + randomNumber + "!");
               loop = false;
            }
         

         } catch (InputMismatchException e) {
            System.out.println("Error! Please input an integer.");
            System.out.print("Guess a number between " + minimum + " and " + maximum + ": ");
            scanner.next();
         }
            
      }
      
      // Good bye statement
      System.out.println(); // blank space
      System.out.println("Thank you very much! Good bye!");
      
   } // End of Main class

} // End of Guess class
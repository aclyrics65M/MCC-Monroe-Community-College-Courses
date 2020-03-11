/*
   Name: Faraz Mamaghani
   CSC 101: Intro to Computer Science
   Programming Assignment #3
   Program 1: Fibonacci.java
*/

/*
   Using the formula from problem #21 on page 145, do the following:   
   Write a program that will output a list of Fibonacci numbers.  
   Start by asking the user how many values they would like outputted to the screen.  
   Create a static function that will return an integer value of a single Fibonacci number.  
   This static method should take an integer that represents which value in the sequence 
   we are computing and returns an integer of that value.  
   The formula will calculate this but you will have to cast it to be an integer.  
   Use a loop in the main to call that method repeatedly and output the results one 
   at a time until the numbers of values meets the list the user asked for. 
   Note: method does not output and only returns one value!
*/

import java.util.Scanner;
import java.lang.Math;

public class Fibonacci {

   public static void main(String[] args) {
      
      // Welcome Statement
      System.out.println("Hello there! Welcome to the Java Fibonacci Program!");
      System.out.println(); // blank space
      
      // Create a scanner object
      Scanner javaScanning = new Scanner(System.in);
      
      // Prompt user to enter the Nth value
      System.out.print("Please enter the Nth value: ");
      int nthValue = javaScanning.nextInt();
      System.out.println("The Nth value input is: " + nthValue);
      
      // Displaying the final output
      System.out.println(); // blank space
      System.out.println("Place No.     Number of Pairs");
      
      // For loop to display the Month Number and Number of Pairs
      for (int i = 0; i < nthValue; i++) {
         System.out.print(i+1);
         System.out.print("                   "); // Spaces in between
         System.out.println(fibonacciNumber(i+1));
      }
      
      // Goodbye Statement
      System.out.println(); // blank space
      System.out.println("Thank you! Good bye!");
      
   }  // End of Main class
   
   // Create a static method to calculate the fibonacci value for an integer
   public static int fibonacciNumber(int numberValue) {
      // Calculate the Nth Fibonacci number
      // Calculate fraction One and fraction Two
      double fractionOne = Math.pow( ((1 + Math.sqrt(5))/2),numberValue);
      double fractionTwo = Math.pow( ((1 - Math.sqrt(5))/2),numberValue);
      
      // Calculate the nth Fibonacci Number as an integer
      int nthFibonacciNumber = (int) ((1/Math.sqrt(5)) * (fractionOne - fractionTwo));      
      
      // Return statement
      return nthFibonacciNumber;
   
   } // End of fibonacci method 
      
} // End of Fibonacci class

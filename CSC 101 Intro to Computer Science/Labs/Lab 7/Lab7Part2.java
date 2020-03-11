/*
   CSC 101: Intro to Computer Science
   Lab 7 Creation of Static Methods
   Part 2
*/
import java.util.Scanner;
import java.lang.Math;

public class Lab7Part2 {

   public static void main(String[] args) {
   
      System.out.println("Hello World!");
      
      // Create a scanner object
      Scanner javaKeyboard = new Scanner(System.in);
      
      // Variables
      int valueOne;
      int valueTwo;
      boolean conditionStatus = false;
      

      // Create a while loop initializing the condition status to false
      while(!conditionStatus) {
         
         // Prompt user to input both values
         System.out.print("Please enter the first value: ");
         valueOne = javaKeyboard.nextInt();
         System.out.print("Please enter the second value: ");
         valueTwo = javaKeyboard.nextInt();
         
         // Check to see if both values are equal to zero
         if ( (valueOne == 0) && (valueTwo == 0) ) {
            System.out.println("Both input values are 0. The program is quitting!");
            // Reverse loopStatus to true to make statement false
            conditionStatus = true;            
         } else {
            System.out.println("The sum of the input values is: " + EstimateMath.estimateAdd(valueOne, valueTwo));
            System.out.println("The difference of the input values is: " + EstimateMath.estimateSubtract(valueOne, valueTwo));
            System.out.println(); // blank space
         }
      
      }
      
      
      
   }
   
   
}



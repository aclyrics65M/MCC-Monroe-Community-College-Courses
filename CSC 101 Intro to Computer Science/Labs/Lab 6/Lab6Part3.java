/*
   CSC 101: Intro to Computer Science
   Lab 6 loops
   Part 3: Question 21
*/

import java.util.Scanner;

class Lab6Part3 {

   public static void main(String[] args) {
      // Create a scanner object
      Scanner javaScanner = new Scanner(System.in);
      
      // Prompt user to input the number of outputs
      System.out.print("Please enter the number of outputs: ");
      int numberOutputs = javaScanner.nextInt();
   
      int firstValue = 1;
      int secondValue = 1;
      
      int fibonacciSum = firstValue + secondValue;
      
      // Recurrence relation
      // Fn = Fn-1 + Fn-2
      
      // Display first two values.
      System.out.println("F1 = " + firstValue);
      System.out.println("F2 = " + secondValue);
      
      // For loop
      int a = 1;
      int b = 2;
      
      for (int count = 3; count <= numberOutputs; count++) {
         System.out.println("F" + count + " = F" + b + " + F" + a + " = " + Integer.toString(secondValue) 
            + " + " + Integer.toString(firstValue) + " = " + fibonacciSum);
         // Assign second value to the first value.
         firstValue = secondValue;
         // Assign value of fibonacci sum to the second value.
         secondValue = fibonacciSum;
         fibonacciSum = firstValue + secondValue;
         a++;
         b++;
      }
      
   }


}
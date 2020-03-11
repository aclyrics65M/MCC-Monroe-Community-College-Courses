/*
   CSC 101: Intro to Computer Science
   Programming Assignment #1
   Program 1: Quadratic.java
*/

/*
   Write a program that will solve a quadratic equation of the form
   ax^2 + bx + c = 0 where a, b, and c are real numbers and are inputted
   by the user.
*/

import java.util.Scanner;
import java.text.DecimalFormat;

class Quadratic {

   public static void main(String[] args) {
      
      // Creating a Scanner object and DecimalFormat object
      Scanner scanner = new Scanner(System.in);
      DecimalFormat decimalForm = new DecimalFormat("0.00");
      
      // Declaring the variables
      double coefficientA;
      double coefficientB;
      double coefficientC;
      
      // Output introduction
      System.out.println("Welcome to my Quadratic solver.");
      System.out.println("I will solve equations of the form < A*x^2 + B*x + C = 0 > for the variable x.");
      System.out.println(); // blank space
      
      System.out.println("Please enter in the three coefficients in order of A, B and C.");
      System.out.println(); // blank space
      
      // Prompt user to input the three coefficient variables
      System.out.print("A: ");
      coefficientA = scanner.nextDouble();
      
      // Check to see if A is equal to zero
      if (coefficientA == 0) {
         System.out.println("Error! A is equal to zero! Input again!");
         System.out.print("A: ");
         coefficientA = scanner.nextDouble();
      }
      
      System.out.print("B: ");
      coefficientB = scanner.nextDouble();
      
      System.out.print("C: ");
      coefficientC = scanner.nextDouble();
      
      // Solving the Quadratic Equation Ax^2 + Bx + C.
      double discrim = Math.pow(coefficientB,2) - 4*coefficientA*coefficientC;
      
      // While loop to check if discriminant is less than zero
      while (discrim < 0) {
         System.out.println("Error! Discriminant is negative!");
         System.out.println("Please try again!");
         
         System.out.print("A: ");
         coefficientA = scanner.nextDouble();
         
         System.out.print("B: ");
         coefficientB = scanner.nextDouble(); 
         
         System.out.print("C: ");
         coefficientC = scanner.nextDouble(); 
         
         discrim = Math.pow(coefficientB,2) - 4*coefficientA*coefficientC;       
      }
      
      // Quadratic Equation solutions x1 and x2;
      double solution1 = ((-coefficientB) + Math.sqrt(discrim)) / (2 * coefficientA);
      double solution2 = ((-coefficientB) - Math.sqrt(discrim)) / (2 * coefficientA);
      
      System.out.println(); // blank space
      
      // Displaying the Output
      System.out.println("You have entered the Equation " + decimalForm.format(coefficientA) 
         + "x^2 + " + decimalForm.format(coefficientB) + "x + " + decimalForm.format(coefficientC) + " = 0");
      System.out.println("The solutions are: ");
      System.out.println("x = " + decimalForm.format(solution1));
      System.out.println("x = " + decimalForm.format(solution2));
      
      System.out.println(); // blank space
      System.out.println("Thank you for using my program!"); 
      
   
   } // End Main

} // End Class
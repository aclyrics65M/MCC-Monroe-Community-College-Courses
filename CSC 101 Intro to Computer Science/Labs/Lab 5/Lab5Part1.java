/**
* Lab 5 Part 1
* 
**/

import java.util.*;
import java.text.*;

public class Lab5Part1 {

   public static void main(String[] args) {
   
      // Create a scanner object
      Scanner javaScanner = new Scanner(System.in);
      int randomNumber;
      char letterGrade = ' ';
      
      // Prompt user to input a random number between 1 and 100
      System.out.print("Please enter a number from 1 to 100: ");
      randomNumber = javaScanner.nextInt();
      
      // Check to see if number is within 1 and 100
      while (randomNumber < 1 || randomNumber > 100) {
         System.out.print("Error! Number must be between 1 and 100! Enter again: ");
         randomNumber = javaScanner.nextInt();
      
      }
      
      // If Else statement for grade report.
      /**
      if (randomNumber >= 90) {
         letterGrade = 'A';
      } else if (randomNumber >= 80 && randomNumber < 90) {
         letterGrade = 'B';
      } else if (randomNumber >= 70 && randomNumber < 80) {
         letterGrade = 'C';
      } else if (randomNumber >= 60 && randomNumber < 70) {
         letterGrade = 'D';
      } else {
         letterGrade = 'F';
      }
      **/
      
      int numberConversion = randomNumber / 10;
      
      // Switch statement
      switch (numberConversion) {
         case 9:
              letterGrade = 'A';
              break;
         case 8:
              letterGrade = 'B';
              break;
         case 7:
              letterGrade = 'C';
              break;
         case 6:
              letterGrade = 'D';
              break;
         case 5:
              letterGrade = 'F';
              break;
         case 4:
              letterGrade = 'F';
              break;
         case 3:
              letterGrade = 'F';
              break;
         case 2:
              letterGrade = 'F';
              break;
         case 1:
              letterGrade = 'F';
              break;
         
      
      }
      
      System.out.println(); // blank space
      System.out.println("Number value entered: " + randomNumber);
      System.out.println("The letter grade is: " + letterGrade);
   
   
   }



}
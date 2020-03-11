/*
   CSC 101: Intro to Computer Science
   Lab 6 Loops
   Part 1: Question 6
*/

import java.util.Scanner;

class Lab6Part1 {

   public static void main(String[] args) {
      
      int value = 10;
      for (int i = 1; i <= 4; i++) { // Number of Rows
         for (int j = 1; j <= 10; j++) { // Number of Columns
            System.out.print(value + " ");
            value++; // increase the value by one
         
         }
         System.out.println("");
      
      }
      System.out.println(); // blank space
      System.out.println(); // blank space
      
      for (int i = 10; i < 50; i++) {
         System.out.print(i + " ");
         
         // Check to see if value has remainder of 9
         // To start on the next line     
         if ( (i % 10) == 9) {
            System.out.print("\n");
         } 
      
      } 
   
   }

}

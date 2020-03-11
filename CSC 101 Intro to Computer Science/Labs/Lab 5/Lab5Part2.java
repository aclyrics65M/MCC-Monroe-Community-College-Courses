/**
* Lab 5 Part 2
* 
**/

import java.util.*;
import java.text.*;

public class Lab5Part2 {

   public static void main(String[] args) {
      
      // Create a scanner object
      Scanner javaScanning = new Scanner(System.in);
      String leapYearStatus;
      int year;
      
      // Prompt user to input the year
      System.out.print("Please enter the year: ");
      year = javaScanning.nextInt();
      
      // Check to see if year entered is a leap year
      // divisible by 4
      if ( (year % 4 == 0) && (year % 100 != 0) ) {
         leapYearStatus = "The year is a leap year";
      } else if ( ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
         leapYearStatus = "The year is a leap year";
      } else {
         leapYearStatus = "The year is not a leap year";
      }
      
      System.out.println("Year entered: " + year);
      System.out.println(leapYearStatus);
          
   }
   
   
   
}
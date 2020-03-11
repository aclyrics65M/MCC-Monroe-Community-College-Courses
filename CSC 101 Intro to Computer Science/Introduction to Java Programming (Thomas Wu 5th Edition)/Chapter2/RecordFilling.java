/*
   Chapter 2 Sample Program: Input first and last names and display the
   name in the format of last name, first name
   File: Ch2RecordFiling.java
*/

import java.util.*;

class RecordFilling {

   public static void main(String[] args) {
   
      String firstName, lastName;
      
      Scanner scanner = new Scanner(System.in);
      System.out.print("Please enter your full name: ");
      
      firstName = scanner.next();
      lastName = scanner.next();
      
      System.out.println("Your medical record is filed under " + lastName + ", " + firstName + ".");
   
   }

}
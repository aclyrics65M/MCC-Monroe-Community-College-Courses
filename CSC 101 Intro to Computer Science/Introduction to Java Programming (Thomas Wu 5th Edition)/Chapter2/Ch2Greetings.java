/*
   Chapter 2 Sample Program:
   Reads a person's name and displays a greeting.
   File: Ch2Greetings.java
*/

import java.util.*;

class Ch2Greetings {

   public static void main(String[] args) {
      
      String firstName, lastName;
      
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("What is your name? ");
      
      firstName = scanner.next(); // accept characters up to but not including the first space
      lastName = scanner.next(); // wrting the next last name.
      
      System.out.println("Hi, " + firstName + " " + lastName + ". Nice to meet you.");
      
   }
   
}
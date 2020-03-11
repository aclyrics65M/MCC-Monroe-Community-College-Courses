/*
   Chapter 8 Sample class: Class to input age
   File: AgeInputVer1.java
*/

import java.util.*;

class AgeInputVer1 {
   
   private final static String DEFAULT_MESSAGE = "Your age: ";
      
   private Scanner javaScanner;
      
   public AgeInputVer1() {
      javaScanner = new Scanner(System.in);
      
   }
      
   public int getAge() {
      return getAge(DEFAULT_MESSAGE);
   }
      
   public int getAge(String prompt) {
      
      int age = 0;
      boolean keepGoing = true;

      while (keepGoing) {
         System.out.print(prompt);
         
         try {
         
            age = javaScanner.nextInt();
            keepGoing = false;
            
         } catch (InputMismatchException e) {
         
            javaScanner.next(); //remove the leftover garbage
         //from the input buffer
         System.out.println("Invalid Entry.Please enter digits only.");
         }
      }
      
      return age;
   }         
      
      
}
   
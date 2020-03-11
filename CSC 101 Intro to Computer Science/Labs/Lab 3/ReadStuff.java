/*
   Lab 3: I/O
   Input and Output Lab

*/

import java.util.*;

class ReadStuff {
   public static void main( String [ ] args) {
      
      Scanner scanner = new Scanner(System.in);
      
      // creating variables to store inputs
      int number;
      String word;
      
      System.out.print("Please input a number: ");
      number = scanner.nextInt();
      System.out.println(); // go to next line
      
      System.out.print("Please input a word: ");
      word = scanner.next();
      System.out.println(); // go to next line  
      
      System.out.println("You inputted number = " + number);
      System.out.println("And word = " + word);   
      
      System.out.println(15);
   } // end of main method
}// end of class ReadStuff


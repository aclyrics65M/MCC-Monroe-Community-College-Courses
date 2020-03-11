// Thomas Wu Chapter 9 Characters practice

import java.util.Scanner;
import java.io.*;

public class CharactersPractice {

   public static void main(String[] args) {
      System.out.println("Welcome to Chapter 9 Characters - Java Programming Practice!");
      System.out.println("\n"); // Two blank spaces
      
      // Create two characters
      char characterA, characterB = 'X';
      char charC = 'V';
      
      // Displaying the ASCII code
      System.out.println("ASCII code of character X is " + (int) 'X');
      System.out.println("Character with ASCII code 88 is " + (char) 88);
      System.out.println(); // blank space
      
      System.out.println("ASCII code of character V is " + (int) charC);
      System.out.println("Character with ASCII code 120 is " + (char) 120);
      System.out.println(); // blank space
      
      System.out.println("ASCII code of character A is " + (int) 'A');
      System.out.println("ASCII code of character a is " + (int) 'a');
   
   }

}
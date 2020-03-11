// Print out all the alphabet program

import java.util.Scanner;
import java.io.*;

public class JavaAlphabetProgram {

   public static void main(String[] args) {
      
      // Welcome statement
      System.out.println("Welcome to the Java Alphabet Program!");
      System.out.println(); // blank space
      
      double annualAverage = 0.10; 
      double sum = 0.0;
   
      char[] alphabet = new char[26];
      char[] alphabetLower = new char[26];
      char letter = 'A';
      char lowerLetter = 'a';
      
      // For loop
      for(int i = 0; i < alphabet.length; i++) {
         alphabet[i] = letter;
         letter++;
      }
      
      for(int i = 0; i < alphabetLower.length; i++) {
         alphabetLower[i] = lowerLetter;
         lowerLetter++;
      }
      
      // Print out the results
      System.out.print("Alphabet: ");
      for(int j = 0; j < alphabet.length; j++) {
         System.out.print(alphabet[j]);
      }
      System.out.println(); // blank space
      System.out.println(); // blank space
      
      // Print out in reverse
      
      System.out.print("Alphabet in Reverse: ");
      for(int k = alphabet.length - 1; k >= 0; k--) {
         System.out.print(alphabet[k]);
      }  
      
      System.out.println(); // blank space
      System.out.println("annualAverage: " + annualAverage);
      System.out.println("sum: " + sum);
      
   }

}

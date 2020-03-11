/*
   Name: Faraz Mamaghani
   CSC 101: Intro to Computer Science
   Programming Assignment #3
   Program 2: PickWord.java
*/

/*
   Write a program that will ask the user to input a phrase (multiple word sentence),
   and an integer value.  A static function will be created that takes the sentence 
   and integer as input parameters and returns a single word of that sentence.  
   If the integer was the number three, then the word returned would be the third word 
   in the sentence.  There should be some protections not allowing the integer to be 
   zero or negative and if it is higher than the number of words in the sentence, then 
   just return the last word.  The main will ask the user for the input and show the 
   output and will also give the user the choice to enter in new information.  
   This should repeat until the user says that they are done.  The static function 
   will not do any inputting or outputting, it simply finds the word and returns it 
   to the main as a string.  Do not use StringTokenizer to break up string and do not 
   use the split method from the String class.   
   You may assume each space in the input is the transition between words.

*/

import java.util.Scanner;
import java.lang.*;

public class PickWord {

   public static void main(String[] args) {
   
      // Welcome Statement
      System.out.println("Hello there! Welcome to the PickWord Java Program!");
      
      // Variables
      String inputString;
      int integerNumber;
      boolean loopStatus = true;
      
      // While loop
      while(loopStatus) {
         // Create a scanner object
         Scanner inputScan = new Scanner(System.in);
      
         // Prompt user to input a phrase
         System.out.print("Please input a phrase: ");
         inputString = inputScan.nextLine();
         
         // Prompt user to input an integer
         System.out.print("Please input an integer value: ");
         integerNumber = inputScan.nextInt();
         
         // Number of words in sentence
         int wordNumber = numberOfWords(inputString);
         
         // While loop to check if integer value is at least one
         while (integerNumber < 1) {
            System.out.println("Error! Integer value must be at least one.");
            System.out.print("Please input an integer value: ");
            integerNumber = inputScan.nextInt();
         }
         System.out.println(); // blank space
         
         // Display the final output
         System.out.println("Sentence input: " + inputString);
         System.out.println("Word choice input: " + fragmentOfSentence(inputString, integerNumber));
         System.out.println("The number of words in the sentence is: " + numberOfWords(inputString));
         System.out.println(); // blank space
         
         // Ask user to continue
         System.out.print("Would you like to continue?(N to quit) ");
         char answer = inputScan.next().charAt(0);
         
         if (answer == 'N' || answer == 'n') {
            System.out.println("The program is quitting!");
            loopStatus = false;
            
         } else if (answer != 'N' && answer != 'n') {
            System.out.println("The program will continue!");
         }
         
         
      }
      
      // Goodbye Statement
      System.out.println("Thank you! Goodbye!");
      
   
   
   }
   
   // Create a method that counts the number of words in a sentence
   public static int numberOfWords(String sentence) {
      // Create a variable for word count
      int wordCount = 1; // Initialize with a value of 1
      
      // for loop
      for (int i = 0; i < sentence.length(); i++) {
         if (sentence.charAt(i) == ' ' && sentence.charAt(i+1) != ' ') {
            wordCount++; // Increment the count of the word
         }
      
      }
      
      // return statement
      return wordCount;
   }
   
   
   
   // Create a static method with sentence and integer
   // as input parameters
   public static String fragmentOfSentence(String sentence, int numericalValue) {
      
      // Create a variable wordFragment
      String wordFragment;
      
      // Variable for keeping track of words
      int wordCount = 1;
      
      // Location of first and last segment of word choice
      int firstLetterLocation;
      int finalLetterLocation;
      
      // Extra variable for initial count for any initial spaces
      int initializeCount = 0;
      
      // Find first Letter in sentence
      // This while loop ignores any extra spaces before the first word
      while (sentence.charAt(initializeCount) == ' ') {
         initializeCount++; // Increment the value of initialize count 
      }
           
      // Location of first letter of first word 
      int firstWordLocation = initializeCount;
      
    
      // Variable for number of spaces and starting place of word
      // After initial spaces are ignored
      int numberOfSpaces = 0;
      
      // Two new variables to find the word choice
      // Between first space and second space
      int firstSpace = 0;
      int secondSpace = 0;
      
            
      // For loop of sentence to find first space
      for (int index = firstWordLocation; index < sentence.length() && wordCount < numericalValue; index++) {
         
         if(sentence.charAt(index) == ' ' && sentence.charAt(index + 1) != ' ') {
            wordCount++; // increment the word count
            firstSpace = index + 1; 
         }
         
      }
      
      // For loop of sentence to find second space
      for (int index = firstSpace; index < sentence.length() && secondSpace == 0; index++) {
         
         if(index == sentence.length() -1) {
            secondSpace = index + 1;
            
         } else if(sentence.charAt(index) == ' ') {
            secondSpace = index;
         } 
         
      }
      
      // Assigning the location of the spaces to the letter locations
      firstLetterLocation = firstSpace;
      finalLetterLocation = secondSpace;

      // Identifying the word fragment         
      wordFragment = sentence.substring(firstLetterLocation, finalLetterLocation);


      // Return statement
      return wordFragment;
   }



}
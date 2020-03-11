// Lab 13 Part 2
/*
   2)	Write a program that does basic encrypting of text.  You will ask the user
   the filename of a text file which contains a few sentences of text.  You will
   read this text file one character at a time, and change each letter to another
   one and write out to an output file.  The conversion should be done a -> b, 
   b->c , … z->a, A->B, B->C, …. Z->A.  This means just shift each letter by one,
   but Z goes back to A. 

   Example:  	Hello  		converts to 		Ifmmp
   All other punctuation and spaces or symbols can stay as they are.  

   If you have time you could write the reverse program that would take your encrypted
   file as the input and get back the original message
   
*/

import java.util.Scanner;
import java.lang.StringBuilder;
import java.io.*;

public class BasicEncryptionText {

   // Caesar Cipher Method
   public static String caesarCipher(String javaString, int numberShift) {
      // Convert the string to char array
      char[] bufferArray = javaString.toCharArray();
      
      // Loop over characters
      for (int i = 0; i < bufferArray.length; i++) {
         // Shift letter, moving back or forth 26 places if needed
         char javaLetter = bufferArray[i];
         javaLetter = (char) (javaLetter + numberShift);
         
         if (javaLetter > 'z') {
            javaLetter = (char) (javaLetter - 26);
         } else if (javaLetter < 'a') {
            javaLetter = (char) (javaLetter + 26);
         }
         
         bufferArray[i] = javaLetter;
         
      }
      
      // Return final string
      return new String(bufferArray);
      
   }
   
   // Method to shift all letters one location
   public static String shiftLetters(String javaString) {
      // Create a new StringBuilder class
      StringBuilder javaFinalString = new StringBuilder();
   
      // For loop to convert string
      for(int j = 0; j < javaString.length(); j++) {
         char javaLetter = javaString.charAt(j);
      
         // If statement to check if index contains a letter
         if (javaLetter >= 'a' && javaLetter <= 'z' ||
             javaLetter >= 'A' && javaLetter <= 'Z') {
            // Create the new String with all letters shifted
            javaFinalString.append((char) (javaLetter + 1));
            
         } else {
            javaFinalString.append(javaLetter);
         }
         
      }
      
      // Return statement
      return javaFinalString.toString();
      
   }
   
   // Method to Reverse the Phrase back to Original
   public static String reverseShiftLetters(String jString) {
      // Create a new StringBuilder class
      StringBuilder reverseFinalString = new StringBuilder();
      
      // For loop to convert string
      for(int k = 0; k < jString.length(); k++) {
         char reverseLetter = jString.charAt(k);
         
         // If statement to check if index contains a letter
         if (reverseLetter >= 'a' && reverseLetter <= 'z' ||
             reverseLetter >= 'A' && reverseLetter <= 'Z') {
            // Create the new String with all letters shifted
            reverseFinalString.append((char) (reverseLetter - 1));
                
         } else {
            reverseFinalString.append(reverseLetter);
         }
      }
      
      // Return statement
      return reverseFinalString.toString();
   }
   
   public static void main(String[] args) throws IOException {
      
      System.out.println("Hello there! Welcome to the Java Encryption Text Program!");
      System.out.println(); // blank space
      
      // Create a Scanner object
      Scanner objectScanner = new Scanner(System.in);
      
      // Prompt user to enter a filename
      System.out.print("Please enter the name of a file to encrypt: ");
      String fileName = objectScanner.nextLine();
      String javaTextName = fileName + ".txt";
      
      // Prompt user to enter the output filename
      System.out.print("Please enter the name of the output file: ");
      String outputFile = objectScanner.nextLine();
      String outputFileName = outputFile + ".txt";
      
      // Create a file version of the string and a FileReader to read that particular file
      File javaFile = new File(javaTextName);
      FileReader javaFileReader = new FileReader(javaFile);
      
      // Create a BufferedReader
      BufferedReader javaBufferedReader = new BufferedReader(javaFileReader);
      
      
      // Create a file version of the output file
      File javaOutputFile = new File(outputFileName);
      FileOutputStream javaOutputStream = new FileOutputStream(javaOutputFile);
      PrintWriter javaPrint = new PrintWriter(javaOutputStream);
      
      
      // Method readLine to read the first string of the file
      String javaString = javaBufferedReader.readLine();
      String jFinalString = shiftLetters(javaString);
      String reverseString = reverseShiftLetters(jFinalString);
      
      // Displaying the results in the output file
      javaPrint.println("Original String: " + javaString);
      javaPrint.println(); // blank space
      javaPrint.println("New Final String: " + jFinalString);
      javaPrint.println(); // blank space
      javaPrint.println("Reversed String to Original: " + reverseString);
      
      // Close the Stream
      javaPrint.close();
      
      System.out.println("Original String: " + javaString);
      System.out.println(); // blank space
      System.out.println("New Final String: " + jFinalString);
      System.out.println(); // blank space
      
      // Reverse it back to the original
      System.out.println("Reversed String to Original: " + reverseString);
      
     
   }

}
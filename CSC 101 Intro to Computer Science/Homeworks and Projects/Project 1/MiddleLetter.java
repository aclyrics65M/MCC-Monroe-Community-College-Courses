/**
   Project 1, Part 3
   MiddleLetter.java
*/

/**
   Using the methods from the String class, report back to the user the following:  
   length of string, substring of original with first and last letter missing,
   the location of the first letter ‘e’, and the middle letter of string 
   (if length is even use the first of two middle values).  
*/

import java.util.*;

class MiddleLetter {

   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      String sentence;
      
      // Prompt user to input the string
      System.out.print("Please enter the string: ");
      sentence = scanner.nextLine();
      
      // Length of the string
      int stringLength = sentence.length();
      
      // Substring of original with first and last letter missing
      String subSentence = sentence.substring(1, stringLength - 1);
         
      // Location of the first letter 'e'
      int firstLetterE = 0;
      for (int i = 0; i < sentence.length(); i++) {
         firstLetterE = sentence.indexOf('e');
      }
      
      // Obtaining the middle character of a string
      int middleLetterValue = ((stringLength - 1) / 2);
      int middleLetterValuePlus = (middleLetterValue + 1);
      
      String middleCharacter = sentence.substring(middleLetterValue, middleLetterValuePlus);
            
      // Displaying the output
      System.out.println("The length of the string is: " + stringLength);
      System.out.println("Substring of original with first and last letter missing: " + subSentence);
      System.out.println("Location of the first letter E: " + (firstLetterE + 1));
      System.out.println("The middle letter of the string: " + middleCharacter);
      
   } // End Main

} // End Class

// Note: Checked with Tara Hagen
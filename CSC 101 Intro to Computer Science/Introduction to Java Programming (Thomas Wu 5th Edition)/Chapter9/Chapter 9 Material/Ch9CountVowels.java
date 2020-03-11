// Java program for counting the number of vowels
/*
   Chapter 9 Sample Program: Count the number of vowels
      in a given string
      File: Ch9CountVowels.java
*/

import java.util.*;

class Ch9CountVowels {

   public static void main(String[] args) {
   
      Scanner javaScanner = new Scanner(System.in);
      javaScanner.useDelimiter(System.getProperty("line.separator"));
      
      String name;
      
      int numberOfCharacters = 0;
      int vowelCount = 0;
      int consonantCount;
      int spaceCount = 0;
      
      char letter;
      
      System.out.print("What is your name? ");
      name = javaScanner.next(); // next() method for string
      
      numberOfCharacters = name.length(); // length() for string
      
      for (int i = 0; i < numberOfCharacters; i++) {
         letter = name.charAt(i);
         
         // if statement
         if (letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E'
            || letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O'
            || letter == 'u' || letter == 'U') {
            
            // Increment the vowel count
            vowelCount++;   
            
         } else if (letter == ' ') {
            // Increment the space count
            spaceCount++;
         }
      
      }
      
      // Calculate the number of consonants
      consonantCount = numberOfCharacters - spaceCount - vowelCount;
      
      // Display the final output
      System.out.println(name + ", your name has " + vowelCount + " vowels and " + consonantCount + " consonants");
      
   
   }


}

/*
   Chapter 9 Sample Program: Count the number of vowels
   in a given string using toUpperCase
   File: Ch9CountVowels2.java
*/
import java.util.*;

class Ch9CountVowels2 {
   
   public static void main (String[] args) {
   
      Scanner scanner = new Scanner(System.in);
      
      scanner.useDelimiter(System.getProperty("line.separator"));
      String name, nameUpper;
      
      int numberOfCharacters,vowelCount = 0;
      
      char letter;
      
      System.out.print("What is your name? ");
      name = scanner.next( );
      
      numberOfCharacters = name.length( );
      nameUpper = name.toUpperCase( ); // toUpperCase() method converts all characters to upper case. 
      
      for (int i = 0; i < numberOfCharacters; i++) {
         letter = nameUpper.charAt(i);
         
         if (letter == 'A' || letter == 'E' || letter == 'I' ||
            letter == 'O' || letter == 'U' ) {
            vowelCount++;
         }
      }
      
      System.out.println(name + ", your name has " + vowelCount + " vowels");
     
   }
      
}
/**
   Lab 4.
*/
import java.util.*;
import java.lang.*;

class Lab4 {

   public static void main(String[] args) {
         
      Scanner scanner = new Scanner(System.in);
      
      // Prompt user to input a string
      System.out.print("Enter the sentence: ");
      String sentence = scanner.nextLine();
      String fragment1, fragment2;
      
      int exclamationIndex = sentence.indexOf("!");
      int sentenceSize = sentence.length();
      
      fragment1 = sentence.substring(0,exclamationIndex);
      fragment2 = sentence.substring(exclamationIndex+1, sentenceSize);
      
      System.out.println(fragment1);
      System.out.println(fragment2);
      
   }

}
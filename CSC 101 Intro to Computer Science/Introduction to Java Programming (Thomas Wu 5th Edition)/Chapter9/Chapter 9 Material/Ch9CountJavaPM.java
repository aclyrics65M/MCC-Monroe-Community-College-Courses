/*
   Chapter 9 Sample Program:
   Count the number of times the word 'java' occurs
   in input sentence using pattern matching.
   File: Ch9CountJavaPM.java
*/

import java.util.*;
import java.util.regex.*;

class Ch9CountJavaPM {
   
   public static void main (String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      scanner.useDelimiter(System.getProperty("line.separator"));
      String document;
      int javaCount;
      
      Matcher matcher;
      Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
      
      System.out.println("Please enter a sentence: ");
      document = scanner.next();

      javaCount = 0;
      matcher = pattern.matcher(document);
      
      while (matcher.find()) {
         javaCount++;
      }
      
      System.out.println("The word 'java' occurred " + javaCount + " times.");
      
   }
      
}
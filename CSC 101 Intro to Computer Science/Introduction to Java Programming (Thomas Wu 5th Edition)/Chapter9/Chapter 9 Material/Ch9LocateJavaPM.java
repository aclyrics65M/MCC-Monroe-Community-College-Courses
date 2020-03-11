/*
   Chapter 9 Sample Program:
      Displays the positions of the word 'java'
      in a given string using pattern-matching technique.
   File: Ch9LocateJavaPM.java
*/

import javax.swing.*;
import java.util.regex.*;
import java.util.Scanner;

class Ch9LocateJavaPM {

   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      scanner.useDelimiter(System.getProperty("line.separator"));
      
      String document;
      Matcher matcher;
      Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
      
      System.out.println("Sentence: ");
      document = scanner.next();
      
      matcher = pattern.matcher(document);
      
      while (matcher.find()) {
         System.out.println(document.substring(matcher.start(), matcher.end()) + " found at position " + matcher.start());
      }      
      
   
   }

}
// String practice Chapter 9 Thomas Wu Java Programming

import java.util.Scanner;
import java.io.*;

public class StringPractice {
   
   public static void main(String[] args) {
      System.out.println("Welcome to Chapter 9 Characters/String - Java Programming Practice!");
      System.out.println(); // blank space
      
      String Str = new String("Welcome to Tutorialspoint.com");

      System.out.print("Return Value :" );
      System.out.println(Str.substring(10, 15) );
      System.out.println(); // blank space
      
      String javaName = "Lance McVeigh";
      int stringSize = javaName.length(); // Length of the string
      
      for(int i = 0; i < stringSize; i++) {
         System.out.println(javaName.charAt(i));
      }
      System.out.println(); // blank space
      
      // Create two new Strings
      String stringA = new String("Java String");
      String stringB = new String("Java String");
      
      //stringA = "Java String";
      //stringB = "Java String";
      
      System.out.println(stringA);
      System.out.println(stringB);
      System.out.println(); // blank space
      System.out.println("equals() method is " + stringA.equals(stringB));
      System.out.println("== operator is " + (stringA == stringB));
      
   }



}
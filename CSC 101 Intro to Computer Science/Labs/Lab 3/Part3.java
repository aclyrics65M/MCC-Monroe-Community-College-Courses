/*
   Part Three of Java Lab 3 program

*/

import java.util.Scanner;
import java.text.DecimalFormat;

class Part3 {

   public static void main(String[] args) {
   
      Scanner scanner = new Scanner(System.in);
      int integer1, integer2;
      
      System.out.println("Hello. This is a welcome message!");
      
      // Prompt user to input the two integers.
      System.out.print("Enter the first integer: ");
      integer1 = scanner.nextInt();
      System.out.print("Enter the second integer: ");
      integer2 = scanner.nextInt();
      
      // Outputting the integers
      System.out.println(integer1 + "   " + integer2);
      System.out.println(integer1 + integer2);
   
   }


}
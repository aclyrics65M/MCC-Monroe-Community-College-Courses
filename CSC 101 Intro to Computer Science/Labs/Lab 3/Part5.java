/*
   Part 5 of Java Lab 3 program
*/


import java.util.Scanner;
import java.text.DecimalFormat;

class Part5 {

   public static void main(String[] args) {
   
      double number1, number2;
      
      Scanner javaScanning = new Scanner(System.in);
      DecimalFormat decimalForm = new DecimalFormat("0.000");
      
      
      // Prompt user to input the two decimal numbers
      System.out.print("Enter the first decimal number: ");
      number1 = javaScanning.nextDouble();
      System.out.print("Enter the second decimal number: ");
      number2 = javaScanning.nextDouble();
      
      System.out.println( decimalForm.format(number1 / number2));
   
   }

}
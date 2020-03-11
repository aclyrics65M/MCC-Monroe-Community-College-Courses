/*
   Lab 10: Arrays
   Part 1
*/

import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.*;

public class ArraysPart1 {

   public static void main(String[] args) {
      // Hello statement
      System.out.println("Hello! Welcome to Java Arrays!");
      System.out.println(); // blank space
      
      Scanner systemScanner = new Scanner(System.in);
      DecimalFormat javaDecm = new DecimalFormat("0.000");
      int numberValues;
      
      // Prompt user to display how many values they are asking for
      System.out.print("Enter the number of values: ");
      numberValues = systemScanner.nextInt();
      
      // Create an array with number of values
      double[] javaArray = new double[numberValues];
      
      for(int value = 0; value < javaArray.length; value++) {
         System.out.print("Enter value" + (value+1) + ": ");
         javaArray[value] = systemScanner.nextDouble();
      }
      
      // Calculate the average
      double totalSum = 0;
      
      for (int i = 0; i < javaArray.length; i++) {
         totalSum += javaArray[i];
      }
      
      double arrayAverage = totalSum / javaArray.length;
      
      // Calculate the deviation
      double deviationSummation = 0;
      
      for (int j = 0; j < numberValues; j++) {
         javaArray[j] = (Math.pow((javaArray[j] - arrayAverage), 2));
      }
      
      for (int m = 0; m < numberValues; m++) {
         deviationSummation += javaArray[m];
      }
      
      // Calculate the variance and standard deviation
      double variance = (deviationSummation / numberValues);
      double standardDeviation = Math.sqrt(variance);
      
      // Display the final output
      System.out.println("The Mean is " + arrayAverage);
      System.out.println("The Standard Deviation is " + javaDecm.format(standardDeviation));
      
   }

}
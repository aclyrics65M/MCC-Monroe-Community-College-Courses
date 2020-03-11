/*
   Chapter 10 Sample Program: Compute the annual average rainfall
   and the variation from monthly average.
   File: Ch10Rainfall.java
*/

import java.util.*;

public class Ch10RainFall {

   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      
      // Create a double array RainFall
      double[] RainFall = new double[12];
      double annualAverage, sum, difference;
      
      sum = 0.0;
      
      for (int i = 0; i < 12; i++) {
         System.out.print("Rainfall for month " + (i+1) + ": ");
         RainFall[i] = scanner.nextDouble();
         sum += RainFall[i];
      
      }
      
      annualAverage = sum / 12.0;
      
      System.out.format("Annual Average Rainfall:%5.2f\n\n", annualAverage);
      
      for (int i = 0; i < 12; i++) {
         System.out.format("%3d", i+1); //month #
         
         //average rainfall for the month
         System.out.format("%15.2f", RainFall[i]);
         
         //difference between the monthly and annual averages
         difference = Math.abs(RainFall[i] - annualAverage);
         System.out.format("%15.2f\n", difference);
      }      
      
   }

}


/**
* Lab 5 Part 3
* 
**/

import java.util.*;
import java.text.*;

public class Lab5Part3 {

   public static void main(String[] args) {
   
      final double hourlyWage = 7.25;
      
      double commissionPercent = 0;
      int numberHours;
      int overtimeHours = 0;
      
      double overtimeWage;
      double totalSales;
      double totalWage;
      
      // Create a scanner object
      Scanner scanner = new Scanner(System.in);
      DecimalFormat adf = new DecimalFormat("0.00");
      
      // Prompt user to input the number of hours
      System.out.print("Please enter number of hours worked: ");
      numberHours = scanner.nextInt();
      System.out.print("Please enter the total sales: ");
      totalSales = scanner.nextDouble();
      
      if (numberHours > 40) {
         overtimeHours = numberHours - 40; 
      }
      
      
      // Check to see if total sales is valid
      while (totalSales < 1.00) {
         System.out.print("Error! Total sales must be positive. Enter again: ");
         totalSales = scanner.nextDouble();
      }
      
      // If else statement
      if (totalSales >= 1.00 && totalSales <= 99.99) {
         commissionPercent = 5;
      } else if (totalSales >= 100.00 && totalSales <= 299.99) {
         commissionPercent = 10;
      } else if (totalSales >= 300.00) {
         commissionPercent = 15;
      }
      
      // Computing the total wage
      // Sales commission
      double commissionReceived = totalSales * (commissionPercent / 100);
      double salaryReceived = (numberHours - overtimeHours) * hourlyWage;
      overtimeWage = overtimeHours * (1.5 * hourlyWage);
      
      totalWage = commissionReceived + salaryReceived + overtimeWage;
      
      // Outputting the final results
      System.out.println(); // blank space40
      System.out.println("The number of hours entered: " + numberHours);
      System.out.println("The number of overtime hours worked: " + overtimeHours);
      System.out.println("The total sales entered: " + adf.format(totalSales));
      System.out.println("The total wage is : " + adf.format(totalWage));
         
   
   
   }
   
   
}      
   
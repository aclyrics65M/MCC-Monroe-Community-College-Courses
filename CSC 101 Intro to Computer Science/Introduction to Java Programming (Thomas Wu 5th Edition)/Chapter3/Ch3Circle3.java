/*
   Chapter 3 Sample Program: Compute Area and Circumference
   File: Ch3Circle3.java
*/

import java.text.*;

class Ch3Circle3 {
   public static void main(String[] args) {
      
      final double PI = 3.14159;
      final String TAB = "\t";
      final String NEWLINE = "\n";
      
      double radius, area, circumference;
      DecimalFormat df = new DecimalFormat("0.000");
      radius = 2.35;

      //compute the area and circumference
      area = PI * radius * radius;
      circumference = 2.0 * PI * radius;
      
      //Display the results
      System.out.println("Given Radius: " + TAB + df.format(radius) + NEWLINE +
         "Area: " + TAB + df.format(area) + NEWLINE + "Circumference: " + TAB + 
         df.format(circumference));
   }
}
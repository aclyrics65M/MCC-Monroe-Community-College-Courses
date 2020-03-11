/*
   Chapter 3 Sample Program: Compute Area and Circumference with
   formatting and standard I/O
   File: Ch3Circle4.java
*/

import java.text.*;
import java.util.*;

class Circle4 {

   public static void main(String[] args) {
      
      final double PI = 3.14159;
      final String TAB = "\t";
      final String NEWLINE = "\n";
      
      double radius, area, circumference;
      
      Scanner scanner = new Scanner(System.in);
      
      DecimalFormat decForm = new DecimalFormat("0.000");
      
      System.out.println("Enter radius: ");
      radius = scanner.nextDouble();
      
      // Computing the area and circumference
      area = PI * radius * radius;
      circumference = 2.0 * PI * radius;
      
      // Displaying the results
      System.out.println("Given Radius:  " + TAB + decForm.format(radius) + NEWLINE +
                         "Area:          " + TAB + decForm.format(area) + NEWLINE +
                         "Circumference: " + TAB + decForm.format(circumference));
   
   
   }


}
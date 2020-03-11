/**
   Lab 4 Part 3

*/
import java.util.*;
import java.lang.*;
import java.text.*;

class Lab4Part3 {

   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("0.000");
      double radius;
      double velocity;
      
      // Static variables
      final double G  = 6.67 * Math.pow(10,-11);
      final double Me = 5.98 * Math.pow(10,24);
      
      System.out.print("Enter the radius: ");
      radius = scanner.nextDouble();
      
      // Calculating the velocity
      velocity = Math.sqrt( (G * Me) / radius);
      
      System.out.println("The velocity based on radius " + radius + " is " + df.format(velocity));
       
      
   }

}
/*
   Chapter 3 Sample Program: Estimate the Pole Height
   File: Ch3PoleHeight.java
*/

import java.text.*;
import java.util.*;

class PoleHeight {

   public static void main(String[] args) {
      
      double height;    // height of the pole
      double distance;  // distance between points A and B
      double alpha;     // angle measured at point A
      double beta;      // angle measured at point B
      double alphaRad;  // angle alpha in radians
      double betaRad;   // angle beta in radians
      
      Scanner javaScanner = new Scanner(System.in);
      javaScanner.useDelimiter(System.getProperty("line.separator"));
      
      // Get three input values
      System.out.print("Angle alpha (in degrees): ");
      alpha = javaScanner.nextDouble();
      
      System.out.print("Angle beta (in degrees): ");
      beta = javaScanner.nextDouble();
      
      System.out.print("Distance between points A and B (ft): ");
      distance = javaScanner.nextDouble();
      
      // Compute the height of the tower
      alphaRad = Math.toRadians(alpha);
      betaRad = Math.toRadians(beta);
      
      height = ( distance * Math.sin(alphaRad) * Math.sin(betaRad) ) 
            / Math.sqrt(Math.sin(alphaRad + betaRad) * Math.sin(alphaRad - betaRad));
      
      DecimalFormat adx = new DecimalFormat("0.000");
      
      System.out.println(); // blank space
      System.out.println("lnln Estimating the height of the pole" + "\n\n"
            + "Angle at point A (deg):        " + adx.format(alpha) + "\n"
            + "Angle at point B (deg):        " + adx.format(beta)  + "\n"
            + "Distance between A and B (ft): " + adx.format(distance) + "\n"
            + "Estimated height (ft):         " + adx.format(height));
            
   }


}
/*
   Chapter 6 Sample Program: Dropping a Watermelon
   File: Ch6DroppingWaterMelon.java
*/

import java.util.*;

class Ch6DroppingWaterMelon {
   
   public static void main( String[] args ) {
      
      double initialHeight, position, touchTime;
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Initial Height: ");
      initialHeight = scanner.nextDouble();
      
      touchTime = Math.sqrt(initialHeight / 16.0);
      touchTime = Math.round(touchTime * 10000.0) / 10000.0;

      //convert to four decimal places
      System.out.println("\n\n Time t Position at Time t \n");
      for (int time = 0; time < touchTime; time++) {
         position = -16.0 * time*time + initialHeight;
         System.out.print(" " + time);
         System.out.println("       " + position);
      }

      //print the last second
      System.out.println(" "+ touchTime + " 0.00");
   }
}
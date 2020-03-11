/*

Chapter 6 Sample Program: Sleep Statistics for Dorm Residents
File: Ch6SleepStatistics.java

*/
import java.text.*;
import java.util.*;

class Ch6SleepStatistics {
   private Scanner scanner;
   
   public static void main (String[] args) {
      Ch6SleepStatistics prog = new Ch6SleepStatistics( );
      prog.start();
   }
   
   public Ch6SleepStatistics() {
      scanner = new Scanner(System.in);
      scanner.useDelimiter(System.getProperty("line.separator"));
   }
   
   public void start( ) {
   
   double sleepHour, sum = 0;
   int cnt = 0;
   
   //enter the dorm name
   System.out.print("Dorm name: ");
   String dorm = scanner.next();
   
   //Loop: get hours of sleep for each resident
   // until 0 is entered.
   sleepHour = getDouble("Enter sleep hours (0 - to stop): ");
   
   while (sleepHour != 0) {
      sum += sleepHour;
      cnt++;
      sleepHour = getDouble("Enter sleep hours (0 - to stop): ");
   }
   
   if (cnt == 0) {
      System.out.println ("No Data Entered");
      
   } else {
   
      DecimalFormat df = new DecimalFormat("0.00");
      System.out.println(
      "Average sleep time for " +
      dorm + " is \n\n " +
      df.format(sum/cnt) + " hours.");
   }
}
   private double getDouble(String message) {
      double result;
      System.out.print(message);
      result = scanner.nextDouble();
      return result;
   }
}   
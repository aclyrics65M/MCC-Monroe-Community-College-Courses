// Sample Array Program
import java.util.Scanner;

public class SampleArray {

   public static void main(String[] args) {
      
      Scanner jScanner = new Scanner(System.in);
      
      double sum, annualAverage;
      
      // create an array rainfall
      double[] rainfall = new double[12];
      
      sum = 0.0;
      
      for (int i = 0; i < 12; i++) {
         System.out.print("Rainfall for month " + (i+1) + ": ");
         rainfall[i] = jScanner.nextDouble();
         sum += rainfall[i];
      }
      
      annualAverage = sum / 12.0;            
      
   }

}
// Weight Calculator

import java.util.*;
import java.text.DecimalFormat;

public class WeightCalculator {

   public static void main(String[] args) {
      
      // Scanner object
      Scanner scanner = new Scanner(System.in);
      
      // DecimalFormat object
      DecimalFormat javaDecimal = new DecimalFormat("0.00");
      
      System.out.println("Hello! Welcome to my weight converter program");
      System.out.println();//blank space
      System.out.print("Please enter your weight (in pounds): ");
      double weightInPounds = scanner.nextDouble();
   
      // Create a new instance of the class WeightConverter
      WeightConverter javaWeightConversion = new WeightConverter(0.167);
      double moonWeight = javaWeightConversion.convert(weightInPounds);
      
      System.out.println("Your weight on Earth is " + weightInPounds);
      System.out.println("Your weight on the Moon is " + javaDecimal.format(moonWeight));
   }

}
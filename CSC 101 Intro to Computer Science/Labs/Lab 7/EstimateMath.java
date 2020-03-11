// Create a class called EstimateMath

public class EstimateMath {
   
   // Create two methods
   // first method is to estimate and add
   public static int estimateAdd(int number1, int number2) {
      
      // Round number one and two to the nearest 10
      int roundedNumberOne = (int) (Math.round(number1 / 10.0) * 10);
      int roundedNumberTwo = (int) (Math.round(number2 / 10.0) * 10);
      
      int sum = roundedNumberOne + roundedNumberTwo;
      
      // Return statement
      return sum; 

   }
   
   // second method is to estimate and subtract
   public static int estimateSubtract(int number1, int number2) {
      
      // Round number one and two to the nearest 10
      int roundedNumberOne = (int) (Math.round(number1 / 10.0) * 10);
      int roundedNumberTwo = (int) (Math.round(number2 / 10.0) * 10);
      
      int difference = roundedNumberOne - roundedNumberTwo;
      
      // Return statement
      return difference;
   
   }



}
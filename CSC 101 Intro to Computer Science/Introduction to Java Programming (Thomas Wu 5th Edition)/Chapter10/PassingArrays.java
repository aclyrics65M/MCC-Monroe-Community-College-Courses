// Passing Arrays to methods

import java.util.*;
import java.util.Scanner;

public class PassingArrays {

   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      
      // Create two double arrays
      double[] arrayOne, arrayTwo;
      
      //assign values to arrayOne and arrayTwo
      arrayOne = readDoubles();
      arrayTwo = readDoubles();
      
      //create and assign values to arrayOne and arrayTwo
      //get the index of the smallest element of arrayOne
      int minOne = searchMinimum(arrayOne);
      
      //get the index of the smallest element of arrayTwo
      int minTwo = searchMinimum(arrayTwo);
      
      //output the result
      System.out.print("Minimum value in Array One is ");
      System.out.print(arrayOne[minOne] +" at position " + minOne);
      
      System.out.print("\n\n");
      System.out.print("Minimum value in Array Two is ");
      System.out.print(arrayTwo[minTwo] + " at position " + minTwo);
      
      
   }
   
   
   public int searchMinimum(double[] number) {
      int indexOfMinimum = 0;
      
      for (int i = 1; i < number.length; i++) {
      
         if (number[i] < number[indexOfMinimum]) { //found a
            indexOfMinimum = i; //smaller element
         }
      }
      
      return indexOfMinimum;
   }
   
   public double[] readDoubles() {
      
      double[] number;
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("How many input values? ");
      int N = scanner.nextInt();
      number = new double[N];
      
      for (int i = 0; i < N; i++) {
         System.out.print("Number " + i + ": ");
         number[i] = scanner.nextDouble();
      }
      
      return number;      
   }         

}
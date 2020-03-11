/*
   Lab 10: Arrays
   Part 2: Pascal's Triangle
*/

import java.util.Scanner;

public class PascalsTriangle {

   public static void main(String[] args) {
      System.out.println("Hello welcome to Java Pascal's Triangle!");
      System.out.println(); // blank space
      
      Scanner jScanner = new Scanner(System.in);
      System.out.print("Enter the number of rows to display: ");
      int numberRows = jScanner.nextInt();
      
      int [][] pascalTriangle = new int[numberRows][];

      for (int r=0; r < pascalTriangle.length; r++) {
         pascalTriangle[r] = new int[r+1];
         pascalTriangle[r][0] = 1;
         pascalTriangle[r][r] = 1;
         
         for (int c = 1; c < r; c++) {
            pascalTriangle[r][c] = pascalTriangle[r - 1][c] + pascalTriangle[r-1][c-1];
         }
      }

      for (int r = 0; r < pascalTriangle.length; r++) {
         for (int c = 0; c < pascalTriangle[r].length; c++) {
            System.out.print(" "+ pascalTriangle[r][c]);
         }
         System.out.println("");
         }
      }
      
   
}



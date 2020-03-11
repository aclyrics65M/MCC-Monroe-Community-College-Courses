/*
   CSC 101: Intro to Computer Science
   Lab 6 loops
   Part 2: Question 7
*/
import java.util.Scanner;

class Lab6Part2 {
   
   public static void main(String[] args) {
      // Create a scanner object
      Scanner javaScanner = new Scanner(System.in);
      int number;
      
      // Prompt user to input a number
      do {
         
         System.out.print("Please enter a number: ");
         number = javaScanner.nextInt();
         isNumberPrime(number);
         
      } while (number >= 0);
   
   
   }
   
   // Method to check if number if prime
   public static void isNumberPrime(int num) {
   
      boolean status = false;
      
      //String isPrime = null;
      for (int i = 2; i < num; i++) {
         if (num % i == 0) {
            status = true;
         }
      
      }
      
      if (status == true) {
         System.out.println("Number is Not Prime");
      } else {
         System.out.println("Number is Prime");
      }
      
 
   }
    
}

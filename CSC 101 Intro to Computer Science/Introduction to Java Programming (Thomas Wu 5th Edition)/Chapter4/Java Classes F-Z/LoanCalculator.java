/*
   Chapter 4 Sample Development: Loan Calculation (Step 1)
   File: Step1/LoanCalculator.java
*/
import java.util.*;

public class LoanCalculator {

   // Data Members
   private Loan loan;
   
   // Main Method
   public static void main(String[] args) {
      LoanCalculator calculator = new LoanCalculator();
      calculator.start();
   }
   
   // Blank Constructor
   public LoanCalculator() {
   
   }
   
   // Constructor
   public LoanCalculator() {
      loan = new Loan();
   }
   
   // Top-level method that calls other private methods
   public void start() {
      describeProgram(); // tell what the program does
      getInput(); // get three input values
      computePayment(); // compute the monthly payment and total
      displayOutput(); // display the results
   
   }
   
   // private void method getInput()
   private void getInput(){
      
      double loanAmount, annualInterestRate;
      
      int loanPeriod;

      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Loan Amount (Dollars+Cents):");
      loanAmount = scanner.nextDouble();
      
      System.out.print("Annual Interest Rate (e.g., 9.5):");
      annualInterestRate = scanner.nextDouble();
      
      System.out.print("Loan Period - # of years:");
      loanPeriod = scanner.nextInt();
      
      //create a new loan with the input values
      loan = new Loan(loanAmount, annualInterestRate,loanPeriod); //TEMP
      System.out.println("Loan Amount: $" + loan.getAmount());
      System.out.println("Annual Interest Rate:" + loan.getRate() + "%");
      System.out.println("Loan Period (years):" + loan.getPeriod());
      
      //TEMP

   }
   
   // Computes the monthly and total loan payments
   private void computePayment() {
      System.out.println("inside computePayment"); //TEMP
   }
   
   // Provides a brief explanation of the program to the user
   private void describeProgram() {
      System.out.println("inside describeProgram"); //TEMP
   }
   
   // Displays the input values and monthly and total payments
   private void displayOutput() {
      System.out.println("inside displayOutput"); //TEMP
   }
   
   // Gets three input values—loan amount, interest rate, and
   // loan period—using an InputBox object
   private void getInput() {
      System.out.println("inside getInput"); //TEMP
   }
   
   
}
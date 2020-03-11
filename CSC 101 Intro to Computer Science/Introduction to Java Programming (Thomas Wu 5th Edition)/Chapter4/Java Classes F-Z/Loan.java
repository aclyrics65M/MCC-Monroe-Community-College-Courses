/*
   Chapter 4 Sample Development: Loan Calculation (Step 1)
   File: Step1/Loan.java
*/

public class Loan {
   
   // Data Members
   private final int MONTHS_IN_YEAR = 12;
   private double loanAmount;
   private double monthlyInterestRate;
   private int numberOfPayments;
   
   // Constructor
   public Loan(double amount, double rate, int period) {
      setAmount(amount);
      setRate(rate);
      setPeriod(period);
   }
   
   //Returns the loan amount
   public double getAmount( ) {
      return loanAmount;
   }
   
   //Returns the loan period in number of years
   public int getPeriod( ) {
      return numberOfPayments / MONTHS_IN_YEAR;
   }

   //Returns the loan's annual interest rate
   public double getRate( ) {
      return monthlyInterestRate * 100.0 * MONTHS_IN_YEAR;
   }

   //Sets the loan amount
   public void setAmount(double amount) {
      loanAmount = amount;
   }

   //Sets the annual interest rate
   public void setRate(double annualRate) {
      monthlyInterestRate = annualRate / 100.0 / MONTHS_IN_YEAR;
   }
   
   //Sets the loan period
   public void setPeriod(int periodInYears) {
      numberOfPayments = periodInYears * MONTHS_IN_YEAR;
   }

}
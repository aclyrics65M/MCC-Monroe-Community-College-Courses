// class account version 3

public class AccountVer3 {

   // Data Members
   private static final double FEE = 0.50;
   private String ownerName;
   private double balance;
   
   // Constructor
   public AccountVer3(String name, double startingBalance) {
      ownerName = name;
      balance = startingBalance;
   }
   
   // Deducts the passed amount from the balance
   public void deduct(double amount) {
      balance = balance - amount - FEE; // FEE is charged everytime
   }
   
   // other methods are exactly as same before
   // so we will omit them here
   
   // Not so fast baby!!
   // We shall put them here real good baby boy!
   
   // Returns the current balance of this account
   public double getCurrentBalance() {
      return balance;
   }
   
   // Returns the name of this account's owner
   public String getOwnerName() {
      return ownerName;
   }
   
   // Assigns the name of this account's owner
   public void setOwnerName(String name) {
      ownerName = name;
   }
   
}
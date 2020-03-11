// Sample program Deduction with fee

import java.text.*;

class DeductionWithFee {

   // This sample program deducts money three times
   // from the account
   
   public static void main(String[] args) {
   
      DecimalFormat decimalForm = new DecimalFormat("0.00");
      
      AccountVer3 accountSample = new AccountVer3("Carl Smith", 50.00);
      AccountVer3 accountCheck  = new AccountVer3("Leonardo DiCaprio", 150.00);
      AccountVer3 accountAhrash = new AccountVer3("Ahrash Dianat", 220.00);
      
      accountSample.deduct(10);
      accountSample.deduct(10);
      accountSample.deduct(10);
      
      // For loop for accountCheck object
      for(int i = 0; i < 3; i++) {
         accountCheck.deduct(10);
         accountAhrash.deduct(15);
      }
      
      // Displaying the final output
      System.out.println("Owner: " + accountSample.getOwnerName());
      System.out.println("Bal  : $" + decimalForm.format(accountSample.getCurrentBalance()));
      System.out.println(); // blank space
      System.out.println("Owner: " + accountCheck.getOwnerName());
      System.out.println("Bal  : $" + decimalForm.format(accountCheck.getCurrentBalance()));
      System.out.println(); // blank space
      System.out.println("Owner: " + accountAhrash.getOwnerName());
      System.out.println("Bal  : $" + decimalForm.format(accountAhrash.getCurrentBalance()));
        
      
   }

}
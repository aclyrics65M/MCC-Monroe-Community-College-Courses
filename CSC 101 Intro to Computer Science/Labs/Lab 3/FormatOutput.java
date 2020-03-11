// Format example
import java.text.DecimalFormat;  //import class

class FormatOutput {
   public static void main( String [ ] args) {
   
      DecimalFormat twoplaces = new DecimalFormat("0.00");
      double number= 15.6678;
      System.out.println("Value = " + twoplaces.format(number));
   
   } // end of main method
}// end of class

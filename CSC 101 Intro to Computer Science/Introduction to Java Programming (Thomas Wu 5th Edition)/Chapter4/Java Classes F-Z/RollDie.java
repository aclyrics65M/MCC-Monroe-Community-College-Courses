// Roll a die 
import java.util.Scanner;
import java.text.DecimalFormat;

public class RollDie {

   public static void main(String[] args) {
      
      // Create a scanner object
      Scanner javaScanner = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("0.000");
      
      // Prompt user to input the number of times to roll all three dies.
      System.out.print("Please enter the number of dice trials: ");
      int numberOfDiceTrials = javaScanner.nextInt();
      
      
      Die one, two, three;
      one = new Die();
      two = new Die();
      three = new Die();
      
      int dieOneTotal = 0;
      int dieTwoTotal = 0;
      int dieThreeTotal = 0;
 
      for (int i = 0; i < numberOfDiceTrials; i++) {
         one.roll();
         two.roll();
         three.roll();
         System.out.println("Trial " + (i+1) + " Results are " + one.getNumber() 
           + " " + two.getNumber() + " " + three.getNumber());
         dieOneTotal += one.getNumber();
         dieTwoTotal += two.getNumber();
         dieThreeTotal += three.getNumber();
           
      }
      
      // Calculate the averages
      double averageDiceOne = (double) dieOneTotal / numberOfDiceTrials;
      double averageDiceTwo = (double) dieTwoTotal / numberOfDiceTrials;
      double averageDiceThree = (double) dieThreeTotal / numberOfDiceTrials;
      
      System.out.println(); // blank space
      System.out.println("The averages are: " + df.format(averageDiceOne) 
         + " " + df.format(averageDiceTwo) + " " + df.format(averageDiceThree));
      
      
   }

}
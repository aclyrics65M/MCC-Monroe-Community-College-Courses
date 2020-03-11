// Sample Try Catch Exception

import java.util.*;

public class SampleException {

   public static void main(String[] args) {
   
      Scanner scanner = new Scanner(System.in);
         
      try {
         int num = scanner.nextInt();

         if (num < 0) {
            throw new Exception("No negative");
         }
      
      } catch (InputMismatchException e) {
         System.out.println("Invalid Entry");
         
      } catch (Exception e) {
         System.out.println("Error: "+ e.getMessage());
         
      } finally {
         System.out.println("DONE");
      }
      
   
   }


}
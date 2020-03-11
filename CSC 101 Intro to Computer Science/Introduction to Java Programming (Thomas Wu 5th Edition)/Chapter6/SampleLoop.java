// Sample loop
import java.util.Scanner;

public class SampleLoop {

   public static void main(String[] args) {
   
      // Scanner object
      Scanner javaScanner = new Scanner(System.in);
      
      int sum = 0;
      int number;
      int age;
      
      System.out.print("Enter integer: ");
      number = javaScanner.nextInt();
      
      // While loop
      while (number >= 0) {
         sum += number;
         
         System.out.print("Enter integer: ");
         number = javaScanner.nextInt();
      
      }
      
      do {
      
         System.out.print("Your Age (between 0 and 130): ");
         age = javaScanner.nextInt();
         
      } while (age < 0 || age > 130);      
   
   }



}




/*   
   private DrawableShape.Type inputShapeType( ) {
      System.out.print("Selection: Enter the Shape number\n" +
                        " 1 - Ellipse \n" +
                        " 2 - Rectangle \n" +
                        " 3 - Rounded Rectangle \n");

      int selection = scanner.nextInt();
      DrawableShape.Type type;
      
      switch (selection) {
      
         case 1: type = DrawableShape.Type.ELLIPSE;
         break;
         
         case 2: type = DrawableShape.Type.RECTANGLE;
         break;
         
         case 3: type = DrawableShape.Type.ROUNDED_RECTANGLE;
         break;
         
         default: type = DrawableShape.Type.ELLIPSE;
         break;
         
      }
      return type;
   }   
*/
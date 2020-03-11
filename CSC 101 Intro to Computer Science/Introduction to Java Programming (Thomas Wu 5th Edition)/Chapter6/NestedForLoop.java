
public class NestedForLoop {

   public static void main(String[] args) {
   
      int price;

      for (int width = 11; width <= 20; width++) {
         for (int length = 5; length <= 25; length += 5) {
               price = width * length * 19; //$19 per sq ft.
               System.out.print(" " + price);
         }
         //finished one row; now move on to the next row
         System.out.println("");
      }   
   
   
   }


}
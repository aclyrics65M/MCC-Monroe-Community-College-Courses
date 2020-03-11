/*
   Use of a static function to test if you can follow
   the passing of paramaters
*/
class ConfuseStudents {
   public static void main(String args[] ) {
      int cherry = 12;
      int orange = 9;
      int grape = 5;
      int banana = 8;
      
 // static method can be called without class name first
 // if method is defined in same class 
 // i.e. ConfuseStudents.swapit(grape,orange); is shortened to
      swapit(grape,orange);

      System.out.println(swapit(orange,cherry));
      System.out.println(swapit(cherry,grape));
      System.out.println(banana);
      
   }// end main method
   
   public static int swapit(int apple, int cherry) {
      
      int banana = apple + cherry;
      cherry = cherry + 2;
      System.out.println(cherry);
      
      return banana;
   } // end swapit method
   
} // end class

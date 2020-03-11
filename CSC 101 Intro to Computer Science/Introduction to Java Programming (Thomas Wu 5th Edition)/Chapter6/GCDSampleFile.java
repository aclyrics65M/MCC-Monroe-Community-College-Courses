// Greatest Common Divisor

public class GCDSampleFile {

   public static void main(String[] args) {
   
      System.out.println();
      System.out.println("Hello World!");
      System.out.println("The greatest common divisor of 44 and 16 is " + gcd_bruteforce(44, 16));
   
   }
   
   public static int gcd_bruteforce(int m, int n) {
      //assume m, n >= 1
      int last = Math.min(m, n);
      int gcd = 0;
      int i = 1;
      
      while (i <= last) {
         if (m % i == 0 && n % i == 0) {
            gcd = i;
         }
         i++;
      }
      return gcd;
   }   


}
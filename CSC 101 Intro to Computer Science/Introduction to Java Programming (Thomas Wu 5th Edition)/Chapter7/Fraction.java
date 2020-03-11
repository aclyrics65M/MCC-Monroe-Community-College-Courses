// Class Fraction

class Fraction {
   
   // Data Members
   private int numerator;
   private int denominator;
   
   // Constructor
   public Fraction(int num, int denom) {
      setNumerator(num);
      setDenominator(denom);
   }
   
   // Method to return a denominator
   public int getDenominator( ) {
      return denominator;
   }
   
   // Method to return a numerator
   public int getNumerator( ) {
      return numerator;
   }
   
   // Method to set denominator
   public void setDenominator(int denom) {
      if (denom == 0) {
         //Fatal error
         System.err.println("Fatal Error");
         System.exit(1);
      }
      
      denominator = denom;
   }
   
   // Method to set numerator
   public void setNumerator(int num) {
      numerator = num;
   }
   
   // Method to set string
   public String toString( ) {
      return getNumerator() + "/" + getDenominator();
   }
   
   //other methods come here
   // Simply method
   public void simplify() {
      int num   = getNumerator();
      int denom = getDenominator();
      // Edit this section!
      //int gcd   = gcd(num, denom);
      
      //setNumerator(num/gcd);
      //setDenominator(denom/gcd);
   }
      
}
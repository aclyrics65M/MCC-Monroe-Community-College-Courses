// Create a class that will model a complex number

public class Complex {

   // Data members
   private double real;
   private double imaginary;
   private static double LIMIT = 10.0;
   
   // Methods
   
   // First Constructor
   public Complex() {
      this.real = 0;
      this.imaginary = 0;
   }
   
   // Second Constructor
   public Complex(double variable1) {
      this.real = variable1;
      this.imaginary = 0;   
   }
   
   // Third Constructor
   public Complex(double variable1, double variable2) {
      this.real = variable1;
      this.imaginary = variable2;
   }
   
   // Two Accessors
   public double getReal() {
      return real;
   }
   
   public double getImaginary() {
      return imaginary;
   }
   
   // Two mutators
   public void setReal(double realVariable) {
      this.real = realVariable;
   }
   
   public void setImaginary(double imaginaryVariable) {
      this.imaginary = imaginaryVariable;
   }  
   
   // toString() method
   public String toString() {
      return real + " + " + imaginary + "i";
   }
   
   // equals method
   public boolean equals(Complex iVariable) {
      if (this.real == iVariable.getReal() || this.imaginary == iVariable.getImaginary()) {
         return true;
      } else {
         return false;
      }
   }
   
   // Mathematical methods
   public Complex add(Complex expression) {
      return new Complex(this.real + expression.getReal(), this.imaginary + expression.getImaginary());
   }
   
   // Add method with complex expression
   public Complex add(double doubleVariable) {
      return new Complex(this.real + doubleVariable, this.imaginary);
   }
   
   // Static method add
   public static Complex add(Complex object1, Complex object2) {
      double newReal = object1.getReal() + object2.getReal();
      double newImaginary = object1.getImaginary() + object2.getImaginary();
      return new Complex(newReal, newImaginary);
      
   }
   
   // isBig() method
   public boolean isBig() {
      double size = Math.sqrt((this.real * this.real) + (this.imaginary * this.imaginary));
      if(size > LIMIT) {
         return true;
      } else {
         return false;
      }
   }
    


}
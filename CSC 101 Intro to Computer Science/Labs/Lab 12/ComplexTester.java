//Complex Tester class
//Author: Kevin Soule 

class ComplexTester {
   public static void main(String args[] ) {
   
   //create complex numbers testing all three constructors
   Complex one = new Complex();
   Complex two = new Complex(5);
   Complex three = new Complex(2.1,3.5);
   // test toString
   System.out.println("First Complex number : " + one.toString());
   System.out.println("Second Complex number : " + two.toString());
   System.out.println("Third Complex number : " + three);
   
   //test accessors
   System.out.println("Real for third number : "+ three.getReal());
   System.out.println("Imaginary for third number : " + three.getImaginary());
   
   //test mutators
   System.out.println("Using mutators, change first number to 1.7 + 3.4i");
   one.setReal(1.7);
   one.setImaginary(3.4);
   System.out.println("First Complex number : " + one);
   System.out.println();
   
   //test two instance add methods
   Complex four = one.add(three);
   System.out.println(one + " plus " + three + " = " + four);
   Complex five = two.add(3);
   System.out.println("Adding 3.0 to Second complex number = " + five);
   System.out.println();
   
   //test equals method
   System.out.println("Third Complex number : " + three);
   Complex six = new Complex(2.1,3.5);
   System.out.println("Sixth Complex number : " + six);
   
   System.out.println("Third equals sixth : " + three.equals(six));
   System.out.println("Third equals first : " + three.equals(one));   
   System.out.println();
   
   //test static add method
   System.out.println("Fourth Complex number : " + four);
   System.out.println("Fifth Complex number : " + five);
   Complex seven = Complex.add(four,five);

   System.out.println("Fourth plus Fifth = " + seven);
   //testing toBig method
      
   System.out.println();
   System.out.println("Seventh Complex number : " + seven);
   System.out.println("Is Fourth to Big : " + four.isBig());
   System.out.println("Is Seventh to Big : " + seven.isBig());
   }
}
   
   
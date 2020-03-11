/*
   Chapter 3 Sample Program: Compute Area and Circumference
   File: Ch3Circle.java
*/

class Ch3Circle {
   public static void main(String[] args) {
      
      final double PI = 3.14159;
      
      double radius, area, circumference;
      
      radius = 2.35;
      
      //compute the area and circumference
      area = PI * radius * radius;
      circumference = 2.0 * PI * radius;
      
      System.out.println("Given Radius: " + "\t" + radius + "\n" +
                          "Area: " + "\t\t" + area + "\n" +
                          "Circumference: " + "\t" + circumference);
      
   }
}
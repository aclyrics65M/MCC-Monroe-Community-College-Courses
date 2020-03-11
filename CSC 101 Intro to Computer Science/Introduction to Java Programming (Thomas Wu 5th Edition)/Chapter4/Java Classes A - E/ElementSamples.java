// SampleElement file
// Program: ElementSamples.java

public class ElementSamples {

   public static void main(String[] args) {
      System.out.println("Hello World!");
      System.out.println("How are you doing?!");
      System.out.println(); // blank space.
      
      // Creating three element objects
      Element e1, e2, e3;
      e1 = new Element("Hydrogen", 1, "H", 1.008, 1, 1);
      e2 = new Element("Gold", 79, "Au", 197.0, 6, 11);
      e3 = new Element("Oxygen", 8, "O", 16.0, 2, 16);
      
      // Create an element object for Lead (Pb)
      Element leadElement = new Element("Lead", 82, "Pb", 207.2, 6, 14);
      
      System.out.println("Element e1 is " + e1.getName());
      System.out.println("Element e2 is " + e2.getName());
      System.out.println("Element e3 is " + e3.getName());
      System.out.println("Element leadElement is " + leadElement.getName());
      System.out.println("Lead whose chemical symbol is " + leadElement.getSymbol() +
       " has an atomic number of " + leadElement.getNumber() + " and an atomic mass of "
        + leadElement.getMass());  
      
   
   }

}

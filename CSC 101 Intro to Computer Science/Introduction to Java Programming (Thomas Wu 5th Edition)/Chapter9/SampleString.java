// Sample String file
import java.lang.*;

public class SampleString {

   public static void main(String[] args) {
      
      String name = "Sinatra";
      
      int size = name.length();
      
      for (int i = 0; i < size; i++) {
         System.out.println(name.charAt(i));
      
      }
      
      System.out.println(); // Blank space
      
      String javaName = "Object-Oriented Programming";
      StringBuilder updatedJavaName = new StringBuilder();
      
      for (int j = 0; j < javaName.length(); j++) {
         
         if (j > 0) {
            updatedJavaName.append(" ");
         }
         
         updatedJavaName.append(javaName.charAt(j));
         
         /*
         updatedJavaName.append(javaName.charAt(j));
         if (j != javaName.length() - 1 && Character.isUpperCase(javaName.charAt(j + 1))) {
            updatedJavaName.append(" ");
         } 
         */  
      
      }
      
      System.out.println(updatedJavaName.toString());
      
   
   }  
}
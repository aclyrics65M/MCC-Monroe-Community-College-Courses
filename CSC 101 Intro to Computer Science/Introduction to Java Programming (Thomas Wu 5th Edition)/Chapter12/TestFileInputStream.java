// Class TestFileInputStream
import java.io.*;

public class TestFileInputStream {

   public static void main(String[] args) throws IOException {
      
      // Set up file and stream   
      File inFile = new File("sample1.data");
      
      // FileInputStream object
      FileInputStream inStream = new FileInputStream(inFile);
      
      // Set up an array to read data to
      int fileSize = (int) inFile.length();
      byte[] byteArray = new byte[fileSize];
      
      // Read data in and display them
      inStream.read(byteArray);
      
      System.out.println("Printing out results of byteArray: ");
      for(int i = 0; i < fileSize; i++) {
         System.out.println(byteArray[i]);
      
      }    
      
      // Input is done, so close the stream
      //inStream.close();  
      
      
      System.out.println("\n\n"); // 3 Blank spaces
      
      
      /////Reading the Data back/////// 
      
      // Using Read method again
      //read data in and display them
     
      
      inStream.read(byteArray);
      
      System.out.println("Printing out results of byteArray in char: ");
      for (int i = 0; i < fileSize; i++) {
         System.out.println((char) byteArray[i]);
      }
      
      //input done, so close the stream
      inStream.close();     
   
   }

}
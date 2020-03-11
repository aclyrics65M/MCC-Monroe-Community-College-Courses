// FileInputOutput Part 1

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
   
   public static void main(String[] args) throws IOException {
      
      // Creating a file to output data to it
      File outFile = new File("sample1.data");
      
      // Creating a FileOutputStream object called "outStream"
      FileOutputStream outStream = new FileOutputStream(outFile);
      
      // Creating a byte array
      byte[] byteArray = {10, 20, 30, 40, 50, 60, 70, 80};
      
      // We write the whole byte array at once to the file by executing
      outStream.write(byteArray);
      
      // After the values are written to the file, we must close the stream:
      outStream.close();
  
   
   }

}
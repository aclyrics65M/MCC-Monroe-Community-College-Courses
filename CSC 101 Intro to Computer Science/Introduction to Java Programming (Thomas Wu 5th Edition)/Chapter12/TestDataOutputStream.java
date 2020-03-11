// Chapter 12: Testing Data Output Stream

import java.io.*;

public class TestDataOutputStream {

   public static void main(String[] args) throws IOException {
      
      // Setting up the streams
      File             outFile       = new File("sample2.data");
      FileOutputStream outFileStream = new FileOutputStream(outFile);
      DataOutputStream outDataStream = new DataOutputStream(outFileStream);
      
      // Write values of primitive data types to the stream
      outDataStream.writeInt(987654321);
      outDataStream.writeLong(11111111L);
      outDataStream.writeFloat(22222222F);
      outDataStream.writeDouble(3333333D);
      outDataStream.writeChar('A');
      outDataStream.writeBoolean(true);
      
      // Output done, so close the stream
      outDataStream.close();
   
   }

}
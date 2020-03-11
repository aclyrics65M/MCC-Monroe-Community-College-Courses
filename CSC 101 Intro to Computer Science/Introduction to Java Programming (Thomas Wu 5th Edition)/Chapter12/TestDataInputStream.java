/*
   Chapter 12 Sample Program:
   A test program to load data from a file using
   DataInputStream for high-level I/O.
   File: Ch12TestDataInputStream.java
*/

import java.io.*;

public class TestDataInputStream {
   
   public static void main (String[] args) throws IOException {
   
      //set up file and stream
      File inFile = new File("sample2.data");
      FileInputStream inFileStream = new FileInputStream(inFile);
      DataInputStream inDataStream = new DataInputStream(inFileStream);
      
      //int numberValue = inDataStream.readInt();
   
      //read values back from the stream and display them
      System.out.println(inDataStream.readInt());
      System.out.println(inDataStream.readLong());
      System.out.println(inDataStream.readFloat());
      System.out.println(inDataStream.readDouble());
      System.out.println(inDataStream.readChar());
      System.out.println(inDataStream.readBoolean());
      
      //System.out.println(numberValue);

      //input done, so close the stream
      inDataStream.close();   
   
   }
   
}
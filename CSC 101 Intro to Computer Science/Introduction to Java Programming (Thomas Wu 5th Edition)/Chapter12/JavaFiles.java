// File Input/Output Introduction

import java.io.File;
import javax.swing.JFileChooser;

public class JavaFiles {

   public static void main(String[] args) {
   
      System.out.println("Hello there! Welcome to the world of File Input/Output!");
      System.out.println("This will be quite fun and exciting\n");
      
      // Creating a file
      File inFile = new File("sample.data");
      
      File secondFile = new File("C:\\JavaPrograms", "xyz.data");
      
      // Creating a file directory
      File fileDirectory = new File("C:\\Users\\Faraz\\Desktop\\MCC Courses\\CSC 101 Intro to Computer Science");
      File mmDirectory = new File("C:/Users/Faraz/Desktop/MCC Courses/CSC 101 Intro to Computer Science");
      
      // Printing out the contents of the file directory
      String[] fileDirectoryNameOne = fileDirectory.list();
      String[] fileDirectoryNameTwo = mmDirectory.list();
      
      /*
      for (int i = 0; i < fileDirectoryNameOne.length; i++) {
         System.out.println(fileDirectoryNameOne[i]);
      }
      
      System.out.println("\n"); // two blank spaces
      
      for (int j = 0; j < fileDirectoryNameTwo.length; j++) {
         System.out.println(fileDirectoryNameTwo[j]);
      }
      */
      
      JFileChooser chooser = new JFileChooser(fileDirectory);
      chooser.showOpenDialog(null);  
   }


}
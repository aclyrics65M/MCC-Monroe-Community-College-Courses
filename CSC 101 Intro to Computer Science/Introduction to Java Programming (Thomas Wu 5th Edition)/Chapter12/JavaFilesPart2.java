// Class Java Files Part 2

import java.io.File;
import javax.swing.*;

public class JavaFilesPart2 {
   
   public static void main(String[] args) {
      
      System.out.println("Hello World!");
      System.out.println("\n");
      
      JFileChooser chooser;
      File file, directory;
      int status;
      
      chooser = new JFileChooser();
      status = chooser.showOpenDialog(null);
      
      if(status == JFileChooser.APPROVE_OPTION) {
         file      = chooser.getSelectedFile();
         directory = chooser.getCurrentDirectory();
      
         System.out.println("Directory: " + directory.getName());
         System.out.println("File selected to open: " + file.getName());
         System.out.println("Full path name: " + file.getAbsolutePath());
         
      } else {
         System.out.println("Open File dialog cancelled");
         
      }
      
      System.out.println("\n\n");
      
      status = chooser.showSaveDialog(null);
      
      if (status == JFileChooser.APPROVE_OPTION) {
         file = chooser.getSelectedFile();
         directory = chooser.getCurrentDirectory();
         
         System.out.println("Directory: " + directory.getName());
         System.out.println("File selected for saving data: " + file.getName());
         System.out.println("Full path name: " + file.getAbsolutePath());
         
      } else {
         System.out.println("Save File dialog canceled");
      }      
   
   }

}
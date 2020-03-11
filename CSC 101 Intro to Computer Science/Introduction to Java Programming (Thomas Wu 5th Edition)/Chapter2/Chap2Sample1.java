/**
   Chapter 2 Sample Program: Displaying a Window
   File: Chapter 2 Sample 1
*/
import javax.swing.*;

class Chap2Sample1 {
   public static void main(String[] args){
      
      JFrame myJavaWindow, secondWindow;
      myJavaWindow = new JFrame();
      secondWindow = new JFrame();
      
      myJavaWindow.setSize(300, 200);
      myJavaWindow.setTitle("My First Java Program");
      myJavaWindow.setVisible(true);
      myJavaWindow.setVisible(false);
      myJavaWindow.setVisible(true);
      
      secondWindow.setSize(500,400);
      secondWindow.setTitle("My Second Java Program");
      secondWindow.setVisible(true);   
      
   }
}

/*
   Name: Faraz Mamaghani
   CSC 101: Intro to Computer Science
   Programming Assignment #4
   Program 3: Mailbox.java
*/

/*
   This problem is not from the book, but it is based on chapter 10 information.
   You have N mailboxes in a row. I want you to make this number entered by the user.
   These mailboxes will be represented in an array.  Each mailbox has only two states
   – open or closed.  So make this an array of Boolean, true = closed, false = open.
   Start with all mailboxes closed.  Begin with mailbox #2 (remember this is index 1 in the list)
   and open it and every 2nd mailbox.  Now starting with mailbox 3, and continuing every
   3rd mailbox we will open it if it is closed and close it if it is opened. Go to fourth
   and reverse the status of every fourth mailbox the same way.  Continue opening and closing
   mailboxes every 5th, every 6th, etc… until we get to where we are starting at mailbox N. 
   Report all the mailboxes that are closed after we finish our procedure, do not report the open ones.
   You should see a recognizable pattern with the few that remain closed.
*/
import java.util.Scanner;

public class Mailbox {

   public static void main(String[] args) {
   
      // Welcome statement
      System.out.println("Hello there! Welcome to the Mailbox Java Program!");
      System.out.println(); // blank space
      
      // Create a scanner object
      Scanner scanner = new Scanner(System.in);
      
      // Prompt individual to enter the number of mailboxes.
      System.out.print("Please enter the number of mailboxes: ");
      int numberOfMailBoxes = scanner.nextInt();
      
      // Create a boolean array of N mailboxes
      boolean[] mailBoxArray = new boolean[numberOfMailBoxes];
      
      // Create a variable called checkNumber
      int checkNumber = 2;
      
      // Start with all mailboxes closed. (True = closed, False = open)
      for (int i = 0; i < mailBoxArray.length; i++) {
         mailBoxArray[i] = true; // Set each mailbox to closed.
      }
      
      // Begin with Mailbox #2 (index 1). Open it and every second mailbox
      for (int index = 1; index < mailBoxArray.length; index++) {
         // Create a variable that indicates current mail box number
         int currentMailBoxNumber = index;
         
         // While loop 
         // While current mail box is less than mail box array length
         while (currentMailBoxNumber < mailBoxArray.length) {
            // Switch the status of the current mailbox
            // If closed (true) it becomes open (false).
            // If open (false) it becomes closed (true).
            mailBoxArray[currentMailBoxNumber] = !mailBoxArray[currentMailBoxNumber];
            currentMailBoxNumber += (index + 1); // shift to the next mailbox
            
         }
    
      }
      
      // Report all the mailboxes that are open
      System.out.println("The following MailBoxes are open: ");
      System.out.println(); // blank space
      for (int a = 0; a < mailBoxArray.length; a++) {
         // if statement to check to see if the mailbox is open
         if(mailBoxArray[a] == true) {
            System.out.println("MailBox #" + (a + 1) + " is closed");
         }
      
      }
      
      System.out.println(); // blank space
      System.out.println("Thank you very much! Goodbye!");
      
      
      
   } // End of Main class

} // End of Mailbox class

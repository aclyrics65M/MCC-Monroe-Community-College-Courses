/*
   Chapter 7 Sample Development: Library Overdue Checker
   File: BookTracker.java
*/

import java.util.*;

public class BookTracker {

   public static final int ERROR = -1;
   
   private List<LibraryBook> books;
   
   public BookTracker() {
      books = new LinkedList<LibraryBook>();
   }
   
   public void add(LibraryBook book) {
      books.add(book);
   }
   
   public double getCharge() {
      return getCharge(new GregorianCalendar()); // set today as due date
   }
   
   public double getCharge(GregorianCalendar returnDate) {
      if (books.isEmpty()) {
         return ERROR;
      } else {
         return totalCharge(returnDate);
      }
   }
   
   public String getList() {
      StringBuffer result = new StringBuffer(" ");
      String lineSeparator = System.getProperty("line.separator");
      
      for (LibraryBook book: books) {
         result.append(book.toString() + lineSeparator);
      }
      
      return result.toString();
   }
   
   private double totalCharge(GregorianCalendar returnDate) {
      double totalCharge = 0.0;
      for (LibraryBook book: books) {
         totalCharge += book.computeCharge(returnDate);
      }
      return totalCharge;
   }            
   

}
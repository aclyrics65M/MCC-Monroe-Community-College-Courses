// Public Class Librarian
// With Main method

public class Librarian {
   
   public static void main(String[] args) {
   
      Student student;
      Student fmStudent;
      Student lmStudent;
      LibraryCard card1, card2;
      LibraryCard cardFM, cardLM;
   
      student = new Student();
      student.setName("Jon Java");
      student.setEmail("jj@javauniv.edu");
      
      fmStudent = new Student();
      fmStudent.setName("Faraz Mamaghani");
      fmStudent.setEmail("fgmamagh315@gmail.com");
      
      lmStudent = new Student();
      lmStudent.setName("Lance McVeigh");
      lmStudent.setEmail("ltmcveigh175@gmail.com");
      
   
      card1 = new LibraryCard();
      card1.setOwner(student);
      card1.checkOut(3);
   
      card2 = new LibraryCard();
      card2.setOwner(student); //the same student is the owner
      //of the second card, too
      
      cardFM = new LibraryCard();
      cardFM.setOwner(fmStudent);
      cardFM.checkOut(15);
   
      cardLM = new LibraryCard();
      cardLM.setOwner(lmStudent);
      cardLM.checkOut(20);
   
      System.out.println("Card1 Info:");
      System.out.println(card1.toString() + "\n");
      System.out.println("Card2 Info:");
      System.out.println(card2.toString() + "\n");
      System.out.println("Card3 Info:");
      System.out.println(cardFM.toString() + "\n");
      System.out.println("Card4 Info:");
      System.out.println(cardLM.toString() + "\n");
   }
}
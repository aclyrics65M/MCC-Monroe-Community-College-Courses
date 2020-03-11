/**
Create a new file in Jgrasp that has a class name of Goodbye and declare a string variable
 which is used to give us a message out to the screen.  Inside the main method declare and assign 
 variables for your name, age, gpa (decimal required), and sex (M/F).  
*/

class Goodbye {
   
   public static void main(String[] args) {
      
      String name, name2;
      name = "Faraz Mamaghani";
      name2 = "Lance McVeigh";
      
      int age, age2;
      age = 28;
      age2 = 29;
      
      double GPA, lGPA;
      GPA = 3.90;
      lGPA = 3.95;
      
      String majorFieldOfStudy = "Computer Science";
      String college = "Rochester Institute of Technology";
      
      System.out.println("Student Information");
      System.out.println();
      System.out.println("Name = " + name);
      System.out.println("Age = " + age);
      System.out.println("GPA = " + GPA);   
      
      System.out.println();
      System.out.println();
      System.out.println("Faraz Mamaghani's Alter Ego Student Information: ");
      System.out.println();
      System.out.println("Alter Ego Name = " + name2);
      System.out.println("Age = " + age2);
      System.out.println("College of Attendance = " + college);
      System.out.println("Field of Study (Major) = " + majorFieldOfStudy);
      System.out.println("GPA = " + lGPA); 
      
      
   }   
   
}
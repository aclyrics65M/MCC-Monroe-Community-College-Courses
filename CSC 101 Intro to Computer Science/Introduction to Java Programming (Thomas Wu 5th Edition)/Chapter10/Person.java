// Person class

public class Person {

   // Data Members
   private int age;
   private char gender;
   private String name;
   
   // Constructor
   Person() {
      // blank constructor
   }
   
   // Constructor
   Person(int ageStat, char genderClass, String nameStr) {
      age = ageStat;
      gender = genderClass;
      name = nameStr;
   } 
   
   // Methods
   public int getAge() {
      return age;
   }
   
   public char getGender() {
      return gender;
   }
   
   public String getName() {
      return name;
   }
   
   public void setAge(int ageVar) {
      this.age = ageVar;
   }
   
   public void setGender(char genderVar) {
      this.gender = genderVar;
   }
   
   public void setName(String nameVar) {
      this.name = nameVar;
   }  

}
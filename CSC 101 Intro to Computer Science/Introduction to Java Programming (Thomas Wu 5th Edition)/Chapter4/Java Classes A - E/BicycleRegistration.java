/**
   BicycleRegistration class
*/

class BicycleRegistration {

   public static void main(String[] args) {
      Bicycle bike1, bike2;
      Bicycle bike3, bike4;
      
      String owner1, owner2;
      String owner3, owner4;
      
      bike1 = new Bicycle(); //Create and assign values to bike1
      bike1.setOwnerName("Adam Smith");
      
      bike2 = new Bicycle(); //Create and assign values to bike2
      bike2.setOwnerName("Ben Jones");
      
      bike3 = new Bicycle();
      bike3.setOwnerName("Lance McVeigh");
      
      bike4 = new Bicycle();
      bike4.setOwnerName("Jonanthan Lambert");
      
      //Output the information
      owner1 = bike1.getOwnerName();
      owner2 = bike2.getOwnerName();
      owner3 = bike3.getOwnerName();
      owner4 = bike4.getOwnerName();
      
      System.out.println(owner1 + " owns a bicycle.");
      System.out.println(owner2 + " also owns a bicycle.");
      System.out.println(owner3 + " owns a very expensive bicycle.");
      System.out.println(owner4 + " owns a nice and fast hybrid bicycle.");
   }
   
   
}
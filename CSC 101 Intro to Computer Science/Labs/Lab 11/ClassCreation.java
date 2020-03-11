/*
   Name: Faraz Mamaghani
   Date: 11/21/2017
   CSC 101 Intro to Computer Science
   
   Lab 11: Create your own Classes Part 1
*/


public class ClassCreation {

   public static void main(String[] args) {
      System.out.println("Hello World!");
      System.out.println("This is Lab 11 Create Your Own Classes Part 1!");
      System.out.println(); // blank space
      
      // Create a 5 element Array of objects
      Item[] itemList = new Item[5];
      
      // Item 1: Spoon
      Item item1 = new Item("Spoon", 14, 1.25);  
      itemList[0] = item1;
      
      // Item 2: Fork
      Item item2 = new Item("Fork", 18, 1.50);
      itemList[1] = item2;
      
      // Item 3: Knife
      Item item3 = new Item("Knife", 12, 2.35);
      itemList[2] = item3;
      
      // Item 4: Dish
      Item item4 = new Item("Dish", 5.95);
      itemList[3] = item4;
      
      // Item 5: Bowl
      Item item5 = new Item("Bowl", 4.99);
      itemList[4] = item5;
      
      // Change the price of fork to $1.75
      item2.setPrice(1.75);
      
      // Change the quantity of Dishes to 5 and Bowls to 8
      item4.setQuantity(5);
      item5.setQuantity(8);
      
      // Change the name of Knife to be Butter Knife
      item3.setDescription("Butter Knife");
      
      
      // Output message using for loop 
      for (int i = 0; i < itemList.length; i++) {
         
         System.out.println("We have " + itemList[i].getQuantity() + " " + itemList[i].getDescription() 
            + "(s) at a price of $" + itemList[i].getPrice() + " each"); 
      
      }
      
      
   }
   



}
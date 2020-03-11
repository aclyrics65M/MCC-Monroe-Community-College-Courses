// Class called Item.java

// Create your own class for store
public class Item {
   
   // Class constant variable MINIMUM_AMOUNT
   private static final int MINIMUM_AMOUNT = 12;
   
   // Instance variables
   private String description;
   private int quantity;
   private double price;
      
   // First constructor
   // Constructor that sets description and price only
   public Item(String describe, double pricetag) {
      this.description = describe;
      this.price = pricetag;
      this.quantity = 0;
   }
      
   // Second constructor that sets all items based on values set in 
   public Item(String describe, int amount, double pricetag) {
      this.description = describe;
      this.quantity = amount;
      this.price = pricetag;
      
    }
      
    // Accessors and Modifiers for all Three instance variables
      
    // Accessor for String description
    public String getDescription() {
      return description;
    }
      
    // Modifier for String description
    public void setDescription(String description) {
      this.description = description;
    }
      
    // Accessor for int quantity
    public int getQuantity() {
      return quantity;
    }
      
    // Modifier for int quantity
    public void setQuantity(int quantity) {
      this.quantity = quantity;
    }
      
    // Accessor for double price
    public double getPrice() {
      return price;
    }
      
    // Modifier for double price
    public void setPrice(double price) {
      this.price = price;
    }
    
    // Boolean method needToOrder()
    public boolean needToOrder() {
      // Item itemObject = null;
      // If else statement
      // If quantity is less than minimum amount true is returned
      if (this.getQuantity() < MINIMUM_AMOUNT) {
         return true;
      } else {
         return false;
      }
             
    }
    
    // toString method
    public String toString() {
      // Create string to return
      String javaFinalString = "Item: " + getDescription() 
         + " Qty: " + getQuantity() + " Cost: $" + getPrice();
      
      // Return statement
      return javaFinalString;
    
    }
    
    // ItemWorth() method
    public double itemWorth() {
      double totalPrice = getPrice() * getQuantity();
      
      // Return statement
      return totalPrice; 
    }
    
    // Method sellSome to reduce quantity of the object
    public void sellSome(int amount) {
      // Reduce the quantity by the amount inputted
      quantity = quantity - amount;
    
    }
    
    // Instance method greaterThan(Item)
    public boolean greaterThan(Item object) {
      
      // If else statement
      if (this.itemWorth() > object.itemWorth()) {
         return true;
      } else {
         return false;
      }
    
    }
   
   
} // End of Item class

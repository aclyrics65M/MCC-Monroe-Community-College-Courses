// Class called store.java

// Create your own class for store
public class Item {
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
   
   
}

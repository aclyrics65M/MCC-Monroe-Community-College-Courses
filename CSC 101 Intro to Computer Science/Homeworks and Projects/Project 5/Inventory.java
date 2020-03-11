/*
* Name: Faraz Mamaghani
* CSC 101: Intro to Computer Science
* Date: 12/14/2017
* Programming Assignment #5
* File: Inventory.java File
*/

/*
   Create an Array of 10 Items (the Inventory).  Do not use a premade class such as ArrayList.  
   We will be adding and removing Items from this Inventory.  Start with an empty array.  
   We will assume that there will always be 10 or less.  When we have less than 10 we will 
   always use only the beginning of the array, the remaining values will be null.  
   If we delete any items in the middle of the list, you must shift them in a way to keep all the items in the beginning.  

   For the main program you will create a text menu that comes up on the output screen
   giving the user a bunch of choices.  As they pick a choice, that action will be done
   and then the menu will repeat to the screen again.  A switch statement and/or having
   a link to additional static methods could be useful.  
*/
import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;
import java.util.InputMismatchException;

public class Inventory {

   public static void main(String[] args) {
   
      // Welcome statement
      System.out.println("Hello! Welcome to the Java Inventory Driver Program for the Item Class!");
      System.out.println(); // blank space
      
      // Create a scanner object
      Scanner objectScanner = new Scanner(System.in);
      
      // DecimalFormat object
      DecimalFormat decimalForm = new DecimalFormat("0.00");
      
      // Create an array of 10 items
      Item itemArray[] = new Item[10];
      
      // Create a boolean variable regulate the while loop
      boolean loopStatus = true;
      
      // Create an integer variable denoting user choice
      int numberChoice = -1;
      
      // Create an integer variable denoting item choice
      int itemChoice;
      
      // Create a variable to denote number of items that need to be ordered
      int itemsNeedOrdering = 0; // Initialize the variable to zero.
      
      // While loop
      while(loopStatus) {
         
         // Display menu of options and prompt user to pick
         
         // Menu of Options
         System.out.println("1. List all items");
         System.out.println("2. List the items that need to be ordered");
         System.out.println("3. Add an item to the inventory");
         System.out.println("4. Report total inventory cost");
         System.out.println("5. Report item that is worth the most");
         System.out.println("6. Sell some of an item");
         System.out.println("7. Remove an item from list");
         System.out.println("8. Clear list - set all array locations to null");
         System.out.println("9. End the program");
         System.out.println(); // blank space
         
         // Prompt the user to choose an option from the menu above
         System.out.print("Please enter a number choice from the menu above (1-9): ");
         
         try {
            numberChoice = objectScanner.nextInt();
            // Check to see if number entered is correct
            while (numberChoice < 1 || numberChoice > 9) {
               System.out.println("Error! Invalid number entered! Enter again! ");
               System.out.print("Please enter a number choice from the menu above (1-9): ");
               numberChoice = objectScanner.nextInt();
            }            
            
            System.out.println(); // blank space
         
         } catch (InputMismatchException e) {
            System.out.println("Error! Please input an integer.");
            objectScanner.next();
         } 
 
         // Create a Switch statement
         switch (numberChoice) {
            // Case 1: List all items
            case 1: System.out.println("Item Inventory List: ");
                    for (int i = 0; i < itemArray.length; i++) {
                        // if statement to check if array location is filled
                        if (itemArray[i] != null) {
                           System.out.println("Item #" + (i+1) + ": " + itemArray[i].toString());
                        } 
                    }
                    System.out.println("\n"); // two blank spaces
                    break;
            
            // Case 2: List the items that need to be ordered
            case 2: System.out.print("List of items that need to be ordered: ");
                    System.out.println(); // blank space
                    
                    for (int k = 0; k < itemArray.length; k++) {
                        // Try-catch statement
                        try  {
                        
                           // if statement to check if item needs to be ordered
                           if (itemArray[k].needToOrder()) {
                              itemsNeedOrdering++; // Increment the items ordering variable
                              System.out.println(itemArray[k].getDescription());   
                           }
                           
                        
                        } catch (NullPointerException e) {
                           //System.out.println(); // blank space
                        
                        }
                        
                    }
                    // Check to see if itemNeedsOrdering is 0
                    if (itemsNeedOrdering == 0) {
                        System.out.println("No item needs to be ordered!");
                    }                     
                    
                    System.out.println("\n"); // two blank spaces
                    break;
                    
            // Case 3: Add an item to the inventory
            case 3: // Create the three input variables for the item (name, amount, price)
                    String itemName;
                    int itemAmount;
                    double itemPrice;
                    
                    // Variable index set to negative one.
                    int firstNull = -1;
                    
                    for (int i = 0; i < itemArray.length  && firstNull == -1; i++) {
                        // if statement to check if index is null
                        if (itemArray[i] == null) {
                           // set firstNull equal to i
                           firstNull = i;
                           // End the loop
                           
                        }
                    }
                    if (firstNull != -1) {
                    
                        System.out.print("Please enter the name of the item " + (firstNull + 1) + ": ");
                        itemName = objectScanner.next();
                        System.out.print("Please enter the amount of the item " + (firstNull + 1) + ": ");
                        itemAmount = objectScanner.nextInt();
                        System.out.print("Please enter the price of the item " + (firstNull + 1) + ": ");
                        itemPrice = objectScanner.nextDouble();
                           
                        // Create a new item and insert the new item into the item array
                        itemArray[firstNull] = new Item(itemName, itemAmount, itemPrice);; 
                    
                    } else {
                        // Report that all items are filled
                        System.out.println("There is no room to add another item. All indexes are full");
                    
                    }                   

                    
                    System.out.println("\n"); // two blank spaces
                     
                    break;
                    
            // Case 4: Report total inventory cost
            case 4: double totalInventoryCost = 0.0;
                    for (int j = 0; j < itemArray.length; j++) {
                        // try catch statement
                        try {
                           double priceValue = itemArray[j].itemWorth();
                           // Add up all the price values together.
                           totalInventoryCost += priceValue;
                        } catch (NullPointerException e) {
                           
                        }   
                    }
                    System.out.println("The total inventory cost is: " + decimalForm.format(totalInventoryCost));
                    System.out.println("\n"); // two blank spaces
                    break;
            
            // Case 5: Report item that is worth the most
            case 5: // Create two variables indexCount and maximumValue
                    int indexCount = 0;
                    int maximumValue = 0;
                    
                    // While loop to search for most expensive price
                    while (indexCount < itemArray.length) {
                        // if statement
                        if (itemArray[indexCount] == null) {
                           // Blank space
                           
                        } else if (itemArray[maximumValue].greaterThan(itemArray[indexCount]) == false) {
                           // Set the most expensive item to the array index in itemArray
                           maximumValue = indexCount;
                        }
                        
                        // Increment the indexCount to proceed to the second item
                        indexCount++;
                    
                    }
                    // Output
                    if (itemArray[maximumValue] != null) {
                        System.out.println("The most expensive item is " + itemArray[maximumValue].getDescription()
                        + " with a total price of " + decimalForm.format(itemArray[maximumValue].itemWorth()));
                    } else {
                        System.out.println("There are no items currently in the item inventory to be compared");
                    }
                    System.out.println("\n"); // two blank spaces
                    break;
                    
            // Case 6: Sell some of an item
            case 6: // List of variables
                    int indexValue = -1;
                    int nullCount = 0;
                    
                    // For loop to check if inventory is empty
                    for (int i = 0; i < itemArray.length; i++) {
                        if(itemArray[i] == null) {
                           nullCount++;
                        }  
                    }
                    
                    if(nullCount >= itemArray.length) {
                    
                        System.out.println("There are no items in the inventory to sell");  
                                 
                    } else {

                        // Prompt user for item to sell
                        System.out.print("Please enter the name of the item to find: ");
                        String inputString = objectScanner.next();
                    
                        for (int countNumber = 0; countNumber < itemArray.length; countNumber++) {
                        
                           // Check to see if the value is not null
                           if (itemArray[countNumber] == null) {
                           
                           } else if (inputString.equals(itemArray[countNumber].getDescription())) {
                              // set index value to the count number
                              indexValue = countNumber;   
                           }
                        

                        }
                    
                        // If else statement
                        if (indexValue != -1) {
                            System.out.print("How much of the item do you want to sell? ");
                            int decrementQuantity = objectScanner.nextInt();  
                            int reducedQuantity = itemArray[indexValue].getQuantity() - decrementQuantity;
                         
                            if (reducedQuantity < 0) {
                              // Reduce the quantity to zero
                              reducedQuantity = 0;
                            } 
                            // Set the array item equal to reduced value
                            itemArray[indexValue].setQuantity(reducedQuantity);                     
                        } else {
                           System.out.println("The item is not found");
                        }
                    
                    
                    }
                    
                    System.out.println("\n"); // two blank spaces
                    
                    break;
                    
            // Case 7: Remove an item from the list
            case 7: // List of variables
                    int indexNumber = -1;
                    int nullNumber = 0;
                    
                    // For loop to check if inventory is empty
                    for (int i = 0; i < itemArray.length; i++) {
                        if(itemArray[i] == null) {
                           nullNumber++;
                        }  
                    }
                    
                    if(nullNumber >= itemArray.length) {
                    
                        System.out.println("There are no items in the inventory to remove");             
                    } else {
                        System.out.print("Which item would you like to remove? ");
                        String itemToRemove = objectScanner.next();

                        for (int countNumber = 0; countNumber < itemArray.length; countNumber++) {
                        
                           // Check to see if the value is not null
                           if (itemArray[countNumber] == null) {
                           
                           } else if (itemToRemove.equals(itemArray[countNumber].getDescription())) {
                              // set index value to the count number
                              indexNumber = countNumber;
                              
                              // Remove the item from the inventory
                              itemArray[indexNumber] = null;    
                           }
                        

                        }
                        // Shift the array down one with for loop
                        for (int countValue = indexNumber; countValue < itemArray.length - 1; countValue++) {
                           itemArray[countValue] = itemArray[countValue + 1];
                           
                        }
                        // Set last entry to null
                        itemArray[itemArray.length - 1] = null; 
                        
                    } 
                    System.out.println("\n"); // two blank spaces
                    
                    break;
                    
            // Case 8: Clear list - set all array locations to null
            case 8: System.out.println("Setting all array locations to null");
                    for (int m = 0; m < itemArray.length; m++) {
                        itemArray[m] = null; // Set each array location to null value
                    }
                    System.out.println("\n"); // two blank spaces
                    break;
                    
            // Case 9: End the program
            case 9: System.out.println("The program is ending!");
                    // Set the loop status to false to break out of the while loop
                    loopStatus = false;
                    break;
                     
                    
         }
    
      
      }
      
      System.out.println(); // blank space
      System.out.println("Thank you very much! Good Bye!");
   
   
   } // End of Main Class

} // End of Inventory Class
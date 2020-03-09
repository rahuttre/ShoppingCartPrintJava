/*
 * Name: Ryan Hutton
 * Assignment: zyBooks Activity 6.20 Online Shopping Cart
 * Course: IT 145 - Foundations of Application Development
 * Institution: Southern New Hampshire University
 * Date: 14 April 2019
 */

/* 
 * Program Summary: This is the class, ItemToPurchase, that supplements the 
 * java file, ShoppingCartPrinter.  This class begins with the standard private 
 * variables and a constructor to initialize each private variables.  Accessor 
 * and mutator methods are also defined below.
*/

package shoppingcartprinter;

public class ItemToPurchase {
    private int itemPrice;
    private int itemQuantity;
    private String itemName;
    
    public ItemToPurchase(){
        itemPrice = 0;
        itemQuantity = 0;
        itemName = " ";
    }
    
    public void setPrice(int newPrice){
        itemPrice = newPrice;
    }
    
    public int getPrice(){
        return itemPrice;
    }
    
    public void setName(String newName){
        itemName = newName;
    }
    
    public String getName(){
        return itemName;
    }
    
    public void setQuantity(int newQuantity){
        itemQuantity = newQuantity;
    }
    
    public int getQuantity(){
        return itemQuantity;
    }    
}

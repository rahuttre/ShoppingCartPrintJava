/*
 * Name: Ryan Hutton
 * Assignment: zyBooks Activity 6.20 Online Shopping Cart
 * Course: IT 145 - Foundations of Application Development
 * Institution: Southern New Hampshire University
 * Date: 14 April 2019
 */

/* 
 * Program Summary: This assignment focused on the creation and implementation 
 * of classes and objects.  The main program below prompts the user to enter 
 * the information for two items and calculates the total cost of those two items.
*/

package shoppingcartprinter;

import java.util.Scanner;

public class ShoppingCartPrinter {

    public static void main(String[] args) {
        ItemToPurchase firstItem = new ItemToPurchase();
        ItemToPurchase secondItem = new ItemToPurchase();
        Scanner scnr = new Scanner(System.in);
        int total = 0;
        
        System.out.println("Item 1");
        System.out.println("Enter the item name: ");
        firstItem.setName(scnr.nextLine());         
        System.out.println("Enter the item price: ");
        firstItem.setPrice(scnr.nextInt());
        System.out.println("Enter the item quantity: ");
        firstItem.setQuantity(scnr.nextInt());
        
        scnr.nextLine();
        
        System.out.println("\nItem 2");
        System.out.println("Enter the item name: ");
        secondItem.setName(scnr.nextLine());         
        System.out.println("Enter the item price: ");
        secondItem.setPrice(scnr.nextInt());
        System.out.println("Enter the item quantity: ");
        secondItem.setQuantity(scnr.nextInt());
        
        System.out.println("\nTOTAL COST");
        System.out.println(firstItem.getName() + " " + firstItem.getQuantity() + 
                " @ $" + firstItem.getPrice() + " = $" + (firstItem.getPrice() *
                        firstItem.getQuantity()));
        
        System.out.println(secondItem.getName() + " " + secondItem.getQuantity() + 
                " @ $" + secondItem.getPrice() + " = $" + (secondItem.getPrice() *
                        secondItem.getQuantity()));
        
        total = firstItem.getPrice() * firstItem.getQuantity() + (secondItem.getPrice() *
                        secondItem.getQuantity());
        
        System.out.println("\nTotal: " + "$" + total);   
    }    
}

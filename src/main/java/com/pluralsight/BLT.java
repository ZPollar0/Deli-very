/* 
BLT.java
This Java file contains the BLT signature sandwich constructor.
*/

package com.pluralsight;

public class BLT extends Sandwich {
    // Create the constructor.
    public BLT() {
        super("White", 8);
        addMeat(new Meat("Bacon", true, 1, 2, 3));
        addCheese(new Cheese("Cheddar", true, 0.75, 1.50, 2.25));
        addTopping(new Toppings("Lettuce"));
        addTopping(new Toppings("Tomato"));
        addSauce(new Sauce("Ranch"));
        setToasted(true);
    }
}
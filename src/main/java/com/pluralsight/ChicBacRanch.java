package com.pluralsight;

public class ChicBacRanch extends Sandwich {
    public ChicBacRanch() {
        super("White",8);
        addMeat(new Meat("Chicken",1,2,3,true));
        addCheese(new Cheese("Pepperjack",true,.50,1.50,2.25));
        addMeat(new Meat("Bacon",1,2,3,false));
        addSauce(new Sauce("Ranch"));
        setToasted(true);
    }

}

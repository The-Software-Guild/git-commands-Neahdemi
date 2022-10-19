package com.sg.foundations.flowcontrol.arrays;

/**
 *
 * @author neahbanberry-duhaney
 */
public class FruitsBasket {

    public static void main(String[] args) {
        String[] fruitBasket = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
            "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple",
            "Orange", "Orange", "Apple", "Apple", "Apple", "Banana", "Apple", "Orange",
            "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple",
            "Apple", "Apple", "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange",
            "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
            "Dragonfruit", "Apple", "Orange", "Orange"};

        int numOranges = 0;
        int numApples = 0;
        int numOtherFruit = 0;
        
        

        // Fruit counting code goes here!

        // Print The Results!
        System.out.println("Total # of fruits in Basket: " + fruitBasket);
        System.out.println("Total # of Apples in Basket: " + numApples);
        System.out.println("Total # of Oranges in Basket: " + numOranges);
        System.out.println("Total # of other fruits in Basket: " + numOtherFruit);

    }
    
}

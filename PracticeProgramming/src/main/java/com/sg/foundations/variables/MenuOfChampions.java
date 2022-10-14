package com.sg.foundations.variables;

/**
 *
 * @author neahbanberry-duhaney
 */
public class MenuOfChampions {
    public static void main(String[] args){
        
        //declare variables
        String foodOne;
        String foodTwo;
        String foodThree;
        double priceOne;
        double priceTwo;
        double priceThree;
        
        //set values to variables 
        foodOne = "Slice of Big Rico Pizza";
        foodTwo = "Invisible Strawberry Pie";
        foodThree = "Denver Omelet";
        priceOne = 500.00;
        priceTwo = 2.00;
        priceThree = 1.50;
        
        //print menu
                
        System.out.println("/\\_/\\_/\\_/\\_/\\_/\\_/\\_/\\_/\\_/\\_/\\_/\\_/\\_/\\_/\\_/\\_/\\_/\\\n" +
"\\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/\n" );
        System.out.println("           WELCOME TO RESTAURANT NIGHT VALE!");
        System.out.println("           Today's Menu Is...\n");
        System.out.println("/\\_/\\_/\\_/\\_/\\_/\\_/\\_/\\_/\\_/\\_/\\_/\\_/\\_/\\_/\\_/\\_/\\_/\\\n" +
"\\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/\n" );
        
        
        System.out.println("          $ " + priceOne + " *** " + foodOne);
        System.out.println("          $ " + priceTwo + " ***** " + foodTwo);
        System.out.println("          $ " + priceThree + " ***** " + foodThree);
        
        // i am still trying to figure out how to have 2 decimal places
        //to make the price correct 
    }
    
}

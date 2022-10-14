package com.sg.foundations.variables;

/**
 *
 * @author neahbanberry-duhaney
 */
public class TheOrderOfThings {
    
    public static void main(String[] args){
        
        double number;
        String opinion, size, age, shape, colour, origin, material, purpose;
        String noun;
        
        number = 5.0;
        opinion = "AWESOME!";
        size = "teensy-weensy";
        age = "new";
        shape = "oblong";
        colour = "pink";
        origin = "Martian";
        material = "platinum";
        purpose = "good";
        
        noun = "dragons";
        
        // Using the + with strings doesn't add -- it concatenates! (sticks them together)
        System.out.println(opinion + " " + number + " " + size + " " + age + " " + shape
                + " " + colour + " " + origin + " " + material + " " + purpose + " " + noun);
      
        // There is not an order i can think off to make this output make sense
        // the program still works no matter the order of the variables
        
    }
    
}

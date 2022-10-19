package com.sg.foundations.flowcontrol.whiles;

/**
 *
 * @author neahbanberry-duhaney
 */
public class WaitAWhile {
    public static void main(String[] args){
        
        int timeNow = 5;
        int bedTime = 10;
        
        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiiiiitle longer...");
            timeNow++; //time passes +1 i.e every hour from 5 to 10
        }
        
        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed...");
    
    }
    
}

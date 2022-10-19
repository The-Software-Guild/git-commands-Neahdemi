package com.sg.foundations.flowcontrol.random;

/**
 *
 * @author neahbanberry-duhaney
 */
public class CoinFlipper {
    public static void main(String[] args){
        
        
        System.out.println("Ready, Set, Flip....!!");
        
        if (Math.random() < 0.5){
            
            System.out.println("You got HEADS!");
        }  else {
            System.out.println("You got TAILS!");
        }
                             
        
        
    }
    
}

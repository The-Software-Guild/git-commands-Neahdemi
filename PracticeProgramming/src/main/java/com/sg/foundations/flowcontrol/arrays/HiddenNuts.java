package com.sg.foundations.flowcontrol.arrays;

import java.util.Random;
/**
 *
 * @author neahbanberry-duhaney
 */
public class HiddenNuts {
    
    public static void main(String[] args) {
        
        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden...");
        
        //Nut finding code should go here
        int num = squirrel.nextInt(42);
        
        System.out.println("Found it!, it's in spot: " + num);
        
        
    }
    
}

package com.sg.foundations.flowcontrol.fors;

/**
 *
 * @author neahbanberry-duhaney
 */
public class ForAndTwentyBlackbirds {
    public static void main(String[] args){
        
        int birdsInPie = 0;
       
        for (int i = 1; i < 24 + 1; i++){
            System.out.println("Blackbird #" + i + " goes into the pie!");
            birdsInPie++;
        }
        
        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");
        
        
        //i changed the i = to make it 1 to 24 instead of 0 to 20
        
    }
    
}

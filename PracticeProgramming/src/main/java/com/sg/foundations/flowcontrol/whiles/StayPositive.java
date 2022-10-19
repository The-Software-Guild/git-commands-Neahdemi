package com.sg.foundations.flowcontrol.whiles;

/**
 *
 * @author neahbanberry-duhaney
 */
public class StayPositive {
    public static void main(String[] args){
        
        int countDown = 11;
        int countUp = 1;
        
        System.out.println("Counting up...");
        
        while (countDown > countUp){
            
            System.out.println(countUp);
            countUp++;
        }
        
        System.out.println("Blast off!!");
    }
    
}

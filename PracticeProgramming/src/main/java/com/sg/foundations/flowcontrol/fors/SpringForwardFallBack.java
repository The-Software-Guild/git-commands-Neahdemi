package com.sg.foundations.flowcontrol.fors;

/**
 *
 * @author neahbanberry-duhaney
 */
public class SpringForwardFallBack {
    
    public static void main(String[] args){
        
        System.out.println("It's spring...!");
        for(int i = 1; i < 10 + 1; i++){
            System.out.println(i + ", ");
        }
        
        System.out.println("\nOh no, it's fall...");
        for(int i = 10; i > 0; i--){
            System.out.println(i + ", ");
        }
    }
    
}

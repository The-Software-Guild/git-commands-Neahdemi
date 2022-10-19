package com.sg.foundations.flowcontrol.fors;

/**
 *
 * @author neahbanberry-duhaney
 */
public class ForByFor {
    
    public static void main(String[] args){
        
        for(int i = 0; i<3; i++){
            System.out.println("|");
            
            for(int j = 0; j < 3; j++){
                for(int k = 0; k <3; k++){
                    System.out.println("*");
                }
                System.out.println("|");
            }
            System.out.println("");
        }
        
        
    }
    
}

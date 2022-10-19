package com.sg.foundations.flowcontrol.fors;

/**
 *
 * @author neahbanberry-duhaney
 */
public class DifferentKettleOfFish {
    
    public static void main(String[] args){
        
        int fish = 1;
        while(fish<10){
            switch (fish) {
                case 3:
                    System.out.println("RED fish!");
                    break;
                case 4:
                    System.out.println("BlUE fish!");
                    break;
                default:
                    System.out.println(" fish!");
                    break;
            }
            fish++;
        }
        
        
        
        
    }
}

//my code should look like this;
/**
 1 fish!
 2 fish!
RED fish!
BLUE fish!
5 fish!
6 fish!
7 fish!
8 fish!
9 fish!
10 fish!
*/ 
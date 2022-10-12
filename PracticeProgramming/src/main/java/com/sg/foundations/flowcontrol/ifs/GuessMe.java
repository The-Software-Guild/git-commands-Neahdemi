package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;
/**
 *
 * @author neahbanberry-duhaney
 */
public class GuessMe {
    public static void main(String [] args) {
        int chosenNumber = 25;
        int numberGuess;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("I have chosen a number i bet you can't guess it...go on!");
            numberGuess = myScanner.nextInt();
        
        if(numberGuess == chosenNumber){
            System.out.println("Wow, nice guess! That was it!");
        } else if(numberGuess > chosenNumber){
            System.out.println("Ha, nice try -too low! i chose 25!");
        } else if(numberGuess > chosenNumber){
            System.out.println("Too bad, way too high! I chose 25!");
        }
        
        
    }
    
}

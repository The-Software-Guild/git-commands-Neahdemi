package com.sg.foundations.flowcontrol.random;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author neahbanberry-duhaney
 */
public class GuessMeMore {
        public static void main(String [] args) {
        Scanner myScanner = new Scanner(System.in);
        Random rm = new Random();
        
        int numberGuess;
        
        int chosenNumber = rm.nextInt((-101 + 200));
        
       
        
        System.out.println("I have chosen a number between -100 and 100 "
                + "i bet you can't guess it...go on!");
            numberGuess = myScanner.nextInt();
        
        if(numberGuess == chosenNumber){
            System.out.println("Wow, nice guess! That was it!");
        } else if(numberGuess > chosenNumber){
            System.out.println("Ha, nice try too high! i chose " + chosenNumber + "!");
        } else if(numberGuess > chosenNumber){
            System.out.println("Too bad, way too low! I chose " + chosenNumber + "!");
        }
        
        
    }
}

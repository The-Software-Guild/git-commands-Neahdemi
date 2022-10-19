package com.sg.foundations.flowcontrol.random;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author neahbanberry-duhaney
 */
public class HighRoller {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Random diceRoller = new Random();
        
        int rollResult = diceRoller.nextInt(6) + 1;
        int diceSides;
        
        System.out.println("How many side does a dice have?");
        diceSides = Integer.parseInt(sc.nextLine());
        
        
        System.out.println("TIME TO ROOOOOLL THE DICE between 1 - " + diceSides + "!");
        System.out.println("I rolled a " + rollResult);
        
        if (rollResult == 1){
            System.out.println("You rolled a critical failure");
        }
        if (rollResult == 6 + 1) {
            System.out.println("You rolled a critical! Nice Job!");
        }
       
        
    }
    
}

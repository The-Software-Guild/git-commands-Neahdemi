package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;
/**
 *
 * @author neahbanberry-duhaney
 */
public class KnockKnock {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.print("Knock Knock! Guess who!! ");
        String nameGuess = inputReader.nextLine();
        // == compares the refernces of the variable where .equals() compares
        //the values which is what you want

        if(nameGuess.equals("Marty McFly")){
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".... from the Future."); // Sorry, had to!
        }else{
            System.out.println("Dude, do I -look- like " + nameGuess);
        }
    }
    
}

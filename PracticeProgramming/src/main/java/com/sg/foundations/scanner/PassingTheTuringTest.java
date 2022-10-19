package com.sg.foundations.scanner;
import java.util.Scanner;

/**
 *
 * @author neahbanberry-duhaney
 */
public class PassingTheTuringTest {
    public static void main(String[] args){
        
        String yourName, colour, faveFood;
        int faveNum;
       
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hello there! \nWhat is your name?");
        yourName = sc.nextLine();
        
        System.out.println("Hi, " + yourName + "! I'm Neah. \nWhat is your"
                + " favourite colour?");
        colour = sc.nextLine();
        
        System.out.println("Huh, " + colour + "? Mine's Orange. \nI really like"
                + " oranges. They are my favourite fruit too. \nWhat's YOUR favourite"
                + " fruit " + yourName + "?" );
        faveFood = sc.nextLine();
        
        System.out.println("Really? " + faveFood +"? That's wild! \nSpeaking of favourites"
                + ", what's your favourite number?");
        faveNum = Integer.parseInt(sc.nextLine());
        
        System.out.println(faveNum + " is a cool number. Mine is 4. \nDid you know "
                + " that " + faveNum + " * 4 is " + (faveNum * 4) + "? That's a cool "
                        + "number too!");
        
        System.out.println("Well, thanks for talking to me, " + yourName + "!");
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
}

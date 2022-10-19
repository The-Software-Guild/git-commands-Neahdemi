package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;
/**
 *
 * @author neahbanberry-duhaney
 */
public class YourLifeInMovies {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String yourName;
        int birthYear;
        
        System.out.println("Hey, let's play a game! What's your name?");
        yourName = sc.nextLine();
        
        System.out.println("Ok, " + yourName + " when were you born?");
        birthYear = Integer.parseInt(sc.nextLine());
        
        System.out.print("Well " + yourName + "... \nDid you know that ");
        
        if (birthYear < 2005){
            System.out.println("Pixar's 'Up' came out over a decage ago");        
        }
        if (birthYear < 1995){
            System.out.println("And the first Harry Potter movie came out over 15"
                    + " years ago");
        }
         if (birthYear < 1985){
            System.out.println("Also, Space Jam came out not last decade but one"
                    + " before THAT");
        }
         if (birthYear < 1975){
            System.out.println("Even the original Jurassic Park release is closer to"
                    + " the first lunar landing than it is to today");
        }
         if (birthYear < 1965){
            System.out.println("And can you belive the MASH TV series has been "
                    + "around for almost half a decade");
        }
        
        
        
        
        
    }
    
}

package com.neahdemi.basicprogrammingconceptsassessment;

//import Scanner and Random for game to work properly
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author neahbanberry-duhaney
 */
public class RockPaperScisssors {
    public static void main(String[] args) {
        Scanner usrChoice = new Scanner(System.in);
        Random compChoice = new Random();
        int winsUser = 0;
        int winsComp = 0;
        int winsTie = 0;
        
        //Introduce the game and user inputs how many rounds they want to play
        while (true){
            System.out.println("\nWelcome to Rock, Paper, Scissors");
            System.out.println("How many rounds would you like to play? (Please choose between 1 and 10 rounds)");
                int roundsCount = usrChoice.nextInt();
                
        //if user enters a # outside  of 1 to 10, then the program ends
        if (roundsCount < 1 || roundsCount > 10){
            System.out.println("You must enter amount of rounds between 1 and 10 only! ");
            break;
        }
          
        // the game itself
        for (int i = 1; i <= roundsCount; i++) {
            
            System.out.println("\nGame " + i + ": " + "Type 1 for Rock, 2 for Paper, or 3 for Scissors");
            //user choices
            int numChoice = usrChoice.nextInt();
            switch (numChoice){
                
                case 1:
                    numChoice = 1;
                    System.out.println("\nYou chose: Rock");
                    break;
                case 2:
                    numChoice = 2;
                    System.out.println("\nYou chose: Paper");
                    break;
                case 3:
                    numChoice = 3;
                    System.out.println("\nYou chose: Scissors");
                    break;
            
            
        }
        if (numChoice == 1 || numChoice ==2 || numChoice == 3){                                      
        } else {
            System.out.println("You have entered an inccorect value!!");
            break;
        }
        
        //computer choice
        int numChoice2 = compChoice.nextInt(3) + 1;
        switch (numChoice2) {
            
            case 1:
                numChoice2 = 1;
                System.out.println("Your opponents chose: Rock");
                break;
            case 2:
                numChoice2 = 2;
                System.out.println("Your opponents chose: Paper");
                break;
            case 3:
                numChoice2 = 3;
                System.out.println("Your opponents chose: Scissors");
                break;    
        }
        
        //rules of the game
        if (numChoice == 1 && numChoice2 == 1){
            System.out.println("Winner: TIE!");
            winsTie++;
        }
        if (numChoice == 2 && numChoice2 == 1){
            System.out.println("Winner: USER!");
            winsUser++;
        }
        if (numChoice == 3 && numChoice2 == 1){
            System.out.println("Winner: COMPUTER!");
            winsComp++;
        }
        if (numChoice == 1 && numChoice2 == 2){
            System.out.println("Winner: COMPUTER!");
            winsComp++;
        }
        if (numChoice == 2 && numChoice2 == 2){
            System.out.println("Winner: TIE!");
            winsTie++;
        }
        if (numChoice == 3 && numChoice2 == 2){
            System.out.println("Winner: USER!");
            winsUser++;
        }
        if (numChoice == 1 && numChoice2 == 3){
            System.out.println("Winner: USER!");
            winsUser++;
        }
        if (numChoice == 2 && numChoice2 == 3){
            System.out.println("Winner: COMPUTER!");
            winsComp++;
        }
        if (numChoice == 3 && numChoice2 == 3){
            System.out.println("Winner: TIE!");
            winsTie++;
        }                
        
    }
    //final print statement; the results
    System.out.println("\nUser Wins: " + winsUser);
    System.out.println("Computer Wins: " + winsComp);    
    System.out.println("Its a Tie!: " + winsTie);    
    
    if (winsUser > winsComp)
        System.out.println("Overall Winner: USER!! CONGRATS!");
    if (winsUser < winsComp)
        System.out.println("Overall Winner: COMPUTER!! Better luck next time!");
    if (winsUser == winsComp)
        System.out.println("NO OVERALL WINNER!");
    
   
    System.out.println("\nWould you like to play again? 'Y' or 'N'? ");
        usrChoice.nextLine();
        
    if (usrChoice.nextLine().toUpperCase().equals("N")){
        System.out.println("Thanks for Playing!");
        break;
    }
    
                       
    } //end of while true loop
        
        
       
        
    
    }
    
}

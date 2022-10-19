package com.sg.foundations.scanner;
import java.util.Scanner; //it is import anything before the class
/**
 *
 * @author neahbanberry-duhaney
 */
public class QuestForTheUserInput {
    
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);
        
        String yourName;
        String yourQuest;
        double velocityOfSwallow;
        
        //we can use the Scanner's readLine to assign value to our strings
        //beacuse its return type is string
        System.out.println("What is your name?");
        yourName = inputReader.nextLine();
        
        System.out.println("What is your Quest?! ");
        yourQuest = inputReader.nextLine();
        // When we get to our double data type, we can use Scanner's nextDouble method
        // or we can use the Double.parseDouble to convert the nextLine's String
        
        System.out.println("What us the airspeed velocity of an"
                + " unlanden swallow?");
        velocityOfSwallow = Double.parseDouble(inputReader.nextLine());
        
        System.out.println();
        System.out.println("How do you know " + velocityOfSwallow + " is correct, "
         + yourName + "?");
        System.out.println("You didn't even know if the swallow was"
                + " African or European!");
        System.out.println("Maybe skip answering things about birds and instead go "
        + yourQuest + ".");
        
        
        
    }
    
}

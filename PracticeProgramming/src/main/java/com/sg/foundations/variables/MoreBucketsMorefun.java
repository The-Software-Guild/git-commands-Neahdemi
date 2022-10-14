
package com.sg.foundations.variables;

/**
 *
 * @author neahbanberry-duhaney
 */
public class MoreBucketsMorefun {
    public static void main(String[] args){
        
        //Declare ALL THE THINGS!
        //It is a god idea to declare them at the beginning of a program
        int butterflies, beetles, bugs;
        
        //now give a couple of the some values
        butterflies = 5;
        beetles = 9;
        bugs = butterflies + beetles;
        
        System.out.print("There are only " + butterflies + " butterflies, ");
        System.out.println("but there are " + bugs + " bugs in all.");
        
        System.out.println("Uh oh, my dog ate one.");
        butterflies--; //this is the operator that shows the dog at a bug
        System.out.println("Now there are only " + butterflies + " bugs left...");
        
        System.out.println("But there are still " + bugs + " bugs left...");
        //the number of bugs does not change when we change the butterflies because
        // we did not create a math code that allows the computer to change the amount
        System.out.println("Wait a minute!");
        System.out.println("... mayabe my computer can't do the math after all!");
    }
    
}

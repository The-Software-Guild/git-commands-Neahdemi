

package com.neahdemi.codealonginputs;

// import the Scanner
import java.util.Scanner;

/**
 *
 * @author neahbanberry-duhaney
 */
public class CodeAlongInputs {

    public static void main(String[] args) {
        
        //declare and inisitalse the Scanner
        Scanner myScanner = new Scanner(System.in);
        
        //declare varibales for height and width 
        float height;
        float width;
        
        //declare String variables to hold the user's height and
        //width input
        String stringHeight;
        String stringWidth;
        
        //declare other varibales 
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        
        //get input from the user
        System.out.println("Please enter window height: ");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window width: ");
        stringWidth = myScanner.nextLine();
        
        //convert String values of height and width to float value 
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        
        //calcuate the area of the window 
        areaOfWindow = height * width;
        
        //calculate the perimeter of the window
        perimeterOfWindow = 2 * (height + width);
        
        //calculate the total cost - use a hard-coded value
        //for material cost
        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));
        
        //display the results to the user 
        System.out.println("Window height =" + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost =  " + cost);
        
        
    }
}

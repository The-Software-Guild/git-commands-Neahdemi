package com.sg.foundations.flowcontrol.arrays;

/**
 *
 * @author neahbanberry-duhaney
 */
public class ArraysVideoExample {
    public static void main(String[] args){
        //single-dimensional arrays
        int[] teamScores;
        
        teamScores = new int[5];
        
        teamScores[0] = 2;
        teamScores[1] = 45;
        teamScores[2] = 4;
        teamScores[3] = 8;
        teamScores[4] = 99;
        
        
        int[] golfScores = {72, 74, 68, 71}; //quicker version of the first int array
        
        int currentGolfScore = golfScores[0];//this means the current score is 72
                                              //as it is the first index of our array 
        
        golfScores[2] = 70; //this means we change index 2 which is 68 to 70 instead
        
        for(int i = 0; i < golfScores.length; i++) { //we keep going as long as golfscores is less than the length
            System.out.println(golfScores[i]);
            
        }
        //enhanced for loop
        for(int currentScore : golfScores) { 
        //for each int currentScore that is in golfScore, goes into current score
            System.out.println(currentScore);
        }
        
        
        
    }
    
}

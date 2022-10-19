package com.sg.foundations.flowcontrol.arrays;

/**
 *
 * @author neahbanberry-duhaney
 */
public class ArraysVideoExample2 {
    public static void main(String[] args){
        //two-diminsional arrays
        
        //think of this as a grid that always starts at 0
        String [][] cityTeamNames = {
            {"Cleveland", "Browns", "Cavs", "Indians"},
            {"Columbus", "Bluejackets", "Buckeyes"},
            {"Pittsburgh", "Steelers", "Pirates", "Penguins"},
        };
        
        //System.out.println(cityTeamNames[0][0]); //prints out cleveland
        //as it is row 0 and index 0, meaning the first of the array 
        //System.out.println(cityTeamNames[1][0]);
        //System.out.println(cityTeamNames[1][2]);
        //System.out.println(cityTeamNames[2][3]);
        
        for(int i = 0; i < cityTeamNames.length; i++){
            for(int j = 0; j < cityTeamNames[i].length; j++){//nested for loops
                System.out.print(cityTeamNames[i][j] + " ");
            }
            System.out.println();
        }
            
    }
    
}

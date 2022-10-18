package com.neahdemi.basicprogrammingconceptsassessment;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author neahbanberry-duhaney
 */
public class DogGenetics {
    public static void main(String[] args){       
       
                Random random = new Random();
        Scanner inputValue = new Scanner(System.in);

        System.out.println("What is your dog's name?");
        String input = inputValue.nextLine();

        System.out.println("\n Well then, I have this highly reliable report on " 
                + input + "'s prestigious background right here. \n ");
        System.out.println(input + " is: \n");

        String[] breeds = {"Labrador", "Chihuahua", "Dachshund", "Dalmation", "Jack Russell"};

        int percent1 = random.nextInt(101);
        int percent2 = random.nextInt(101 - percent1);
        int percent3 = random.nextInt(101 - percent1 - percent2);
        int percent4 = random.nextInt(101 - percent1 - percent2 - percent3);
        int percent5 = 100 - percent1 - percent2 - percent3 - percent4;

        int[] randomPercents = new int[]{percent1, percent2, percent3, percent4, percent5};

        for (int i = 0; i < 5; i++) {
            System.out.println(randomPercents[i] + "% " + breeds[i]);
        }

        System.out.println("Wow, that's QUITE the dog! ");
    }
    
}

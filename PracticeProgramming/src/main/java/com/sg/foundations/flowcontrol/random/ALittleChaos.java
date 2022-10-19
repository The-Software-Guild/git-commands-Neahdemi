package com.sg.foundations.flowcontrol.random;
import java.util.Random;
/**
 *
 * @author neahbanberry-duhaney
 */
public class ALittleChaos {
     public static void main(String[] args){
        
        Random randomiser = new Random();
        
        System.out.println("Random can make integers: " + randomiser.nextInt());
        System.out.println("Or a double: " + randomiser.nextDouble());
        System.out.println("Or even a boolean: " + randomiser.nextBoolean());
        
        int num = randomiser.nextInt(100);
        
        System.out.println("You can store a randomised result: " + num);
        System.out.println("And use it over and over again " + num + ", " + num);
        
        System.out.println("Or just keep generating new values");
        System.out.println("here's a bunch of random numbers from 0 - 100: ");
        
        System.out.print(randomiser.nextInt(101) + ", ");
        System.out.print(randomiser.nextInt(101) + ", ");
        System.out.print(randomiser.nextInt(101) + ", ");
        System.out.print(randomiser.nextInt(101) + ", ");
        System.out.print(randomiser.nextInt(101) + ", ");
        System.out.println(randomiser.nextInt(101));
        
     }
}

package com.sg.foundations.flowcontrol.methods;
import java.util.Random;
/**
 *
 * @author neahbanberry-duhaney
 */
public class BarelyControlledChoas {
    static Random randomColour = new Random();
    public static void main(String[] args){
        
        String colour = getColour();//call colour method here 
        String animal = getAnimal(); //call animal method here
        String colourAgain = getColour(); //call colour method again here
        int weight = getWeight(); //call number method with a range between 5-200
        int distance = getDistance(); //call number method with a range between 10-20
        int number = getNumber(); //call number method with range between 10000-20000
        int time = getTime(); //call number method with range between 2-6
        
        System.out.println("Once, when I was very small...");
        
        System.out.println("I was chased by a " + colour + ", " + weight +
                "lb " + " minitature " + animal + " for over " + distance + " miles!!");
        
        System.out.println("I had to hide in a field of over " + number + " " + 
                colourAgain + " poppies for nearly " + time + " hours until it left"
                        + " me alone!");
        
        System.out.println("\nIt was QUITE the experience, let me tell you");
    }
    
    
    //?? Method 1 ??
    public static String getColour(){
        String[] colour = new String[]{"pink", "blue", "green", "yellow", "purple"};
        int randomInt = randomColour.nextInt(colour.length);
        return colour[randomInt];
         }
    //??Method 2??
    public static String getAnimal(){
        String[] animal = new String[]{"tiger", "cat", "dog", "rabbit", "monkey"};
        int randomInt = randomColour.nextInt(animal.length);
        return animal[randomInt];
         }
    //??Method 3??
    public static int getWeight(){
        return (int)(Math.random() * (200 - 5) + 5);
    }
    public static int getDistance(){
        return (int)(Math.random() * (20 - 10) + 10);   
    }
    public static int getNumber(){
        return (int)(Math.random() * (20000 - 10000) + 10000);
    }
    public static int getTime(){
        return (int)(Math.random() * (6 - 2) + 2);
    }
    
    
    
    
}

package com.sg.foundations.flowcontrol.arrays;
import java.util.Arrays;
/**
 *
 * @author neahbanberry-duhaney
 */
public class FruitSalad {
    
    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato",
            "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", 
            "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", 
            "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple",
            "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad = new String[12];
       // System.out.println(Arrays.toString(fruitSalad));
        
        // Code Recipe for fruit salad should go here!
        int apples = 0;
        int oranges = 0;
        
        for(int i=0; i < fruitSalad.length; i++){
            do{
                if(fruit[i].contains("berry")){
                    fruitSalad[i] = fruit [i];
                }else if (fruit[i].contains("Apple")){
                    if (apples <2){
                        fruitSalad[i] = fruit[i];
                        apples += 1;
                    }
                }else if (fruit[i].contains("Orange")){
                    if (oranges <2){
                        fruitSalad[i] = fruit[i];
                        oranges += 1;
            }            
                
        }else if (fruit[i].contains("Tomato")){
                        fruitSalad[i] = fruit[i];
                        
   }
               // System.out.println(Arrays.toString(fruitSalad));
    
        }while (fruitSalad.length < 12);
      }
        System.out.println("My fruit salad contains:\n " + Arrays.toString(fruitSalad) );
    }
    }


/**
 * Your friends have decided to throw a digital potluck. After seeing you mucking 
 * about with all the apples and oranges from before, they have tasked you with making 
 * the fruit salad. However, while you have a lot of different fruit on hand, you know 
 * that just throwing them all together isn't the best idea, so you researched recipes.

According to your research, the best kind of fruit salad has:

As many berries as possible
No more than three kinds of apples
No more than two kinds of orange
Definitely no tomatoes
No more than twelve kinds of fruit
Write code to sort through fruits below and put all the proper fruits in the fruitSalad
* array. Afterwards, print out the total number and types of fruit in your fruit salad!
 */
            
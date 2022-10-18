package com.neahdemi.basicprogrammingconceptsassessment;
import java.util.stream.*;
//import java.io.*;
import java.util.*;
/**
 *
 * @author neahbanberry-duhaney
 */
public class SummativeSums {
    
    public static void main(String[] args) {
        
        //Iniliaise arroays with values 
        int[] array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] array2 = { 999, -60, -77, 14, 160, 301 };
        int[] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
                            140, 150, 160, 170, 180, 190, 200, -99 }; 
        
        //Calculate sum of integers in array stream method from java util classes
        int sum1 = IntStream.of(array1).sum();
        int sum2 = IntStream.of(array2).sum();
        int sum3 = IntStream.of(array3).sum();
        
        //Print to console
        System.out.println("The array sum: " + Arrays.toString(array1) + " " + "is: ");
        System.out.println(sum1);
        System.out.println("The array sum: " + Arrays.toString(array2) + " " + "is: ");
        System.out.println(sum2);
        System.out.println("The array sum: " + Arrays.toString(array3) + " " + "is: ");
        System.out.println(sum3);
    }
    
}

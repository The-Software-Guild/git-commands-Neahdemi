package com.neahdemi.interestcalculator;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author neahbanberry-duhaney
 */
public class InterestCalculator {
        
        private static final DecimalFormat df = new DecimalFormat("0.00");

        public static void main(String[] args) {
        // PROMPT FOR:
        Scanner scanner = new Scanner(System.in);
        
        // Annual interest rate
        System.out.println("What is the annual interest rate % growth?");
        double annualInterestRate = scanner.nextDouble();
        
        // Initial amount of principal (original amount borrrowed)
        System.out.println("Initial amount of principal:");
        double currentBalance = scanner.nextDouble();
        
        // No. years money is to stay in the fund
        System.out.println("How many years will you invest for?");
        int years = scanner.nextInt();
        
        
        // quarterly 
        double quarterlyInterestRate = annualInterestRate / 4;
        
        
        // OUTPUT
        for(int x = 1; x <= years; x++) {
        // year number
            System.out.println("Year " + x + ":");
        // principal at the beginning of the year
            System.out.println("Began with $" + df.format(currentBalance));
        // total amount of interest earned for the year
            double thisYear = 0;
            for (int i = 0; i < 4; i++){
                thisYear = currentBalance * (1 + (quarterlyInterestRate / 100));
            }
            double interestEarned = thisYear - currentBalance;
            System.out.println("Earned $" + df.format(interestEarned));
        // principal at the end of the year
            for (int i = 0; i < 4; i++){
                currentBalance *= (1 + (quarterlyInterestRate / 100));
            }
            System.out.println("Ended with $" + df.format(currentBalance) + "\n");
            
        }
    }
}

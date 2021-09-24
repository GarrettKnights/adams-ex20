/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Garrett Adams
 */

package Exercise20;

import java.util.Scanner;

public class Solution20 {
    public static void main(String[] args) {

        //Declares the variables that we will be using
        int amount;
        String state;
        String county;
        double tax = 0;

        //Initializes the scanner
        Scanner ScanWord = new Scanner(System.in);

        //Asks user for input
        System.out.println("What is the order amount? ");
        //Scans input to amount
        amount = ScanWord.nextInt();
        //Asks user for input
        System.out.println("What state do you live in? ");
        //Scans input to state
        state = ScanWord.next();
        System.out.println("What county do you live in? ");
        //Scans input to county
        county = ScanWord.next();

        //If state is Wisconsin
        if (state.equalsIgnoreCase("Wisconsin")) {
            //If county is Eau Claire
            if (county.equalsIgnoreCase("Eau Claire" )) {
                //Calculates tax
                tax = amount * 0.055;
                //Rounds tax to nearest cent
                double tax2 = Math.ceil(tax * 100.0) / 100.0;
            }
            //If county is Dunn
            else if (county.equalsIgnoreCase("Dunn" )){
                //Calculates Tax
                tax = amount * 0.054;
                //Rounds tax to nearest cent
                double tax2 = Math.ceil(tax * 100.0) / 100.0;
            }

            //If state is Illinois
        }
        else if (state.equalsIgnoreCase("Illinois")){
            //Calculates Tax
            tax = amount * 0.08;
            //Rounds tax to nearest cent
            double tax2 = Math.ceil(tax * 100.0) / 100.0;
        }
        //If neither state
        else {
            tax = 0;
        }

        //Calculates the total
        double total = tax + amount;
        double total2 = Math.ceil(total * 100.0) / 100.0;
        System.out.println("The tax is $" + tax + ".\nThe total is $" + total2 + ".");
    }
}

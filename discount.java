//program to calculate discount with the users input
/*
Author: Samuel Gitonga
Reg No: CT101/G/19433/23
Date: 30/01/2025

using a method
 */

import java.util.Scanner; //importing the scanner


public class discount {
    public static String getDiscount(double amount) {
        Double discount = 0.0;

        //if statement to determine the discount to be awarded
        if (amount > 5000) {
            discount = 0.1 * amount;
            return "Discount is " + discount;
        } else if (amount >= 1000 && amount <= 5000) {
            discount = 0.05 * amount;
            return "Discount is " + discount;
        } else if (amount < 1000) {
            discount = 0 * amount;
            return "Discount is " + discount;
        } else {
            return "No discount";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating Scanner object
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble(); // Getting user input

        String discount = getDiscount(amount); // calling the method
        System.out.println(discount);

        scanner.close();// Print the result
    }
}

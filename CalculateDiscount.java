//program to calculate Discount without user input
/*
Author: Samuel Gitonga
Reg No: CT101/G/19433/23
Date: 20/01/2025

using a method
 */

public class CalculateDiscount {
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
        String discount = getDiscount(3000); //calling the method
        System.out.println(discount); //getting the results
    }
}

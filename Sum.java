//program to calculate sum of two numbers
/*
Author: Samuel Gitonga
Reg No: CT101/G/19433/23
Date: 21/01/2025

version 1
 */

import java.util.Scanner; //import the scanner

public class Sum{
    public static void main(String[]args){
        Scanner myOBJ= new Scanner(System.in);

        //user inputs first number
        System.out.print("Enter first number: ");
        double number1 = myOBJ.nextDouble();

        //user inputs second number
        System.out.print("Enter second number: ");
        double number2 = myOBJ.nextDouble();

        //initialize sum to add the two numbers
        double sum;
        sum=number1+number2;

        //print out the sum if the two numbers
        System.out.println("The sum is: " + sum);

        //close scanner
        myOBJ.close();
    }
}
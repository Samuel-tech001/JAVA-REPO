//program to calculate the net bonus of employees
/*
Author: Samuel Gitonga
Reg No: CT101/G/19433/23
Date: 21/01/2025
version 2
 */
import java.util.Scanner; //import the scanner


public class Bonus {
    public static void main(String[]args){
        Scanner myOBJ=new Scanner(System.in);

        //user enters their salary
        System.out.print("Enter you salary: ");
        int salary = myOBJ.nextInt();

       //user enters the number of years served at the company
        System.out.print("Enter number of years: ");
        int years = myOBJ.nextInt();


        //initializing the bonus
        double bonus=0;
        //using if else statement to determine the bonus as per employee
        if (years>10){
            bonus=0.12;
        } else if (years>=6 && years <=10) {
            bonus=0.1;
        }else if (years<6){
            bonus=0.08;
        }
        else {
            System.out.println("Invalid Input");
        }
        //initializing the net bonus
        double netbonus;
        netbonus=salary*bonus;
        //print out the employees net bonus
        System.out.println("Your net bonus is: " + netbonus);
        //close scanner
        myOBJ.close();

    }
}
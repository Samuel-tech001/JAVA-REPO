//program to calculate the net bonus of employees
/*
Author: Samuel Gitonga
Reg No: CT101/G/19433/23
Date: 06/02/2025
calculate the net bonus
 */

import java.util.Scanner;

//class employees
public class Employee{
    //attributes in the class
    String name;
    double salary;
//constructor
    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
//the output that is to be displayed
    public void displayDetails(){
        System.out.println("Employee name is "+ name);
        System.out.println("Salary is "+salary);
    }
}
//class SalaryCalculator
class SalaryCalculator{
    public double calculateBonus(double salary){
        return salary*0.1;
    }
}
//class MainApp
class MainApp2{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);//scanner
//users inputs
        System.out.print("Enter Employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(name,salary);
        SalaryCalculator calculator = new SalaryCalculator();
        double bonus = calculator.calculateBonus(salary);

        employee.displayDetails();
        System.out.println("Bonus is "+bonus);

        scanner.close();//close the scanner

    }
}
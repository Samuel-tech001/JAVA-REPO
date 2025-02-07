//program to calculate students grades
/*
Author: Samuel Gitonga
Reg No: CT101/G/19433/23
Date: 06/02/2025
calculate grades
 */

import java.util.Scanner;//importing the scanner
//public class students
public class Student {
    String name;
    double marks;

    public Student(String name, double marks){
        //attributes in class student
        this.name=name;
        this.marks=marks;
    }

//outputs to be displayed
    public void displayDetails(){
        System.out.println("Student name is "+ name);
        System.out.println("Marks: "+marks);
    }

}
//class GradeCalculator
class Gradecalculator{
    public String calculateGrade(double marks) {
        //if statement to compute the grade awarded
        if (marks >= 90 && marks <= 100) {
            return "A";
        } else if (marks >= 75 && marks < 90) {
            return "B";
        } else if (marks >= 50 && marks < 75) {
            return "C";
        } else if (marks < 50) {
            return "D";
        } else {
            return "Invalid marks";
        }
    }
}
//class MainApp
 class MainApp{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);//scanner
//users inputs
        System.out.print("Enter students name: ");
        String name = scanner.nextLine();

        System.out.print("Enter students marks: ");
        double marks = scanner.nextDouble();



        Student student = new Student(name,marks);
        Gradecalculator calculator = new Gradecalculator();
        String grade = calculator.calculateGrade(marks);

        student.displayDetails();
        System.out.println("Grade is "+ grade);

        scanner.close();//close the scanner
    }
}
package chapter3;

/*
* LOGICAL OPERATORS:
* To qualify for a loan, a person must make at least $30,000
* and have been working at their current job for at least 2 years.
*
* */

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {
    public static void main(String[] args) {
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        System.out.println("Enter your salary: ");
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();

        System.out.println("Enter the number of years with your current employer:");
        int years = sc.nextInt();

        if (salary >= requiredSalary && years >= requiredYearsEmployed){
            System.out.println("Congrats! You qualify for the loan.");
        }else {
            System.out.println("Sorry, you must earn at least $" + requiredSalary + " to qualify for the loan.");
        }



    }
}

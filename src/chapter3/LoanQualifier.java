package chapter3;

/*
 * NESTED IFS
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 * */

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {

//        Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;


//        Get what we don't
        System.out.println("Enter you salary: ");
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();

        System.out.println("Enter the number of years with your current employer: ");
        double years = sc.nextDouble();

        sc.close();
//        Make decision
        if (salary >= requiredSalary){
            if (years >= requiredYearsEmployed){
                System.out.println("Congrats! You qualify for the loan.");
            }else {
                System.out.println("Sorry, you must have worked at your current job " +
                        requiredYearsEmployed + " years.");
            }
        }else {
            System.out.println("Sorry, you must earn at least $ " + requiredSalary + " to qualify for the loan.");
        }

    }
}

package chapter4;

import java.util.Scanner;

/*
prompt the user to enter their first number
then prompt them to enter the second number
add those numbers up
then ask them if they’d like to do another calculation
*/
public class AddNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean again;
        do {
            System.out.println("Enter the first number:");
            double num1 = sc.nextDouble();

            System.out.println("Enter the second number:");
            double num2 = sc.nextDouble();

            double sum = num1 + num2;

            System.out.println("The sum is:" + sum);

            System.out.println("Would you like to start over? True or False");
            again = sc.nextBoolean();

        }while (again);

        sc.close();
    }
}

package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Get the number of hours worked
        System.out.print("Enter the number of hours the employee worked: ");
//                Get the hourly pay rate
        int hours = sc.nextInt();
        System.out.print("Enter the hourly pay rate: ");
        double rate = sc.nextDouble();
        sc.close();
//                Multiply hours and pay rate
        double grossPay = hours * rate;
//
//                Display Result
        System.out.println("The employee Gross Pay Rate is  $" + grossPay);
    }
}

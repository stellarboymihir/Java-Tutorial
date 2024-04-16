package chapter3;

/*
* The objective of the game is to enter enough change to equal exactly $1!
* Create a program that asks user to enter the quantities for the following coins:
* pennies, nickels, dimes and quarters.
* Your program should count up the value of all the change.
* If it's exactly $1, they win! If it's more than $1, tell them by how much
* they went over. If it's less than $1, tell them by how much they went under.
* Feel free to change the game for your country's currency!
*  */

import java.util.Scanner;

public class DollarGame {
    public static void main(String[] args) {

//    Initialize the values
        double pennies = .01;
        double nickels = .05;
        double dimes = .1;
        double quarters = .25;

        double dollar = 1;
//    Get unknown values
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to 'Change for a Dollar'! "
                + "Your goal is to enter enough change to make exactly $1");

        System.out.println("How many pennies would you like?");
        int numOfPennies = sc.nextInt();

        System.out.println("How many nickels would you like?");
        int numOfNickels = sc.nextInt();

        System.out.println("How many dimes would you like?");
        int numOfDimes = sc.nextInt();

        System.out.println("How many quarters would you like?");
        int numOfQuarters = sc.nextInt();

        sc.close();

        double total = numOfPennies * pennies + numOfNickels * nickels
                + numOfDimes * dimes + numOfQuarters * quarters;

        if (total < dollar){
            double amountShort = dollar - total;
            System.out.println("Sorry you lose! You were short " +
                    String.format("%.2f", amountShort) + " cents.");
        }else if (total > dollar){
            double amountOver = total - dollar;
            System.out.println("Sorry you lose! You were over " +
                    String.format("%.2f", amountOver) + " cents.");
        }else {
            System.out.println("Yay! That's exactly $1.00! You win!");
        }



    }




}

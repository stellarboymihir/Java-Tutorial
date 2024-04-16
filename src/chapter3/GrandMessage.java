package chapter3;

/*
* SWITCH
* Have a user enter their letter grade, and using a switch statement.
* Print out a message letting them know how they did.
* */

import java.util.Scanner;

public class GrandMessage {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade: ");
        Scanner sc = new Scanner(System.in);

        String grade = sc.nextLine();
        sc.close();
        String message;

        switch (grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit harder.";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error. Invalid grade";
                break;

        }
        System.out.println(message);

    }
}


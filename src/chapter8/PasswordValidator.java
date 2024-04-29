package chapter8;

import java.util.Scanner;

/*
* The password must be at least eight characters long,
* contain an uppercase letter, contain a special character,
* not contain the username and not be the same as the old password.
* */

public class PasswordValidator {
    private String username;
    private String currentPassword;

    private boolean valid;
    private String errorMessage;

    private static Scanner sc = new Scanner(System.in);

    public PasswordValidator(String username, String currentPassword){
        this.username = username;
        this.currentPassword = currentPassword;
    }

    public boolean isValid(){
        return valid;
    }

    public String getErrorMessage(){
        return errorMessage;
    }

    public void closeScanner(){
        sc.close();
    }
    public static void main(String[] args) {
        var validator = login();
        validator.printPasswordRules();

        do {
            var proposedPassword = validator.getProposedPassword();
            validator.changePassword(proposedPassword);

            if (!validator.isValid());
            System.out.println(validator.getErrorMessage());
        }while (!validator.isValid());
        System.out.println("The proposed password is valid");

        validator.closeScanner();
    }

    public static PasswordValidator login(){
        System.out.println("Enter your username: ");
        String username = sc.nextLine();

        System.out.println("Enter your password: ");
        String password = sc.nextLine();

        return new PasswordValidator(username, password);
    }

    public void printPasswordRules(){
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* Atleast 8 characters long");
        System.out.println("* Contains an uppercase letter");
        System.out.println("* Contains an special character");
        System.out.println("* Not contain the username");
        System.out.println("* Not the same as the old password");
        System.out.println();
    }

    public String getProposedPassword(){
        System.out.println("Enter new password: ");
        return sc.nextLine();
    }

    public void changePassword(String newPassword){
        valid = true;
        errorMessage = "";

        if (newPassword.length() < 8){
            valid = false;
            errorMessage += "\n Your password must be at least 8 characters.";
        }

        if (newPassword.equals(newPassword.toLowerCase())){
            valid = false;
            errorMessage += "\n Your password must include an uppercase letter.";
        }

        if (newPassword.matches("[a-zA-Z0-9]")){
            valid = false;
            errorMessage += "\n Your password must include a special character (e.g. %,$[:).";

        }

        if (newPassword.toUpperCase().contains(username.toUpperCase())){
            valid = false;
            errorMessage += "\n Your password cannot contain your username.";
        }

        if (newPassword.equals(currentPassword)){
            valid = false;
            errorMessage += "\n Your password must be different from your current password.";
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("The season of the years: ");
        String seasonOfYear = sc.nextLine();

        System.out.println("The whole number is: ");
        int wholeNumber = sc.nextInt();

        sc.nextLine();

        System.out.println("The adjective is: ");
        String adjective = sc.nextLine();

        sc.close();

        System.out.println("On a " + adjective + " " + seasonOfYear + " day I drink" +
                "a minimum of " + wholeNumber + " cups of coffee.");
    }
}
package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);

        System.out.println("The total area is: " + area);

        calculator.sc.close();
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calArea() + rectangle2.calArea();
    }

    private Rectangle getRoom() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of your room: ");
        int length = sc.nextInt();

        System.out.println("Enter the width of your room: ");
        int width = sc.nextInt();

        Rectangle room = new Rectangle(length, width);
        return room;
//        return new Rectangle(length, width);
    }
}

package chapter6;
/*
* Write a class that creates instances of the 'Rectangle'
* class to find the total area of two rooms in a house
* */
public class HomeAreaCalculator
{
    public static void main(String[] args) {

        /************************************
         *   Rectangle 1
         *************************************/


        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);

        double areaofRoom1 = room1.calArea();


        /************************************
         *   Rectangle 2
         *************************************/

        Rectangle room2 = new Rectangle(30, 75);
        double areaofRoom2 = room2.calArea();

        double totalArea = areaofRoom1 + areaofRoom2;


        System.out.println("Area of both rooms: " + totalArea );
    }
}

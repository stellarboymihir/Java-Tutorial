package chapter8;

public class ConvertDecimalToInt {
    public static void main(String[] args) {
        double[] numbers = {1.5, 3.99, 45.7, 222.6};

        for (Double number : numbers){
            System.out.println(number.intValue());
        }
    }
}

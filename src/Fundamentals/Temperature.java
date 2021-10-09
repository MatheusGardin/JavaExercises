package Fundamentals;

public class Temperature {

    public static void main(String[] args) {
        // (ºF - 32) * 5 / 9 = ºC

        double fahrenheit = 86;
        final int THIRTY_TWO = 32;
        final double FIVE_NINE = 5.0 / 9.0;

        double celsius = (fahrenheit - THIRTY_TWO) * FIVE_NINE;

        System.out.println(celsius + " ºC.");
    }
}
package Fundamentals;

public class StringNumberConversion {

    public static void main(String[] args) {

        Integer num1 = 10000;
        System.out.println(num1.toString());

        int num2 = 10000;
        System.out.println(Integer.toString(num2).length());

        System.out.println(("" + num1).length()); // it's not good practice
    }
}
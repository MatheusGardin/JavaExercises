package Challenges;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.print("Type a number: ");
        double num1 = entry.nextDouble();

        System.out.print("Type a number: ");
        double num2 = entry.nextDouble();

        System.out.print("Report the operation: ");
        String op = entry.next();

        double result = "+".equals(op) ? num1 + num2 : 0;
        result = "-".equals(op) ? num1 - num2 : result;
        result = "*".equals(op) ? num1 * num2 : result;
        result = "/".equals(op) ? num1 / num2 : result;
        result = "%".equals(op) ? num1 % num2 : result;

        System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, result);

        entry.close();
    }
}
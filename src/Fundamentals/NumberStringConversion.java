package Fundamentals;

import javax.swing.JOptionPane;

public class NumberStringConversion {

    public static void main(String[] args) {

        String value1 = JOptionPane.showInputDialog(
            "Enter the first number"
        );

        String value2 = JOptionPane.showInputDialog(
            "Enter the second number"
        );

        System.out.println(value1 + value2);

        double number1 = Double.parseDouble(value1);
        double number2 = Double.parseDouble(value2);

        double sum = number1 + number2;
        double avg = sum / 2;

        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + avg);
    }
}
package Fundamentals;

import java.util.Scanner;

public class ConversionChallenge {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.print("Type your first salary.");
        String value1 = entry.next().replace(",", ".");

        System.out.print("\nType your second salary.");
        String value2 = entry.next().replace(",", ".");

        System.out.print("\nType your third salary.");
        String value3 = entry.next().replace(",", ".");

        double salary1 = Double.parseDouble(value1);
        double salary2 = Double.parseDouble(value2);
        double salary3 = Double.parseDouble(value3);

        double sum = salary1 + salary2 + salary3;
        double avg = sum / 3;

        System.out.println("The average salary is " + avg);

        entry.close();
    }
}
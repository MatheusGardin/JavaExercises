package Fundamentals;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        System.out.print("Good");
        System.out.print(" Morning\n");


        System.out.println("\nGood");
        System.out.println("Morning!");


        System.out.printf("\nNumbers: %d %d %d", 1, 2, 3);
        System.out.print("\n"); // You can use this to break line
        System.out.printf("Salary: %f", 1234.5678); // return 1234,567800
        System.out.printf("Salary: %.1f %n", 1234.5678); // return 1234,6
        System.out.printf("Salary: %.2f", 1234.5678); // return 1234,57
        // in this example we use %n to break line


        Scanner scn = new Scanner(System.in);

        System.out.print("\n\ntype your name: ");
        String name = scn.nextLine();

        System.out.print("type your last name: ");
        String lastName = scn.nextLine();

        System.out.print("type your age: ");
        int age = scn.nextInt();

        // System.out.println("\nName: " + name + " " + lastName + " Age: " + age);
        System.out.printf("%s %s is %d years old.", name, lastName, age);

        scn.close();
    }
}
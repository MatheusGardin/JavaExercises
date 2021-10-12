package Fundamentals;

import java.util.Scanner;

public class TypeStringEquals {

    public static void main(String[] args) {

        System.out.println("2" == "2"); // True

        String s = new String("2");
        System.out.println("2" == s); // False
        System.out.println("2".equals(s)); // Trues

        Scanner entry = new Scanner(System.in);
        String s2 = entry.next();
        System.out.println("2".equals(s2));

        entry.close();
    }
}
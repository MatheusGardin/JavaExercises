package Fundamentals;

import java.util.Scanner;

public class Wrappers {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        System.out.print("type a number: ");

        // Byte
        Byte b = 100;
        Short s = 1000;
        Integer i = Integer.parseInt(entry.next());
        Long l = 10000000L;

        entry.close();

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        Float f = 123.10F;
        System.out.println(f);

        Double d = 121233.10123;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);

        Character c = '#';
        System.out.println(c + "...");
    }
}
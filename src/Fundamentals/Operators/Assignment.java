package Fundamentals.Operators;

public class Assignment {

    public static void main(String[] args) {

        int a = 3;
        int b = a;
        int c = a + b;
        System.out.println(c);

        c += b; // c = c + b;
        System.out.println(c);

        c -= a; // c = c - a;
        System.out.println(c);

        c *= b; // c = c * b;
        System.out.println(c);

        c /= a; // c = c / a;
        System.out.println(c);

        c %= 2; // c = c % 2;
        System.out.println(c);
    }
}
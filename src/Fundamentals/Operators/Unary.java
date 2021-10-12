package Fundamentals.Operators;

public class Unary {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        a++; // a = a + 1
        a--; // a = a - 1

        ++b; // b = b + 1
        --b; // b = b - 1

        System.out.println(a);
        System.out.println(b);

        // System.out.println(++a == b--); // True
        // System.out.println(++a == --b); // False
    }
}
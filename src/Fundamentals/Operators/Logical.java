package Fundamentals.Operators;

public class Logical {

    public static void main(String[] args) {

        boolean condition1 = true;
        boolean condition2 = false;

        System.out.println(condition1 && condition2); // False
        System.out.println(condition1 || condition2); // True
        System.out.println(condition1 ^ condition2); // True
        System.out.println(!condition1); // False
        System.out.println(!condition2); // True

        System.out.println("\nTruth Table E");
        System.out.println(true && true); // True
        System.out.println(true && false); // False
        System.out.println(false && true); // False
        System.out.println(false && false); // False

        System.out.println("\nTruth Table OR");
        System.out.println(true || true); // True
        System.out.println(true || false); // True
        System.out.println(false || true); // True
        System.out.println(false || false); // False

        System.out.println("\nTruth Table XOR");
        System.out.println(true ^ true); // False
        System.out.println(true ^ false); // True
        System.out.println(false ^ true); // True
        System.out.println(false ^ false); // False

        System.out.println("\nTruth Table NOT");
        System.out.println(!true); // False
        System.out.println(!false); // True
        System.out.println(!!false); // False
    }
}
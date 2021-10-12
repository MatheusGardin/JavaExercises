package Fundamentals.Conversions;

public class NumericPrimitiveType {

    public static void main(String[] args) {

        double a = 1; // Implied
        System.out.println(a);

        float b = (float) 1.12345; // Explicit (CAST)
        System.out.println(b);

        int c = 4;
        byte d = (byte) c; // Explicit (CAST)
        System.out.println(d);

        double e = 1.99999;
        int f = (int) e; // Explicit (CAST)
        System.out.println(f);
    }
}
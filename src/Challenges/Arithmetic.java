package Challenges;

public class Arithmetic {

    public static void main(String[] args) {

        // (([6 x (3 + 2)]^2 / 3 * 2) - ((1 - 5) * (2 - 7) / 2)^2 )^3 / 10^3
        // (150 - 100)^3 / 10^3
        // 50^3 / 10^3
        // Result: 125;

        double a = 6 * (3 + 2);
        double b = Math.pow(a, 2);
        double c = 3 * 2;
        double d = b / c;

        double e = (1 - 5) * (2 - 7);
        double f = e / 2;
        double g = Math.pow(f, 2);

        double h = d - g;
        double i = Math.pow(h,  3);
        double j = Math.pow(10, 3);
        double k = i / j;

        System.out.println(k);
    }
}
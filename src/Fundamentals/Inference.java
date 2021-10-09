package Fundamentals;

public class Inference {

    public static void main(String[] args) {

        double a = 4.5;
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);

        var c = "Text";
        System.out.println(c);

        c = "Another Text";
        System.out.println(c);

        // c = 4.5;  this is incorrect because 'c' is a string.

        double d; // variable was declared.
        d = 123.65; // variable was started.
        System.out.println(d); //variable was used.

        // var e;
        // e = 123.45;
        // System.out.println(e);
        // this is incorrect because the variable needs a value at the time it is declared.

        var f = 12.01;
        f = 12;
        System.out.println(f);  // return 12.0

        // var g = 12;
        // g = 12.01;
        // System.out.println(g);
        // this is incorrect because the variable was assigned with type int.
    }
}
package Fundamentals;

public class DotNotation {

    public static void main(String[] args) {

        String string = "Good Morning X";

        string = string.replace("X", "Miss");
        string = string.toUpperCase();
        string = string.concat("!!!");

        System.out.println(string);

        System.out.println("Example".toUpperCase());

        String y = "Hello X"
            .replace("X", "Sir")
            .toUpperCase()
            .concat("!!!");

        System.out.println(y);

        // Primitive types have no dot operator
    }
}
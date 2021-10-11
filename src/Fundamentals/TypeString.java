package Fundamentals;

public class TypeString {

    public static void main(String[] args) {
        var name = "Peter";
        var lastName = "John";
        var age = 33;
        var salary = 12345.99;

        // CharAt
        System.out.println("Good Morning".charAt(0));

        // new String
        String s = "Good Morning";

        // Concat
        System.out.println(s.concat("!!!"));

        // Concat
        System.out.println(s + "!!!");

        // startsWith
        System.out.println(s.startsWith("Good")); // Boolean
        System.out.println(s.toLowerCase().startsWith("good"));

        // endWith
        System.out.println(s.endsWith("Morning")); // Boolean

        // Length
        System.out.println(s.length());

        // Equals
        System.out.println(s.equals("good morning"));
        System.out.println(s.equalsIgnoreCase("good morning"));

        // Phrases in system out
        System.out.println(
            "Name: " + name + "\nLast Name: " + lastName +
            "\nAge: " + age + "\nSalary: " + salary
        );

        System.out.printf(
            "Mr. %s %s is %d years old and earns %.2f.",
            name, lastName, age, salary
        );

        String phrase = String.format(
            "\nMr. %s %s is %d years old and earns %.2f per year.",
            name, lastName, age, salary
        );

        System.out.println(phrase);

        // Hash code
        System.out.println("String".hashCode());

        // Split
        String splitExample = "teste0 teste1 teste2";

        String[] splitExamples = splitExample.split(" ", 2);

        System.out.println(splitExamples[0]);
        System.out.println(splitExamples[1]);
    }
}
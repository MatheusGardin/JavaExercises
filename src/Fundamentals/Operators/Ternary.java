package Fundamentals.Operators;

public class Ternary {

    public static void main(String[] args) {

        double avg = 4.0;

        String parcialResult = (avg >= 5.0) ? "was in recovery" : "failed";
        String finalResult = (avg >= 7.0) ? "passed " : parcialResult;

        System.out.println("The student " + finalResult);
    }
}
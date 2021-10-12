package Challenges;

public class LogicalOperators {

    public static void main(String[] args) {

        boolean job1 = false;
        boolean job2 = false;

        boolean boughtTV50 = job1 && job2;
        boolean boughtTV32 = job1 ^ job2;
        boolean boughtIceCream = job1 || job2;

        System.out.println("Bought a TV 50\"? " + boughtTV50);
        System.out.println("Bought a TV 32\"? " + boughtTV32);
        System.out.println("Bought Ice Cream? " + boughtIceCream);
    }
}
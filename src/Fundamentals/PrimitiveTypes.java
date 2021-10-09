package Fundamentals;

/**
 * Java has 8 primitive types
 *
 * @Byte (1 byte)
 * @Short (2 bytes)
 * @Int (4 bytes)
 * @Long (8 bytes)
 *
 * @Float (4 bytes)
 * @Double (8 bytes)
 *
 * @Char (Character)
 * @Boolean (True or False)
 */

public class PrimitiveTypes {

    public static void main(String[] args) {
        byte yearsInTheCompany = 15;
        short numberOfFlights = 521;
        int id = 56789;
        long accumulatedPoints = 3_234_856_234L; // use L to set a 'Long' number

        float salary = 35_445.44F; // use F to set a 'Float' number
        double accumulatedSales = 2_991_797_103.01;

        boolean isOnVacation = false;
        char status = 'A';

        // Company days
        System.out.println(yearsInTheCompany * 365);

        // Travel Number
        System.out.println(numberOfFlights / 2);

        // Real Points
        System.out.println(accumulatedPoints / accumulatedSales);

        // User salary
        System.out.println(id + " Earn per year: " + salary);

        // Is the employee on vacation?
        System.out.println(id + " Is on vaction? " + isOnVacation);

        // Status
        System.out.println("Status: " + status);
    }
}
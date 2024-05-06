
package operator;

import java.util.Scanner;

public class MinYearDay {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the minutes: ");

        while (true) {
            if (s.hasNextLong()) {
                long min = s.nextLong();
                if (min > 0) {
                    convertMin(min);
                    break;
                } else {
                    System.out.println("Invalid minutes entered. Please enter a non-negative integer.");
                    System.out.print("Enter minutes: ");
                }
            } else {
                System.out.println("Invalid input. Please enter minutes in integer format.");
                s.next(); // consume the invalid input
                System.out.print("Enter minutes: ");
            }
        }
        s.close();
    }


    public static void convertMin(long min) {

        long year = min / (60 * 24 * 365);
        long remaining_mins = min % (60 * 24 * 365);
        long days = remaining_mins / (60 * 24);

        System.out.println(min + " minutes is approximately " + year + " year/'s and " + days + " day/'s. ");
    }
}

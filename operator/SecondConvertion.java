package operator;

import java.util.Scanner;

public class SecondConvertion
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the seconds to be converted: ");
        //int totalSecs = s.nextInt();
        if (s.hasNextInt()) {
            int totalSecs = s.nextInt();
            if (totalSecs >= 0) {
                int hours = totalSecs / 3600;
                int rem_second = totalSecs % 3600;
                int minutes = rem_second / 60;
                int result_second = rem_second % 60;

                System.out.println(hours + " HOURS");
                System.out.println(minutes + " MINUTES");
                System.out.println(result_second + " SECONDS");
            } else {
                System.out.println("Invalid Entry!. Enter non-negative entry for Seconds");

            }
            }else
            {
                System.out.println("Invalid input please enter valid");
                s.next();
            }

        }
}



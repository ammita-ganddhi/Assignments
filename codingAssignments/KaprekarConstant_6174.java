package codingAssignments;

import java.util.Arrays;
import java.util.Scanner;


public class KaprekarConstant_6174 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a four-digit number (with at least two different digits): ");
        int number = scanner.nextInt();

        // Validate the input
        while (number < 1000 || number > 9999 || hasAllSameDigits(number)) {
            System.out.print("Invalid input. Please enter a valid four-digit number: ");
            number = scanner.nextInt();
        }

        int count = 0;

        while (number != 6174) {
            count++;

            // Convert number to array of digits
            int[] digits = getDigits(number);

            // Sort digits in ascending and descending order
            Arrays.sort(digits);
            int ascending = toNumber(digits);   // Ascending number
            int descending = toNumber(reverse(digits));  // Descending number

            // Calculate new number
            number = descending - ascending;

            // Display calculation
            System.out.printf("Step %d: %04d - %04d = %04d\n", count, descending, ascending, number);

            // Stop if we reach 6174
            if (number == 6174) {
                break;
            }
        }

        System.out.println("Kaprekar's constant (6174) reached in " + count + " steps.");
        scanner.close();
    }

    // Function to convert a number into an array of digits
    public static int[] getDigits(int number) {
        int[] digits = new int[4];
        for (int i = 3; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Function to convert an array of digits into a number
    public static int toNumber(int[] digits) {
        int number = 0;
        for (int digit : digits) {
            number = number * 10 + digit;
        }
        return number;
    }

    // Function to reverse an array of digits
    public static int[] reverse(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - i - 1];
        }
        return reversed;
    }

    // Function to check if all digits in the number are the same
    public static boolean hasAllSameDigits(int number) {
        int[] digits = getDigits(number);
        return digits[0] == digits[1] && digits[1] == digits[2] && digits[2] == digits[3];
    }
}

/*
============================================================================================
"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=65321:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.KaprekarConstant_6174
Enter a four-digit number (with at least two different digits): 0068
Invalid input. Please enter a valid four-digit number: -4
Invalid input. Please enter a valid four-digit number: 6534
Step 1: 6543 - 3456 = 3087
Step 2: 8730 - 0378 = 8352
Step 3: 8532 - 2358 = 6174
Kaprekar's constant (6174) reached in 3 steps.

Process finished with exit code 0

============================================================================================

"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=65148:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.KaprekarConstant_6174
Enter a four-digit number (with at least two different digits): 9020
Step 1: 9200 - 0029 = 9171
Step 2: 9711 - 1179 = 8532
Step 3: 8532 - 2358 = 6174
Kaprekar's constant (6174) reached in 3 steps.

Process finished with exit code 0

*/
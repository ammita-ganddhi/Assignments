package codingAssignments;

import java.util.Scanner;

public class TickTacToeWith7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Rahul starts with a number
        System.out.print("Rahul starts with: ");
        int startNumber = scanner.nextInt();

        int nextNumber = startNumber + 1;

        // Step 2: Rohit needs to speak the next number following the rules
        while (true) {
            if (!containsDigit7(nextNumber) && !divisorContainsDigit7(nextNumber)) {
                System.out.println("Rohit needs to speak: " + nextNumber);
                break;
            }
            nextNumber++;
        }

        scanner.close();
    }

    // Method to check if a number contains the digit 7
    private static boolean containsDigit7(int number) {
        String numStr = String.valueOf(number);
        return numStr.contains("7");
    }

    // Method to check if any divisor of the number contains the digit 7
    private static boolean divisorContainsDigit7(int number) {
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                int divisor1 = i;
                int divisor2 = number / i;

                if (containsDigit7(divisor1) || containsDigit7(divisor2)) {
                    return true;
                }
            }
        }
        return false;
    }
}

/*
* "C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=62142:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.TickTacToeWith7
Rahul starts with: 70
Rohit needs to speak: 80

Process finished with exit code 0
* --------------------------------------------
*"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=62203:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.TickTacToeWith7
Rahul starts with: 33
Rohit needs to speak: 36

Process finished with exit code 0
*
* */
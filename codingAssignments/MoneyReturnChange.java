package codingAssignments;

import java.util.Scanner;

public class MoneyReturnChange {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the amount spent (bought amount)
        System.out.print("Enter the amount spent: ");
        int boughtAmount = scanner.nextInt();

        // Prompt the user to enter the money given
        System.out.print("Enter the money given: ");
        int moneyGiven = scanner.nextInt();

        // Calculate the change to return
        int change = moneyGiven - boughtAmount;

        // Array representing the denominations available in rupees
        int[] denominations = {100, 50, 20, 10, 5, 2, 1};
        int[] count = new int[denominations.length];

        // Loop through each denomination and calculate how many of each denomination are needed
        for (int i = 0; i < denominations.length; i++) {
            if (change >= denominations[i]) { //The loop checks if the remaining change is greater than or equal to the current denomination (denominations[i]).
                count[i] = change / denominations[i];   //For example, if the remaining change is 44 and the current denomination is 10, 44 / 10 equals 4. So, 4 coins of 10 rupees each will be used.
                change = change % denominations[i]; //This operation gives the remainder after dividing the change by the current denomination.
            }                                           // e.g: 44 % 10 = 4 rupees.
        }

        // Display the change to return in terms of the number of coins/notes for each denomination
        System.out.println("Change to be returned:");

        for (int i = 0; i < denominations.length; i++) {
            if (count[i] != 0) {
                System.out.println(count[i] + " * " + denominations[i] + " rupee coin/note");
            }
        }

        scanner.close();
    }
}

/*
"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=56523:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.MoneyReturnChange
Enter the amount spent: 273
Enter the money given: 500
Change to be returned:
2 * 100 rupee coin/note
1 * 20 rupee coin/note
1 * 5 rupee coin/note
1 * 2 rupee coin/note

Process finished with exit code 0
 */
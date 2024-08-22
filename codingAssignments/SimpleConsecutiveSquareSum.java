package codingAssignments;

import java.util.Scanner;

public class SimpleConsecutiveSquareSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the target number
        System.out.print("Enter the target number: ");
        int target = scanner.nextInt();

        // Find and print the sequence
        for (int start = 1; start * start < target; start++) {
            int sum = 0;
            for (int i = start; sum < target; i++) {
                sum += i * i;
                if (sum == target) {
                    System.out.print("Output = ");
                    for (int j = start; j <= i; j++) {
                        System.out.print(j + (j < i ? "," : ""));
                    }
                    System.out.println();
                    return;
                }
            }
        }

        System.out.println("No consecutive sequence found.");
        scanner.close();
    }
}

/*
* "C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=62688:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.SimpleConsecutiveSquareSum
Enter the target number: 2030
Output = 21,22,23,24

Process finished with exit code 0
* --------------------------------------------------
*"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=62700:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.SimpleConsecutiveSquareSum
Enter the target number: 5000
No consecutive sequence found.

Process finished with exit code 0
* */
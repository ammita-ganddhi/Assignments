import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Edge cases: numbers less than 2 are not prime
        if (number < 2) {
            System.out.println(number + " is not Prime.");
        } else {
            // Check if the number is prime
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Output whether the number is prime or not
            if (isPrime) {
                System.out.println(number + " is Prime.");
            } else {
                System.out.println(number + " is not Prime.");
            }
        }
    }
}

/*
"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=54511:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments Prime
Enter an integer: 10
10 is not Prime.

Process finished with exit code 0

"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=54520:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments Prime
Enter an integer: 17
17 is Prime.

Process finished with exit code 0

*/
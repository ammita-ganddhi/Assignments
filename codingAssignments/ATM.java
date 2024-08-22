package codingAssignments;
import java.util.Scanner;
import java.util.Random;

public class ATM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Step 1: Input Debit Card (Assume the card is inputted)
        System.out.println("Welcome to the ATM Machine!");

        while (true) {
            // Step 2: Select Service
            System.out.println("Select Service: ");
            System.out.println("1. Withdrawal");
            System.out.println("2. Account Balance");
            System.out.println("3. Cancel");
            int service = scanner.nextInt();

            if (service == 3) {
                System.out.println("Transaction Cancelled.");
                break;
            }

            // Step 3: Enter PIN
            System.out.print("Enter your 4-digit PIN: ");
            int pin = scanner.nextInt();
            if (String.valueOf(pin).length() != 4) {
                System.out.println("Invalid PIN. Please try again.");
                continue;
            }

            if (service == 1) {
                // Withdrawal Process
                System.out.print("Enter the amount to withdraw (less than 10000 and multiple of 1000): ");
                int amount = scanner.nextInt();
                if (amount >= 10000 || amount % 1000 != 0) {
                    System.out.println("Invalid amount. Amount should be less than 10000 and multiple of 1000.");
                    continue;
                }
                System.out.println("Transaction Successful! You have withdrawn: " + amount + " /-");
                break;

            } else if (service == 2) {
                // Account Balance Process
                double balance = random.nextDouble() * 90000 + 10000; // Random balance between 10000 and 100000
                System.out.printf("Your Account Balance is: %.2f /-\n", balance);
                break;
            } else {
                System.out.println("Invalid Service Selection.");
            }
        }

        System.out.println("Thank you for using the ATM Machine!");
        scanner.close();
    }
}

/*
"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=61630:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.ATM
Welcome to the ATM Machine!
Select Service:
1. Withdrawal
2. Account Balance
3. Cancel
3
Transaction Cancelled.
Thank you for using the ATM Machine!

Process finished with exit code 0

----------------------------------------------------

"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=61650:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.ATM
Welcome to the ATM Machine!
Select Service:
1. Withdrawal
2. Account Balance
3. Cancel
2
Enter your 4-digit PIN: 65465465
Invalid PIN. Please try again.
Select Service:
1. Withdrawal
2. Account Balance
3. Cancel
2
Enter your 4-digit PIN: 4433
Your Account Balance is: 26305.30 /-
Thank you for using the ATM Machine!

Process finished with exit code 0
-------------------------------------------------------------------
"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=61699:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.ATM
Welcome to the ATM Machine!
Select Service:
1. Withdrawal
2. Account Balance
3. Cancel
1
Enter your 4-digit PIN: 343242342
Invalid PIN. Please try again.
Select Service:
1. Withdrawal
2. Account Balance
3. Cancel
1
Enter your 4-digit PIN: 5544
Enter the amount to withdraw (less than 10000 and multiple of 1000): 2000
Transaction Successful! You have withdrawn: 2000 /-
Thank you for using the ATM Machine!

Process finished with exit code 0

* */
package codingAssignments;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");

        int num = s.nextInt();

        int sum = sumOfDigits(num);

        System.out.println("Sum Of All The Digits Of The Number Is : " + sum);


    }

    public static int sumOfDigits(int num){
        int sum = 0;

       // num = Math.abs(num); // Convert the number to positive in-case user enters a negative entry

        while (num !=0){
            sum = sum + num % 10;     // last digit derived
            num = num / 10;             // last digit removed
        }
        return sum;

    }
}

/*
* "C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=60093:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.SumOfDigit
Enter a number
8888
Sum Of All The Digits Of The Number Is : 32

Process finished with exit code 0
* */
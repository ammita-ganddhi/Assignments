package codingAssignments;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = s.nextInt();

        int rev = 0;
        while (num != 0)
        {
            rev = rev * 10 + num % 10;
            num = num/10;
        }
        System.out.println("Reverse of the given number is: " + rev);
       }

}

/*
* "C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=57553:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.ReverseNumber
Enter a number :
102
Reverse of the given number is: 201

Process finished with exit code 0*/
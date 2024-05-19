package codingAssignments;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the temperature: ");

            if (s.hasNextInt())
            {
                int temp = s.nextInt();
                if (temp >= 0)
                {
                    System.out.println("Number is Positive ");
                } else
                {
                    System.out.println("Number is Negative");
                }

            }
        }
    }

    /*
    "C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=55650:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.PositiveNegative
Enter the temperature:
50
Positive Number

Process finished with exit code 0


"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=55679:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.PositiveNegative
Enter the temperature:
0
Number is Positive

Process finished with exit code 0

"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=55685:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.PositiveNegative
Enter the temperature:
-1
Number is Negative

Process finished with exit code 0

 */
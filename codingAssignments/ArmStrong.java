package codingAssignments;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = s.nextInt();
       int c=number;

        int rem, arm = 0;
        while (number > 0){
            rem = number % 10;
            arm = (rem*rem*rem)+arm;
            number = number / 10;
        }

        if (c == arm){
            System.out.println("Armstrong Number");
        }else {
            System.out.println("Not an Armstrong Number");
        }
    }
}

/*
"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=55199:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.ArmStrong
Enter the number :
153
Armstrong Number

Process finished with exit code 0

"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=55216:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.ArmStrong
Enter the number :
999
Not an Armstrong Number

Process finished with exit code 0
*/
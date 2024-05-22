package codingAssignments;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1'st Number : ");
        int num1 = s.nextInt();
        System.out.print("Enter 2'nd Number : ");
        int num2 = s.nextInt();
        System.out.print("Enter 3'rd Number : ");
        int num3 = s.nextInt();

     int max= (num1 > num2 && num1 > num3) ? num1 : ( (num2 > num1 && num2 > num3) ? num2 : num3);
        System.out.println("Greatest Number is : " + max);
    }
}

/*OUTPUT 1:
* "C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=50730:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.GreatestNumber
Enter 1'st Number : 100
Enter 2'nd Number : 222
Enter 3'rd Number : 333
Greatest Number is : 333

Process finished with exit code 0
* OUTPUT 2:
*"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=50758:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.GreatestNumber
Enter 1'st Number : -10
Enter 2'nd Number : -1
Enter 3'rd Number : -5
Greatest Number is : -1

Process finished with exit code 0
* */

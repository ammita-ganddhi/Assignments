package codingAssignments;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
       int  num = s.nextInt();
        System.out.print("Factors :");
       for (int i = 1; i <= num; i++)
       {
           if(num % i == 0)
           {
               System.out.print(i + " ");
           }
       }
    }
}

/* OUTPUT:

"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=59858:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.Factors
Enter the number: 24
Factors :1 2 3 4 6 8 12 24
Process finished with exit code 0
*/
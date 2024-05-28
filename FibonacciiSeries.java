/*
 * Fibonacci Series in Java using For Loop
 */

import java.util.Scanner;
public class FibonacciiSeries
{
    public static void main(String[] args)
    {
        int number, n1 = 0, n2 = 0, n3 = 1;
        Scanner s = new Scanner(System.in);         // command line input
        System.out.print("Enter value of Fibonaccii number:"); //example: user enters 10
        number = s.nextInt();                       // system scans or parse value as 10
        System.out.print("Fibonacci Series is as follows:");
        for(int i = 1; i <= number; i++)        // program generates the fibonaccii series till 10
        {
            n1 = n2;    // n1 becomes 0     //1          //1
            n2 = n3;    // n2 becomes 1     //1          //2
            n3 = n1 + n2;   // n3 becomes 0+1 =1//2     //3
            System.out.print(n1+" ");
        }
    }
}

/*"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=63327:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments FibonacciiSeries
Enter value of Fibonaccii number:18
Fibonacci Series is as follows:0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597
Process finished with exit code 0
*/
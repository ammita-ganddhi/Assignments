package codingAssignments;

import java.util.Scanner;

public class NegativeNumberToBreakLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //infinite loop starts here..

        while (true){
            System.out.print("Enter -ve number: ");
            int num = sc.nextInt();

            //Check condition if num < 0
            if (num < 0){
                System.out.println("-ve number entered. Loop breaks here.");
                break;
            }
            System.out.println("You have entered: "+ num);
        }
    }
}

/*

"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=62957:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.NegativeNumberToBreakLoop
Enter -ve number: 9
You have entered: 9
Enter -ve number: 2
You have entered: 2
Enter -ve number: -1
-ve number entered. Loop breaks here.

Process finished with exit code 0
*/
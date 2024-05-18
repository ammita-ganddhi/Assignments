package operator;
import java.util.Scanner;

public class SecondConv {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the seconds to be converted: ");

        while(true){

            if (s.hasNextInt()) {
                int totalSecs = s.nextInt();
                if (totalSecs >= 0) {
                    int hours = totalSecs / 3600;
                    int rem_second = totalSecs % 3600;
                    int minutes = rem_second / 60;
                    int result_second = rem_second % 60;

                    System.out.println(hours + " HOURS");
                    System.out.println(minutes + " MINUTES");
                    System.out.println(result_second + " SECONDS");
                    break;
                } else {
                    System.out.println("Invalid Entry!. Enter non-negative entry for Seconds");
                    //s.next();
                }
            } else {
                System.out.println("Invalid input please enter valid");
               s.next();
            }

        }
    }

    }


    /*
    "C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=55415:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments operator.SecondConv
Enter the seconds to be converted:
lmn
Invalid input please enter valid
-99
Invalid Entry!. Enter non-negative entry for Seconds
82399
22 HOURS
53 MINUTES
19 SECONDS

Process finished with exit code 0
     */
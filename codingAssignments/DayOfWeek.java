package codingAssignments;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number ranging from 1 to 7 : ");
        int num = s.nextInt();

        System.out.println(DayOfTheWeek(num));
    }
    public static String DayOfTheWeek(int num)
    {
        String name = "";
        switch (num)
        {
            case 1: name = "SUNDAY"; break;
            case 2: name = "MONDAY"; break;
            case 3: name = "TUESDAY"; break;
            case 4: name = "WEDNESDAY"; break;
            case 5: name =  "THURSDAY"; break;
            case 6: name = "FRIDAY"; break;
            case 7: name =  "SATURDAY"; break;
            default: name = "Invalid Entry.";

        }
        return name;

    }

  }

/* OUTPUT:
"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=61359:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.DayOfWeek
Enter the number ranging from 1 to 7 :
0
Invalid Entry.

Process finished with exit code 0

Enter the number ranging from 1 to 7 :
8
Invalid Entry.

Process finished with exit code 0

Enter the number ranging from 1 to 7 :
1
SUNDAY

Process finished with exit code 0

Enter the number ranging from 1 to 7 :
7
SATURDAY

Process finished with exit code 0


* */
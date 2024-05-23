package codingAssignments;

import java.util.Scanner;

public class DaysInAMonth {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the month ranging from 1 to 12: ");
        int month = s.nextInt();

        int days;

        switch(month)
        {
            case 1: //Jan
            case 3: //Mar
            case 5: //May
            case 7: //Jul
            case 8: // Aug
            case 10: //Oct
            case 12: // Dec
                days = 31; break;
            case 4: // Apr
            case 6: // Jun
            case 9: //Sep
            case 11: //Nov
                days = 30; break;
            case 2: //Feb
                days = 28; break;
            default:
                days = 0; //Invalid Month
                System.out.println("Invalid month");
                break;
        }
        if (days != 0 )
        {
            System.out.println("The Month " + month + " Has " + days + " Days");
        }
    }
}

/* OUTPUT1:
"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=53163:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.DaysInAMonth
Enter the month ranging from 1 to 12:
0
Invalid month
Process finished with exit code 0

"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=53175:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.DaysInAMonth
Enter the month ranging from 1 to 12:
13
Invalid month

Process finished with exit code 0

"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=53182:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.DaysInAMonth
Enter the month ranging from 1 to 12:
1
The Month 1 Has 31 Days

Process finished with exit code 0
"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=53189:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.DaysInAMonth
Enter the month ranging from 1 to 12:
12
The Month 12 Has 31 Days

Process finished with exit code 0
"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=53203:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.DaysInAMonth
Enter the month ranging from 1 to 12:
6
The Month 6 Has 30 Days

Process finished with exit code 0

"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=53195:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.DaysInAMonth
Enter the month ranging from 1 to 12:
2
The Month 2 Has 28 Days

Process finished with exit code 0



*
* */
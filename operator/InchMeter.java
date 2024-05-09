package operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class InchMeter {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the inches: ");

      while(true)
        {
            if(s.hasNextDouble()) {
                double inches = s.nextDouble();
                DecimalFormat df = new DecimalFormat("0.00");
                double meters = inches * 0.0254;
                System.out.println("Inches to meter conversion is: " + df.format(meters));
                break;
            }else{
                System.out.print("Invalid input. Re-enter the correct input for inch: ");
                s.next();
            }
        }
    }
}

/*
"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=59833:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments operator.InchMeter
Enter the inches: weqwe
Invalid input. Re-enter the correct input for inch: 1wq
Invalid input. Re-enter the correct input for inch: qww.3
Invalid input. Re-enter the correct input for inch: 333.55%
Invalid input. Re-enter the correct input for inch: #$%
Invalid input. Re-enter the correct input for inch: -1000.467
Inches to meter conversion is: -25.41

Process finished with exit code 0
* */
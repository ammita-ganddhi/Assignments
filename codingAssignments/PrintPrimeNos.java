package codingAssignments;

public class PrintPrimeNos {
    public static void main(String[] args) {
        int num = 20;
        for (int i = 2; i < num; i++)
        {
            //System.out.println("i: "  +i);
            boolean isPrime = true;
            for(int j = 2; j <= i/2; j++)
            {
                //System.out.println("j: "  +j);
                if (i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
            {
                System.out.print(i + " ");
            }

        }
    }
}


/*"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=55536:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.PrintPrimeNos
2 3 5 7 11 13 17 19
Process finished with exit code 0
*/
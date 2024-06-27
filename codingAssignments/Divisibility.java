/* Program to print numbers between 1 to 100 which are divisible by 3, 5 and by both */

package codingAssignments;

public class Divisibility {
    public static void main(String[] args) {
        System.out.println("Numbers between 1 to 100 that are divisible by 3: ");

        for(int i = 1; i<=100; i++){
            if(i % 3 == 0){
                System.out.print(i + ",");
            }

        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Numbers between 1 to 100 that are divisible by 5: ");

        for (int i=1; i<=100; i++){
            if(i%5 == 0){
                System.out.print(i + ",");
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Numbers between 1 to 100 that are divisible by both 3 & 5: ");
        for(int i=1; i<=100; i++){
            if(i%3 ==0 && i%5==0){
                System.out.print(i+",");
            }
        }
    }
}

/*  OUTPUT:

"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=51376:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.Divisibility
Numbers between 1 to 100 that are divisible by 3:
3,6,9,12,15,18,21,24,27,30,33,36,39,42,45,48,51,54,57,60,63,66,69,72,75,78,81,84,87,90,93,96,99,

Numbers between 1 to 100 that are divisible by 5:
5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,100,

Numbers between 1 to 100 that are divisible by both 3 & 5:
15,30,45,60,75,90,
Process finished with exit code 0
 */
/*
Write a Java code to create a number 17 with below available numbers and operators only.
input given:
Numbers are 1,2,6,7
Operators are +,- and *
Note:
1. Donot repeat any number or operator
2. Donot skip any number or operator
3. Create a number 17 using above rule
*/


package codingAssignments;

public class CreateNo17 {
    public static void main(String[] args) {
        int result;
        result = ((6-1)*2)+7;
        System.out.println("Number created is: " + result);
    }
}

/*

 "C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=63242:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.CreateNo17
Number created is: 17

Process finished with exit code 0

*/
package codingAssignments;

public class ParameterizedMethod {
    // Static method with parameters
    public static int square(int number) {
        return number * number;
    }

    // Non-static (instance) method with parameters
    public int cube(int number) {
        return number * number * number;
    }

    public static void main(String[] args) {
        // Calling the static method
        int squared = ParameterizedMethod.square(5);
        System.out.println("Square of 5: " + squared); // Output: Square of 5: 25

        // Creating an object to call the non-static method
        ParameterizedMethod mathOps = new ParameterizedMethod();
        int cubed = mathOps.cube(3);
        System.out.println("Cube of 3: " + cubed); // Output: Cube of 3: 27
    }
}

/*
"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=59266:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.ParameterizedMethod
Square of 5: 25
Cube of 3: 27

Process finished with exit code 0
 */
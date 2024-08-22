package codingAssignments;


class NonParamMethodEg {

    // Static method without parameters
    public static void sayHello() {
        System.out.println("Hello, World!");
    }

    // Non-static (instance) method without parameters
    public void sayGoodbye() {
        System.out.println("Goodbye, World!");
    }

    public static void main(String[] args) {
        // Calling the static method
        NonParamMethodEg.sayHello(); // Output: Hello, World!

        // Creating an object to call the non-static method
        NonParamMethodEg greeting = new NonParamMethodEg();
        greeting.sayGoodbye(); // Output: Goodbye, World!
    }
}

/*
"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=59963:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.NonParamMethodEg
Hello, World!
Goodbye, World!

Process finished with exit code 0

 */
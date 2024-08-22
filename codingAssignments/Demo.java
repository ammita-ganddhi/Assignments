package codingAssignments;

class A {
    A method1() {
        System.out.println("In method1");
        return this;  // Returns the current object, allowing method chaining
    }

    A method2() {
        System.out.println("In method2");
        return this;  // Returns the current object, allowing method chaining
    }
}

class Demo {
    public static void main(String[] args) {
        A a1 = new A();
        a1.method1().method2();  // Method chaining: calling method2 after method1 on the same object
    }
}

/*
"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=60580:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.Demo
In method1
In method2

Process finished with exit code 0
 */
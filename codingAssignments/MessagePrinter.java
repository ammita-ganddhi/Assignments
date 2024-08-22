package codingAssignments;

class MessagePrinter {

    // Static void method
    public static void printWelcomeMessage() {
        System.out.println("Welcome to the program!");
    }

    // Non-static (instance) void method
    public void printExitMessage() {
        System.out.println("Exiting the program. Goodbye!");
    }

    public static void main(String[] args) {
        // Calling the static void method
        MessagePrinter.printWelcomeMessage(); // Output: Welcome to the program!

        // Creating an object to call the non-static void method
        MessagePrinter printer = new MessagePrinter();
        printer.printExitMessage(); // Output: Exiting the program. Goodbye!
    }
}

/*
"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=60137:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.MessagePrinter
Welcome to the program!
Exiting the program. Goodbye!

Process finished with exit code 0
 */
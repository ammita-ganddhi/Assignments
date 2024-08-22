package codingAssignments;

// Define the Human class
class Human {
    String name;
    int age;

    // Method to make the Human speak
    public void speak(String content) {
        System.out.println(name + " - " + content);
    }

    // Method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Method to set the age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to get the name
    public String getName() {
        return name;
    }

    // Method to get the age
    public int getAge() {
        return age;
    }
}

// Main class to interact with the Human class
class HumanSession {
    public static void main(String[] args) {
        // Create an object of the Human class
        Human h1 = new Human();

        // Set the name and age of the human
        h1.setName("John");
        h1.setAge(30);

        // Make the human speak
        h1.speak("Hello");

        // Retrieve and print the name and age of the human
        System.out.println("Name: " + h1.getName());
        System.out.println("Age: " + h1.getAge());
    }
}

/*
"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=57253:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.HumanSession
John - Hello
Name: John
Age: 30

Process finished with exit code 0

 */
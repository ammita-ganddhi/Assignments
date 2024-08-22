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

/*-- Assignment for creating Additional Classes --*/
/*
// Class for Human
class Human {
    String name;
    int age;
    String gender;

    // Constructor
    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Method to display human information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

// Class for MobilePhone
class MobilePhone {
    String brand;
    String model;
    double price;

    // Constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display mobile phone information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}

// Class for Desktop
class Desktop {
    String cpu;
    int ram;
    int storage;

    // Constructor
    public Desktop(String cpu, int ram, int storage) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    // Method to display desktop information
    public void displayInfo() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Storage: " + storage + "GB");
    }
}

// Class for College
class College {
    String name;
    String location;
    int numberOfStudents;

    // Constructor
    public College(String name, String location, int numberOfStudents) {
        this.name = name;
        this.location = location;
        this.numberOfStudents = numberOfStudents;
    }

    // Method to display college information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Number of Students: " + numberOfStudents);
    }
}

// Class for TestSuite
class TestSuite {
    String suiteName;
    String description;

    // Constructor
    public TestSuite(String suiteName, String description) {
        this.suiteName = suiteName;
        this.description = description;
    }

    // Method to display test suite information
    public void displayInfo() {
        System.out.println("Test Suite Name: " + suiteName);
        System.out.println("Description: " + description);
    }
}

// Class for TestCase
class TestCase {
    String caseName;
    String expectedResult;

    // Constructor
    public TestCase(String caseName, String expectedResult) {
        this.caseName = caseName;
        this.expectedResult = expectedResult;
    }

    // Method to display test case information
    public void displayInfo() {
        System.out.println("Test Case Name: " + caseName);
        System.out.println("Expected Result: " + expectedResult);
    }
}

// Class for TestStep
class TestStep {
    String stepName;
    String action;
    String expectedOutcome;

    // Constructor
    public TestStep(String stepName, String action, String expectedOutcome) {
        this.stepName = stepName;
        this.action = action;
        this.expectedOutcome = expectedOutcome;
    }

    // Method to display test step information
    public void displayInfo() {
        System.out.println("Test Step Name: " + stepName);
        System.out.println("Action: " + action);
        System.out.println("Expected Outcome: " + expectedOutcome);
    }
}

// Additional 5 Classes of your choice

// Class for Book
class Book {
    String title;
    String author;
    int pages;

    // Constructor
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Method to display book information
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}

// Class for Car
class Car {
    String brand;
    String model;
    double price;

    // Constructor
    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}

// Class for Library
class Library {
    String name;
    String location;
    int numberOfBooks;

    // Constructor
    public Library(String name, String location, int numberOfBooks) {
        this.name = name;
        this.location = location;
        this.numberOfBooks = numberOfBooks;
    }

    // Method to display library information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Number of Books: " + numberOfBooks);
    }
}

// Class for Course
class Course {
    String courseName;
    String instructor;
    int duration; // in weeks

    // Constructor
    public Course(String courseName, String instructor, int duration) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.duration = duration;
    }

    // Method to display course information
    public void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Duration: " + duration + " weeks");
    }
}

// Class for Employee
class Employee {
    String name;
    String designation;
    double salary;

    // Constructor
    public Employee(String name, String designation, double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: $" + salary);
    }
}

 */
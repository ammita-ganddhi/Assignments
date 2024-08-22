package codingAssignments;


// Class for Animal
class Animal {
    String name;
    String species;
    int age;

    // Constructor
    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    // Method to display animal information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age + " years old");
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        // Creating objects for the Animal class
        Animal animal1 = new Animal("Leo", "Lion", 5);
        Animal animal2 = new Animal("Naila", "Cat", 2);
        Animal animal3 = new Animal("Bingo", "Dog", 3);

        // Displaying the information of each animal
        animal1.displayInfo();
        System.out.println();
        animal2.displayInfo();
        System.out.println();
        animal3.displayInfo();
    }
}

/*
"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=58760:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.ClassesAndObjects
Name: Leo
Species: Lion
Age: 5 years old

Name: Naila
Species: Cat
Age: 2 years old

Name: Bingo
Species: Dog
Age: 3 years old

Process finished with exit code 0
 */
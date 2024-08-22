package codingAssignments;

public class ReassignInstanceVar {


    // Instance variable declaration and initialization
    int i = 10;

    // Constructor (if you want to reassign in the constructor)
    ReassignInstanceVar() {
        i = 20;  // Reassigning the instance variable
    }

    public static void main(String[] args) {
        // Create an object of the Tech class
        ReassignInstanceVar obj = new ReassignInstanceVar();

        // Access the instance variable through the object
        System.out.println(obj.i);  // This will print 20
    }
}

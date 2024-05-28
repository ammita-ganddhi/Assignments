/* Example of multi level inheritance using default constructor and parameterized constructor*/
// Intermediate Class D that inherits class C

package InheritExamples;

public class D extends C {

    public D(){     //Default Constructor D

        super();    // Calling Base-Parent Default Constructor
        System.out.println("Intermediate Default Constructor D");
    }

    public D(double num1, double num2){     //Parameterized Constructor D

        super(num1, num2);  // Calling base(Parent) Parameterized Constructor
        System.out.println("Intermediate Parameterized Constructor D");
    }

        // Method for Addition
   public double add(){
        return num1 + num2;
   }

    // Method for Subtraction
    public double sub(){
        return num1 - num2;
    }
}

/* Example of multi level inheritance using default constructor and parameterized constructor*/
// Derived Class D that inherits class C and D

package InheritExamples;

public class E extends D {

    //Default Constructor E
    public E(){

        super();        //Calling default constructor
        System.out.println("Derived Default Constructor E");
    }

    //Parameterized Constructor E
    public  E(double num1, double num2){

        super(num1, num2);
        System.out.println("Derived Parameterized Constructor E");
    }

    public double multiply(){
        return num1 * num2;
    }

    // Main Class to test calculator

    public static void main(String[] args) {

        System.out.println("Creating C's object");
        C c1 = new C(10,5);

        System.out.println("Creating D's object");
        D d1 = new D(10,5);

        System.out.println("Creating E's object");
        E e1 = new E(10,5);

        System.out.println("Addition: " + d1.add());
        System.out.println("Subtraction: " + d1.sub());
        System.out.println("Multiply: " + e1.multiply());
    }
}





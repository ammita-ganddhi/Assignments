/* Example of multi level inheritance using default constructor and parameterized constructor*/
// Base Class C

package InheritExamples;

public class C {
    double num1;
    double num2;

    public C(){
        this.num1 = 0;
        this.num2 = 0;
        System.out.println("Base Class Default Constructor - C ");
    }

    public C(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("Base Class - Parameterized Constructor - C ");
    }

}

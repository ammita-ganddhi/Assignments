/* Example of Hierarchy level inheritance using parameterized constructor and methods */
// Base Class F

package InheritExamples;

public class F {
    int emp_ID;
    String emp_name;

            // Parameterised Constructor F
    public F(int emp_ID, String emp_name){
            this.emp_ID = emp_ID;      // this keyword to access value of instance variable
            this.emp_name = emp_name;
    }

    public void empDetails(){
        System.out.println("Employee Name is: " + emp_name);
        System.out.println("Employee ID is: " + emp_ID);
    }
}

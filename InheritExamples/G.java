/* Example of Hierarchy level inheritance using parameterized constructor and methods */
// Derived(Child) Class1 - F

package InheritExamples;

public class G extends F{

    double basic_salary;
    double allowance;

        //Parameterized Constructor
    public G(int emp_ID, String emp_name, double basic_salary, double allowance) {
        super(emp_ID, emp_name);
        this.basic_salary = basic_salary;
        this.allowance = allowance;

    }
            // Method to calculate Salary
    public double calculate_salary(){
        return basic_salary + allowance;
    }

    // method overriding
    public void empDetails(){
        super.empDetails();
        System.out.println("Permanent Employees Basic Salary: " + basic_salary);
        System.out.println("Permanent Employees allowance: " + allowance);
        System.out.println("Permanent Employees Salary Calculation: " + calculate_salary());
    }
}

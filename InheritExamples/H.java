/* Example of Hierarchy level inheritance using parameterized constructor and methods */
// Derived(Child) Class2 - H

package InheritExamples;

public class H extends F{
    double hourly_rate;
    double hours_worked;

    public H(int emp_ID, String emp_name, double hourly_rate, double hours_worked){
        super(emp_ID, emp_name);
        this.hourly_rate = hourly_rate; // this keyword is used to access values of instance variables
        this.hours_worked = hours_worked;

    }
            // Method to calculate Salary
        public double calculate_salary(){
        return hourly_rate * hours_worked;
        }
            // Method overriding
        public void empDetails(){
            super.empDetails();
            System.out.println("Hourly rate of an Contractual Employee : "+ hourly_rate);
            System.out.println("Total Hours worked by Contractual Employee : " + hours_worked);
            System.out.println("Total Salary of an Contractual Employee : " + calculate_salary());
        }

    public static void main(String[] args) {
        H h1 = new H(101, "Jhon Smith", 1000, 9);
        G g1 = new G(201, "Ammy Dion", 1500, 10);

        System.out.println("Permanent Employee Details: ");
        g1.empDetails();

        System.out.println("Contractual Employee Details: ");
        h1.empDetails();

    }

}




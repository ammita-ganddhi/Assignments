
/* Single Level Inheritance - child class A*/

package InheritExamples;

import java.util.Scanner;

public class
A extends B{
    int student = 5;
    float total_expenditure = 0.0F;

    public static void main(String[] args) {

        A a1 = new A();
        a1.total_expenditure = (a1.per_book_cost * a1.books) * a1.student;
        // Total Expenditure =  (120.55 * 10) * 5 = 6027.5
        System.out.println("The total expenditure on books = " + a1.total_expenditure);
    }
}



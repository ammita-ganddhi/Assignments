package codingAssignments;

public class StarPattern {

    public static void main(String[] args) {

        System.out.println("---------------Pattern 1 ---------------");
        int r = 5;      // define no. of Rows
        for (int i = 1; i <= r; i++) {      // to control the no. of rows
            for (int j = 1; j <= i; j++) {  // to control the no. of column to print *
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("---------------Pattern 2 ---------------");
        int numberOfRows = 5;  // define no. of Rows
        for (int i = 1; i <= numberOfRows; i++) {   // to control the no. of rows
            for (int j = numberOfRows; j > i; j--) {  // to control the no. of column to print space
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {      // to print *
                System.out.print("*");
            }
            System.out.println();
        }
            System.out.println("---------------Pattern 3 ---------------");
        int rw1 = 5;  // define no. of Rows
        for (int i = rw1; i >= 1; i--) {   // to control the no. of rows
            for (int j = 1; j <= i; j++) {  // to control the no. of column to print space
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("---------------Pattern 5 ---------------");
        int rw = 5;  // define no. of Rows
        for (int i = 1; i <= rw; i++) {   // to control the no. of rows
            for (int j = rw; j > i; j--) {  // to control the no. of column to print space
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {      // to print *
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

/* Output Pattern 1:

---------------Pattern 1 ---------------
*
* *
* * *
* * * *
* * * * *
---------------Pattern 2 ---------------
    *
   **
  ***
 ****
*****
---------------Pattern 3 ---------------
* * * * *
* * * *
* * *
* *
*
---------------Pattern 5 ---------------
     *
    * *
   * * *
  * * * *
 * * * * *

 */
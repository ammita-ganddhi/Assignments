package assignmentarray;
import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);  // creates a new Scanner object named s that reads input from keyboard

        System.out.print("Enter the number of students in a class: ");
        int numstu = s.nextInt();   // parse the input as number of students from console

        System.out.print("Enter the number of subjects: ");
        int numsub = s.nextInt();     // parse the input as number of subjects from console

        int[][] mark = new int[numstu][numsub]; //creates a 2d array called mark to store marks of each student and each subject
        for(int i = 0; i < numstu; i++)         // for loop that iterates through each student
                {
                    System.out.println("Let's enter subject-wise marks for student"+ (i+1)+":");
                    for(int j=0; j< numsub; j++)    // for loop that iterates through each subject of current student
                        {
                            System.out.print("Subject"+ (j + 1) + ": "); // Enter marks of subject1,2,3 and so on...

                            mark[i][j] = s.nextInt();               // reads integer input and stores it in an array called 'mark'
                         }

                }
                /* logic to calculate average marks of each student and display the same */

      for(int i=0; i<numstu; i++){      //for loop that iterates through each student to calculate and display their average marks.
          int sum=0;                    //variable to store total marks of current student
          for(int j=0; j<numsub; j++){      // for loop that iterates through each subject for the current student
              sum+= mark[i][j];         // add marks of current subject and stores it in sum variable
          }
         double avg = (double) sum / numsub;        //calculates the average marks of current student by dividing the total marks (sum) by the number of subjects
          System.out.println("The Average marks of Student"+ (i+1)+":" + avg);   //prints the average marks of the current student to the console.
      }
      double classavg = calclassavg(mark);  // method calling for calculating the over all average marks of class and storing it in variable 'classavg'
        System.out.println("The over all average marks of the class is:" + classavg );
        s.close();                      // closes the Scanner object to release the system resources
    }
private static double calclassavg(int[][] mark){        //defines a private static method named 'calclassavg' that takes a 2D array of integers (mark) as input parameter and returns a double.
        int totalsumofmarks = 0;                        //initializes a variable 'totalsumofmarks' to store the total sum of all the marks of all the students
        int totalsubs = mark[0].length;                 //initializes a variable 'totalsubs' to store the total number of all the subjects. all students have same no. of subjects
        for( int[] stumarks: mark){                     // for each student's mark in the 'mark' array
            int sum = 0;                                // initializes variable 'sum' to store the total marks of current student
            for( int mak: stumarks){                    // for each mark of the current student.
                sum += mak;                             // adds mark to sum variable
            }
            totalsumofmarks += sum;                     // adds total marks of current student to the totalsumofmarks variable.
        }
        return (double) totalsumofmarks / (mark.length * totalsubs);        // calculates and returns the overall average marks of the class
}
}

/*
Enter the number of students in a class: 2
Enter the number of subjects: 2
Let's enter subject-wise marks for student1:
Subject1: 100
Subject2: 90
Let's enter subject-wise marks for student2:
Subject1: 50
Subject2: 75
The Average marks of Student1:95.0
The Average marks of Student2:62.5
The over all average marks of the class is:78.75
*/
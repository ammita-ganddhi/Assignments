package assignmentarray;
import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);  // creates a new Scanner object named s that reads input from keyboard

        System.out.print("Enter the number of students in a class: ");
        int numstu = s.nextInt();

        System.out.print("Enter the number of subjects: ");
        int numsub = s.nextInt();

        int[][] mark = new int[numstu][numsub]; //create array to store subject-wise marks of each student
        for(int i = 0; i < numstu; i++)
                {
                    System.out.println("Let's enter subject-wise marks for student"+ (i+1)+":");
                    for(int j=0; j< numsub; j++)
                        {
                            System.out.println("Subject"+ (j + 1) + ": ");

                            mark[i][j] = s.nextInt();
                         }

                }

        double avg, sum;
        avg = numsub / numstu;
    }

}

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
                            System.out.print("Subject"+ (j + 1) + ": ");

                            mark[i][j] = s.nextInt();
                         }

                }

      for(int i=0; i<numstu; i++){
          int sum=0;
          for(int j=0; j<numsub; j++){
              sum+= mark[i][j];
          }
         double avg = (double) sum / numsub;
          System.out.println("The Average marks of Student"+ (i+1)+":" + avg);
      }
      double classavg = calclassavg(mark);
        System.out.println("The over all average marks of the class is:" + classavg );
        s.close();
    }
private static double calclassavg(int[][] mark){
        int totalsumofmarks = 0;
        int totalsubs = mark[0].length;
        for( int[] stumarks: mark){
            int sum = 0;
            for( int mak: stumarks){
                sum += mak;
            }
            totalsumofmarks += sum;
        }
        return (double) totalsumofmarks / (mark.length * totalsubs);
}
}

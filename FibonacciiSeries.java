/*
 * Fibonacci Series in Java using For Loop
 */

import java.util.Scanner;
public class FibonacciiSeries
{
    public static void main(String[] args)
    {
        int number, n1 = 0, n2 = 0, n3 = 1;
        Scanner s = new Scanner(System.in);         // command line input
        System.out.print("Enter value of Fibonaccii number:"); //example: user enters 10
        number = s.nextInt();                       // system scans or parse value as 10
        System.out.print("Fibonacci Series is as follows:");
        for(int i = 1; i <= number; i++)        // program generates the fibonaccii series till 10
        {
            n1 = n2;    // n1 becomes 0     //1          //1
            n2 = n3;    // n2 becomes 1     //1          //2
            n3 = n1 + n2;   // n3 becomes 0+1 =1//2     //3
            System.out.print(n1+" ");
        }
    }
}
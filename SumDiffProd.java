import java.util.Scanner;

public class SumDiffProd {
    public static void main(String[] args) {
        Float num1, num2, sum, dif, prod, avg, max, min;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = (float) s.nextDouble();
        System.out.print("Enter second number: ");
        num2 = (float) s.nextDouble();

        sum = num1 + num2;
        System.out.println("Sum of the two numbers are: " + sum);

        dif = num1 - num2;
        System.out.println("Difference of the two numbers are: " + dif);

        prod = num1 * num2;
        System.out.println("Product of the two numbers are: " + prod);

        avg = (num1 + num2) / 2;
        System.out.println("Average of the two numbers are: " + avg);

       /* Maximum number logic using if-else condition
        if(num1 > num2){
            System.out.println("Maximum number of the two is:" + num1);
        }
            else {
            System.out.println("Maximum number of the two is: " + num2);
        }*/

        max = num1 > num2 ? num1 : num2;
        System.out.println("Maximum number of the two is: " + max);


        min = num1 < num2 ? num1 : num2;
        System.out.println("Minimum number of the two is: " + min);
        
    }

}

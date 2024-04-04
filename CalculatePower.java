import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double num = s.nextDouble();

        double square = Math.pow(num, 2);
        System.out.println("Square of the number is: " + square);

        double cube = Math.pow(num, 3);
        System.out.println("Cube of the number is: " + cube);

        double fourth = Math.pow(num, 4);
        System.out.println("Fourth power of the number is: " + fourth);
    }
}

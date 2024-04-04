import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double num = s.nextDouble();
        DecimalFormat df = new DecimalFormat("0.000");

        double square = Math.pow(num, 2);
        System.out.println("Square of the number is: " + df.format(square));

        double cube = Math.pow(num, 3);
        System.out.println("Cube of the number is: " + df.format(cube));

        double fourth = Math.pow(num, 4);
        System.out.println("Fourth power of the number is: " + df.format(fourth));
    }
}

/* Output1:
Enter the number: 2
Square of the number is: 4.000
Cube of the number is: 8.000
Fourth power of the number is: 16.000

Output2:
Enter the number: 10
Square of the number is: 100.000
Cube of the number is: 1000.000
Fourth power of the number is: 10000.000

Output3:
Enter the number: 89
Square of the number is: 7921.000
Cube of the number is: 704969.000
Fourth power of the number is: 62742241.000

Output4:
Enter the number: 134
Square of the number is: 17956.000
Cube of the number is: 2406104.000
Fourth power of the number is: 322417936.000

Output5:
Enter the number: 34.5
Square of the number is: 1190.250
Cube of the number is: 41063.625
Fourth power of the number is: 1416695.062

Output6:
Enter the number: -45
Square of the number is: 2025.000
Cube of the number is: -91125.000
Fourth power of the number is: 4100625.000
*/
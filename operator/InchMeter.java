package operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class InchMeter {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the inches: ");

      while(true)
        {
            if(s.hasNextDouble()) {
                double inches = s.nextDouble();
                DecimalFormat df = new DecimalFormat("0.00");
                double meters = inches * 0.0254;
                System.out.println("Inches to meter conversion is: " + df.format(meters));
                break;
            }else{
                System.out.print("Invalid input. Re-enter the correct input for inch: ");
                s.next();
            }
        }
    }
}

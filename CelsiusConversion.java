// Java Proram that converts Celsius to Farhaniet and Kelvin //

import java.text.DecimalFormat; // DecimalFormat helps you make decimal numbers look better (round of)
import java.util.Scanner; // class that allows you to read input from keyboard,

public class CelsiusConversion {
    public static void main(String[] args) {
        Float celsius, fahrenheit, kelvin; // Float is a wrapper class that is used to wrap a primitive float value into an object.
       Scanner s = new Scanner(System.in); // creates a new Scanner object named s that reads input from keyboard
       System.out.println("Enter the temperature in Celsius: ");
       celsius = (float) s.nextDouble();    // parse the input in float
        DecimalFormat df = new DecimalFormat("0.000 "); //DecimalFormat object df, numbers will be formatted to display exactly three decimal places
       fahrenheit = (1.8F * celsius) + 32;  // fahrenheit formula
        System.out.println("value of temperature in Fahrenheit is: " + df.format(fahrenheit) + "F");

        kelvin = celsius + 273; // kelvin formula
        System.out.println("value of temperature in Kelvin is: " + df.format(kelvin) + "K");


    }

}

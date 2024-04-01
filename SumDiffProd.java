import java.text.DecimalFormat;
import java.util.Scanner;

public class SumDiffProd {
    public static void main(String[] args) {

        Float num1=0.0f, num2 = 0.0f, sum, dif, prod, avg, max, min;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        try{
        num1 = s.nextFloat();
        } catch (Exception e){
           // System.out.println("It seems you are trying to enter some different data, so provide again");
         String b1 = s.next();
         if(b1.contains("/")){
            String n = b1.split("/")[0];
             String d = b1.split("/")[1];
             num1 = Float.parseFloat(n) / Float.parseFloat(d);
         }else {
             System.out.println("It seems you are trying to enter some different data");
             return;
         }
        }
        System.out.print("Enter second number: ");
       // num2 = (float) s.nextDouble();
        try{
            num2 = s.nextFloat();
        } catch (Exception e){
           // System.out.println("It seems you are trying to enter some different data, so provide again");
            String b1 = s.next();
            if(b1.contains("/")){
                String n = b1.split("/")[0];
                String d = b1.split("/")[1];
                num2 = Float.parseFloat(n) / Float.parseFloat(d);
            }else {
                System.out.println("It seems you are trying to enter some different data");
                return;
            }
        }

        DecimalFormat df = new DecimalFormat("0.000 "); //DecimalFormat object df, numbers will be formatted to display exactly three decimal places

        sum = num1 + num2;
        System.out.println("Sum of the two numbers are: " + df.format(sum));

        dif = num1 - num2;
        System.out.println("Difference of the two numbers are: " + df.format(dif));

        prod = num1 * num2;
        System.out.println("Product of the two numbers are: " + df.format(prod));

        avg = (num1 + num2) / 2;
        System.out.println("Average of the two numbers are: " + df.format(avg));

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

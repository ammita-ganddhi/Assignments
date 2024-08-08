package codingAssignments;

import assignmentarray.Array;

import java.util.Arrays;
import java.util.Scanner;

public class DispSmallLarge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Input number from user
        System.out.print("Enter a number: ");
        String number = s.next();

        // Convert String into Character Array
        char[] digit = number.toCharArray();
        Arrays.sort(digit);         // Sort the characters (ascending by-default)

        //Convert above sorted array back to String and print the same
        String small_num = new String(digit);
        System.out.println("Smallest Number Obtained from the input is: "+ small_num);

        // Reverse the sorted number inorder to print the Greatest number
        String greatest_num = new  StringBuilder(small_num).reverse().toString();
        System.out.println("Largest Number Obtained from the input is: "+ greatest_num);

    }
}

/*

"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=52503:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.DispSmallLarge
Enter a number: 74359
Smallest Number Obtained from the input is: 34579
Largest Number Obtained from the input is: 97543

Process finished with exit code 0

 */
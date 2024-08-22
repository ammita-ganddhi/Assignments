package codingAssignments;

public class LuhnAlgorithm {

    public static boolean isValidLuhn(String number) {
        int totalSum = 0; //to accumulate the sum of the digits after processing
        boolean isSecond = false; //This variable keeps track of whether the current digit is every second digit from the right.

            // Loop that Iterates through each digit of the input string from right to left.
        for (int i = number.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(number.charAt(i));    // retrives the numeric value from the index and stores in variable digit

            if (isSecond) {     //Condition tha checks if the current digit is every second digit from the right
                digit *= 2;         // doubles the digit
                if (digit > 9) {    //if doubling result is > 9
                    digit -= 9;     // subtract 9 from it. Logic for adding the digits of the result having 2digit no. (e.g., 12 becomes 1 + 2 = 3).
                }
            }

            totalSum += digit;      //Adds the processed digit to totalSum
            isSecond = !isSecond;   //Toggles the isSecond boolean. If it was true, it becomes false, and vice versa. This alternation ensures that every second digit is processed as required by the algorithm.
        }

        return totalSum % 10 == 0;  //Returns true if the total sum modulo 10 is 0, meaning the number is valid according to the Luhn Algorithm; otherwise, it returns false.
    }

    public static void main(String[] args) {
        String number = "5529403615446215";  // Example number from the screenshot
        if (isValidLuhn(number)) {
            System.out.println(number + " is a valid number.");
        } else {
            System.out.println(number + " is an invalid number.");
        }
    }
}

/*
"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=54970:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.LuhnAlgorithm
5529403615446215 is a valid number.

Process finished with exit code 0
 */
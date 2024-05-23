package programming.ocean.pluralsight.general;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Create a method to check if a number is an increasing number.
 * A number is said to be an increasing number if no digit is exceeded by the digit to its left.
 * e.g. : 134468
 */
public class IncreasingNumber {
    public static void main(String... a) {
        IncreasingNumber templateClassObj = new IncreasingNumber();
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        System.out.println("Please enter a number: ");
        try {
            input = scanner.nextInt();
        } catch (InputMismatchException exp) {
            System.out.println("Invalid input");
        }
        templateClassObj.checkIncreasing(input);
    }

    private void checkIncreasing(int input) {
        boolean isIncreasing = true;
        int prevDigit = 0;
        while (input % 10 > 0) {
            int curDigit = input % 10;
            if (curDigit > prevDigit && prevDigit > 0) {
                isIncreasing = false;
                break;
            }
            prevDigit = curDigit;
            input = input / 10;
        }
        if (isIncreasing)
            System.out.println("Input is an increasing number");
        else
            System.out.println("Input is a non-increasing number");
    }
}

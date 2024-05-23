package programming.ocean.pluralsight.general;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Create a method to check if a number is a power of two or not
 */
public class PowerOfTwo {
    public static void main(String... a) {
        PowerOfTwo powerOfTwoObj = new PowerOfTwo();
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        System.out.println("Please enter a number");
        try {
            input = scanner.nextInt();
        } catch (InputMismatchException exp) {
            System.out.println("Invalid input");
        }
        powerOfTwoObj.checkPowerOfTwo(input);
    }

    private void checkPowerOfTwo(int input) {
        boolean isPowerOfTwo = true;
        while (input % 2 == 0) {
            input = input / 2;
            if (input % 2 > 0) {
                isPowerOfTwo = false;
                break;
            }
        }
        if (isPowerOfTwo)
            System.out.println("Input number is a power of 2");
        else
            System.out.println("Input number is NOT a power of 2");
    }
}

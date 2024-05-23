package programming.ocean.pluralsight.general;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Write a Java program that prompts the user for an integer and then prints out all the
 * prime numbers up to that Integer
 */
public class PrintPrime {
    public static void main(String... a) {
        Scanner scanner = new Scanner(System.in);
        PrintPrime printPrimeObj = new PrintPrime();
        int input = 0;
        System.out.println("Please enter a number: ");
        try {
            input = scanner.nextInt();
        } catch (InputMismatchException exp) {
            System.out.println("Invalid input.");
        }
        printPrimeObj.printPrimeUpto(input);
    }

    private void printPrimeUpto(int input) {
        for (int count = 1; count <= input; count++) {
            boolean isPrime = true;
            for (int index = 2; index < count; index++) {
                if (count % index == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(count);
        }
    }
}

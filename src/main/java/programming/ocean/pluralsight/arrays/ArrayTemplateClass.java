package programming.ocean.pluralsight.arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Create a method which accepts an array of integer elements and return the second
 * smallest element in the array
 */
public class ArrayTemplateClass {
    public static void main(String... a) {
        ArrayTemplateClass arrTemplateObj = new ArrayTemplateClass();
        Scanner scanner = new Scanner(System.in);
        int inputSize = 0;
        System.out.println("Please enter input array size: ");
        try {
            inputSize = scanner.nextInt();
        } catch (InputMismatchException exp) {
            System.out.println("Invalid input");
        }
        int[] inputArr = arrTemplateObj.getArrayInput(inputSize, scanner);
        System.out.println("\nArray Input:");
        for (int index = 0; index < inputArr.length; index++) {
            System.out.print(inputArr[index] + "\t");
        }
    }

    private int[] getArrayInput(int size, Scanner scanner) {
        int[] inputArr = new int[size];
        System.out.println("Please enter input array elements");
        for (int count = 0; count < size; count++) {
            inputArr[count] = scanner.nextInt();
        }
        return inputArr;
    }
}

package com.practice.programming.ocean.pluralsight.arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Create a method which accepts an integer array and removes all the duplicates in the
 * array. Return the resulting array in descending order
 */
public class RemoveDuplicateElem {
    public static void main(String... a) {
        RemoveDuplicateElem removeDuplicateElemObj = new RemoveDuplicateElem();
        Scanner scanner = new Scanner(System.in);
        int inputSize = 0;
        System.out.println("Please enter input array size: ");
        try {
            inputSize = scanner.nextInt();
        } catch (InputMismatchException exp) {
            System.out.println("Invalid input");
        }
        int[] inputArr = removeDuplicateElemObj.getArrayInput(inputSize, scanner);
        System.out.println("\nArray Input:");
        for (int index = 0; index < inputArr.length; index++) {
            System.out.print(inputArr[index] + "\t");
        }

        int[] distinctArr = removeDuplicateElemObj.getDistinctArray(inputArr);
        System.out.println("\nOutput Array:");
        for (int index = 0; index < distinctArr.length; index++) {
            System.out.print(distinctArr[index] + "\t");
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

    private int[] getDistinctArray(int[] inputArr) {
        Arrays.sort(inputArr);
        int indexDistinct = 0;
        for (int index = 0; index < inputArr.length - 1; index++) {
            if (inputArr[index] != inputArr[index + 1]) {
                inputArr[indexDistinct] = inputArr[index];
                indexDistinct++;
            }
        }
        inputArr[indexDistinct] = inputArr[inputArr.length - 1];
        for (int index = ++indexDistinct; index < inputArr.length; index++) {
            inputArr[index] = 0;
        }

        int[] distinctArr = new int[indexDistinct];
        for (int index = 0; index < distinctArr.length; index++) {
            distinctArr[index] = inputArr[distinctArr.length - 1 - index];
        }

        return distinctArr;
    }
}

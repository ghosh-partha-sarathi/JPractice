package com.practice.programming.ocean.pluralsight.arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Create a method which accepts an array of integer elements and return the second
 * smallest element in the array
 */
public class SecondSmallestElem {
    public static void main(String... a) {
        SecondSmallestElem secondSmallestElemObj = new SecondSmallestElem();
        Scanner scanner = new Scanner(System.in);
        int inputSize = 0;
        System.out.println("Please enter input array size: ");
        try {
            inputSize = scanner.nextInt();
        } catch (InputMismatchException exp) {
            System.out.println("Invalid input");
        }
        int[] inputArr = secondSmallestElemObj.getArrayInput(inputSize, scanner);
        System.out.println("\nArray Input:");
        for (int index = 0; index < inputArr.length; index++) {
            System.out.print(inputArr[index] + "\t");
        }
        int secondSmallestElem = secondSmallestElemObj.getSecondSmallestElem(inputArr);
        System.out.println("\nSecond smallest element: " + secondSmallestElem);
    }

    private int[] getArrayInput(int size, Scanner scanner) {
        int[] inputArr = new int[size];
        System.out.println("Please enter input array elements");
        for (int count = 0; count < size; count++) {
            inputArr[count] = scanner.nextInt();
        }
        return inputArr;
    }

    private int getSecondSmallestElem(int[] inputArr) {
        int secondSmallest = 0;
        int smallest = inputArr[0];
        for (int index = 1; index < inputArr.length; index++) {
            int curElem = inputArr[index];
            if (curElem < smallest) {
                secondSmallest = smallest;
                smallest = curElem;
            } else if (curElem < secondSmallest || secondSmallest == 0) {
                secondSmallest = curElem;
            }
        }
        return secondSmallest;
    }
}

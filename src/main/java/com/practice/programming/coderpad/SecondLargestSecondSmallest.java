package com.practice.programming.coderpad;

import java.util.*;

/**
 * Write a method to find second LARGEST number from a given input array of numbers.
 * Write a method to find second SMALLEST number from a given input array of numbers.
 */
public class SecondLargestSecondSmallest {
    public static void main(String[] args) {
        boolean largestTestsPassed=true;
        boolean smallestTestsPassed=true;

        int[] input = {3, 2, 1, 1, 0, -2, 0, 3, 8};
        int secondLargestResult = getSecondLargestNumber(input);
        largestTestsPassed &= secondLargestResult==3;
        int secondSmallestResult = getSecondSmallestNumber(input);
        smallestTestsPassed &= secondSmallestResult==0;

        input = new int[]{3, 2, 1, 1, 0, -2, 0, 3, 8};
        secondLargestResult = getSecondLargestNumber(input);
        largestTestsPassed &= secondLargestResult==3;
        secondSmallestResult = getSecondSmallestNumber(input);
        smallestTestsPassed &= secondSmallestResult==0;

        if(largestTestsPassed){
            System.out.println("All tests to get second largest number PASSED.");
        } else {
            System.out.println("Some/all tests to get SECOND LARGEST number FAILED.");
        }

        if(smallestTestsPassed){
            System.out.println("All tests to get second smallest number PASSED.");
        } else {
            System.out.println("Some/all tests to get SECOND SMALLEST number FAILED.");
        }
    }
    private static int getSecondLargestNumber(int[] input) {
        OptionalInt secondLargest =
                Arrays.stream(input)
                        .distinct()
                        .map(anInt -> (-1*anInt))
                        .sorted()
                        .skip(1)
                        .map(anInt -> -1*anInt)
                        .findFirst();

        return secondLargest.getAsInt();
    }

    private static int getSecondSmallestNumber(int[] input) {
        OptionalInt secondSmallest=
                Arrays.stream(input)
                        .distinct()
                        .sorted()
                        .skip(1)
                        .findFirst();
        return secondSmallest.getAsInt();
    }
}

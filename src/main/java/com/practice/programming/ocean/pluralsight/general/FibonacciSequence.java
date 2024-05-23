package com.practice.programming.ocean.pluralsight.general;

/**
 * Write a Java program that uses both recursive and non-recursive functions to print
 * the nth value of the Fibonacci sequence
 * 1	1	2	3	5	8	13	21	34	55	89	144 233 377
 */
public class FibonacciSequence {
    private static final int input = 12;

    public static void main(String... a) {
        FibonacciSequence fs = new FibonacciSequence();
        int result = fs.getFibonacciValue(input);
        System.out.println(result);
    }

    private int getFibonacciValue(int n) {
        int a;
        if (n <= 2) {
            a = 1;
        } else {
            a = getFibonacciValue(n - 2) + getFibonacciValue(n - 1);
        }
        return a;
    }
}

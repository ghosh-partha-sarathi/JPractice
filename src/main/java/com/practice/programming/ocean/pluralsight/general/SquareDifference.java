package com.practice.programming.ocean.pluralsight.general;

/**
 * Create a class with a method to find the difference between the sum of the squares and
 * the square of the sum of the first n natural numbers.
 */
public class SquareDifference {
    private static final int input = 10;

    public static void main(String... a) {
        SquareDifference squareDifferenceObj = new SquareDifference();
        double squareDifference = squareDifferenceObj.calculateSquareDifference(input);
        System.out.println(squareDifference);
    }

    private double calculateSquareDifference(int number) {
        double difference = 0;
        double sumOfSquare = getSumOfSquares(number);
        double squareOfSum = getSquareOfSum(number);
        difference = squareOfSum - sumOfSquare;
        return difference;
    }

    private double getSumOfSquares(int number) {
        double sumOfSquare = 0;
        for (int index = 1; index <= number; index++) {
            sumOfSquare += Math.pow(index, 2);
        }
        return sumOfSquare;
    }

    private double getSquareOfSum(int number) {
        double squareOfSum = 0;
        int sumOfNum = 0;
        for (int index = 0; index <= number; index++) {
            sumOfNum += index;
        }
        squareOfSum = Math.pow(sumOfNum, 2);
        return squareOfSum;
    }
}

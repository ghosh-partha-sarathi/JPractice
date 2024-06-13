package com.practice.programming.personal.general;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface SumCalculator {
    /** method to find the sum of two integers. */
    public int sumOfIntegers(int first, int second);
}

@FunctionalInterface
interface CheckStringEmptiness {
    /** method to check if a given string is empty. */
    public boolean isStringEmpty(String input);
}

@FunctionalInterface
interface ConvertStringCase {
    /** method to convert a list of strings to uppercase and lowercase. */
    public String convertCase(String input);
}

@FunctionalInterface
interface OddEvenFilter {
    /** method to filter out even and odd numbers from a list of integers. */
    public boolean filterOddEven(List<Integer> listNumbers);
}

@FunctionalInterface
interface StringSorter {
    /** method to sort a list of strings in alphabetical order. */
    public boolean sortStringsAlphabetically(List<String> listString);
}

@FunctionalInterface
interface DoubleAverageCalculator {
    /** method to find the average of a list of doubles. */
    public boolean calculateAverage(List<Double> inputList);
}

@FunctionalInterface
interface DuplicateIntegerFilter {
    /** method to remove duplicates from a list of integers. */
    public List<Integer> removeDuplicateIntegers(List<Integer> listInteger);
}

@FunctionalInterface
interface FactorialCalculator {
    /** method to calculate the factorial of a given number. */
    public Integer calculateFactorial(int input);
}

@FunctionalInterface
interface PrimeNumberDetector {
    /** method to check if a number is prime. */
    public boolean checkPrime(int input);
}

@FunctionalInterface
interface StringConcatenator {
    /** method to concatenate two strings. */
    public String concatenateStrings(String input);
}

@FunctionalInterface
interface MinMaxIntegerFinder {
    /** method to find the maximum and minimum values in a list of integers. */
    public void printMinMaxInteger(List<Integer> listNumber);
}

@FunctionalInterface
interface MultiplyAndAddIntegers {
    /** method to multiply and sum all elements in a list of integers. */
    public int isStringEmpty(List<Integer> listNumber);
}

@FunctionalInterface
interface WordCounterInSentence {
    /** method to count words in a sentence. */
    public int countWordsInSentence(String inputSentence);
}

@FunctionalInterface
interface PalindromeDetector {
    /** method to check if a given string is a palindrome. */
    public boolean isPalindrome(String input);
}

@FunctionalInterface
interface EvenNumberSumOfSquaresCalculator {
    /** method to calculate the sum of squares of all odd and even numbers in a list. */
    public boolean calculateSumOfSquaresEven(String input);
}

@FunctionalInterface
interface WordIdentifier {
    /** method to check if a list of strings contains a specific word. */
    public boolean isWordExist(List<String> listStrings);
}

@FunctionalInterface
interface MinMaxStringLengthFinder {
    /** method to find the length of the longest and smallest string in a list. */
    public void printLongestSmallestStringLengths(String input);
}

@FunctionalInterface
interface PerfectSquareDetector {
    /** method to check if a given number is a perfect square. */
    public boolean isPerfectSquare(int input);
}

@FunctionalInterface
interface SecondLargestFinder {
    /** method to find the second largest and smallest element in an array. */
    public boolean findSecondLargest(int[] inputNumbers);

    // public boolean findSecondSmallest(int[] inputNumbers);
}

@FunctionalInterface
interface ObjectSorter {
    /** method to sort a list of objects based on a specific attribute. */
    public boolean sortBy(List<Object> listObjects);
}

@FunctionalInterface
interface SumOfPrimeCalculator {
    /** method to calculate the sum of all prime numbers in a given range. */
    public int calculateSumOfPrimes(int rangeStart, int rangeEnd);
}

@FunctionalInterface
interface CheckStringCase {
    /** method to check if a list of strings are all uppercase or all lowercase or mixedcase. */
    public boolean isStringSameCase(String input);
}

@FunctionalInterface
interface AverageStringLengthCalculator {
    /** method to find the average length of strings in a list. */
    public int getAverageLength(List<String> listStr);
}

@FunctionalInterface
interface LargestPrimeFactorCalculator {
    /** method to find the largest prime factor of a given number. */
    public List<Integer> calculateLargestPrimeFactor(int input);
}

@FunctionalInterface
interface IntegerToBinaryConverter {
    /** method to convert an integer to their corresponding binary representation. */
    public void convertToBinary(int input);
}

public class LambdaExamples {
    public static void main(String[] args){
        boolean testsPassed = true;

        /** implement a lambda expression to find the sum of two integers. */
        SumCalculator sumCalculatorExpression = (x, y) -> x + y;
        testsPassed &= sumCalculatorExpression.sumOfIntegers(4, 5)==9;
        testsPassed &= sumCalculatorExpression.sumOfIntegers(-4, -2)==-6;

        /** implement a lambda expression to check if a given string is empty. */
        // CheckStringEmptiness

        /** implement a lambda expression to convert a list of strings to uppercase and lowercase. */
        // ConvertStringCase

        /** implement a lambda expression to filter out even and odd numbers from a list of integers. */

        /** implement a lambda expression to sort a list of strings in alphabetical order. */

        /** implement a lambda expression to find the average of a list of doubles. */

        /** implement a lambda expression to remove duplicates from a list of integers. */
        DuplicateIntegerFilter duplicateFilterExpression = (listIntegers) -> listIntegers.stream().collect(Collectors.toSet()).stream().toList();
        List<Integer> listIntegers = new ArrayList<>();
        listIntegers.add(2);
        listIntegers.add(3);
        listIntegers.add(1);
        listIntegers.add(1);
        listIntegers.add(2);
        listIntegers.add(2);
        listIntegers.add(5);
        System.out.println(duplicateFilterExpression.removeDuplicateIntegers(listIntegers));

        /** Write a lambda expression to implement a lambda expression to calculate the factorial of a given number. */

        /** implement a lambda expression to create a lambda expression to check if a number is prime. */

        /** implement a lambda expression to concatenate two strings. */

        /** implement a lambda expression to find the maximum and minimum values in a list of integers. */

        /** create a lambda expression to multiply and sum all elements in a list of integers. */

        /** implement a lambda expression to count words in a sentence. */

        /** implement a lambda expression to check if a given string is a palindrome. */

        /** implement a lambda expression to calculate the sum of squares of all odd and even numbers in a list. */

        /** implement a lambda expression to check if a list of strings contains a specific word. */

        /** implement a lambda expression to find the length of the longest and smallest string in a list. */

        /** implement a lambda expression to check if a given number is a perfect square. */

        /** implement a lambda expression to find the second largest and smallest element in an array. */

        /** implement a lambda expression to sort a list of objects based on a specific attribute. */


        /** implement a lambda expression to calculate the sum of all prime numbers in a given range. */
        // SumOfPrimeCalculator

        /** implement a lambda expression to check if a list of strings are all uppercase or all lowercase or mixedcase. */
        // CheckStringCase

        /** implement a lambda expression to find the average length of strings in a list. */
        // AverageStringLengthCalculator

        /** implement a lambda expression to find the largest prime factor of a given number. */
        // LargestPrimeFactorCalculator

        /** implement a lambda expression to convert an integer to their corresponding binary representation. */
        // IntegerToBinaryConverter.

        if(testsPassed) {
            System.out.println("All tests have PASSED.");
        } else {
            System.out.println("One or more tests have FAILED.");
        }
    }
}

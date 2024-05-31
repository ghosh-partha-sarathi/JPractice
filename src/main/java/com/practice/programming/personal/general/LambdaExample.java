package com.practice.programming.personal.general;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

interface LambdaExpressions {
    /** implement a lambda expression to find the sum of two integers. */
    // public int sumOfIntegers(int first, int second);

    /** implement a lambda expression to check if a given string is empty. */
    // public boolean isStringEmpty(String input);

    /** implement a lambda expression to convert a list of strings to uppercase and lowercase. */
    // public String convertCase(String input);

    /** implement a lambda expression to filter out even and odd numbers from a list of integers. */

    /** implement a lambda expression to sort a list of strings in alphabetical order. */

    /** implement a lambda expression to find the average of a list of doubles. */

    /** implement a lambda expression to remove duplicates from a list of integers. */
    public List<Integer> removeDuplicateIntegers(List<Integer> listInteger);

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

    /** implement a lambda expression to check if a list of strings are all uppercase or all lowercase or mixedcase. */

    /** implement a lambda expression to find the average length of strings in a list. */

    /** implement a lambda expression to find the largest prime factor of a given number. */

    /** implement a lambda expression to convert an integer to their corresponding binary representation. */
}
public class LambdaExample {
    public static void main(String[] args){
        int num1 = 4;
        int num2 = 5;
        boolean testsPassed = true;
        // LambdaExpressions lambdaExpressions = (x, y) -> x + y;

        /** expression to remove duplicate integers */
        LambdaExpressions lambdaExpressions = (listIntegers) -> listIntegers.stream().collect(Collectors.toSet()).stream().toList();
        List<Integer> listIntegers = new ArrayList<>();
        listIntegers.add(2);
        listIntegers.add(3);
        listIntegers.add(1);
        listIntegers.add(1);
        listIntegers.add(2);
        listIntegers.add(2);
        listIntegers.add(5);
        System.out.println(lambdaExpressions.removeDuplicateIntegers(listIntegers));

        // int result = lambdaExpressions.sumOfIntegers(num1, num2);
    }
}

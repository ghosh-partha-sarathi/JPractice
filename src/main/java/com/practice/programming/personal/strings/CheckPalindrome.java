package com.practice.programming.personal.strings;

/**
 * Write a java program to check if a given string is palindrome or not.
 * e.g. "7449447" is a palindrome number
 */
public class CheckPalindrome {
    public static void main(String[] args) {
        boolean testCasePassed = true;

        String input = "7449447";
//        testCasePassed &= isStringPalindrome(input);

        input = "Hello";
        testCasePassed &= !isStringPalindrome(input);

        if (testCasePassed) {
            System.out.println("Palindrome checks PASSED...");
        } else {
            System.out.println("Palindrome check/checks FAILED...");
        }
    }

    private static boolean isStringPalindrome(String input) {
        char[] inputArr = input.toCharArray();
        int maxIndex = inputArr.length - 1;
        for (int index = 0; index <= maxIndex; index++) {
            if (index < maxIndex - index &&
                    inputArr[index] != inputArr[maxIndex - index]) {
                return false;
            }
        }
        return true;
    }
}

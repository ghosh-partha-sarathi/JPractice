package com.practice.programming.coderpad;

/**
 * Check if the given String is Panagram or not. If not panagram, then print the missing letters.
 * ex: The quick brown fox jumps over the lazy dog.
 * Write a program for Panagram Detector.
 * <p>
 * * The sentence "The quick brown fox jumps over the lazy dog" contains every single letter in the alphabet. Such sentences are called pangrams.
 * * Write a function called "findMissingLetters"  which takes a String `sentence`,  and returns all the letters it is missing. Which prevent it from being a pangram.
 * * You should ignore the case of the letters in sentence, and your return should be all lower case letters, in alphabetical order.
 * * You should also ignore all non US-ASCII characters.
 */
public class CheckPanagram {
    private static final String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        doTestsPass();
    }

    public static boolean doTestsPass() {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean testsPassed = true;
        testsPassed &= findMissingLetters(input);

        input = "The quick brown fox jump over the lazy dog";
        testsPassed &= !findMissingLetters(input);

        if (testsPassed) {
            System.out.println("String panagram check tests passes");
        } else {
            System.out.println("Tests failed");
        }
        return testsPassed;
    }

    static boolean findMissingLetters(String input) {
        boolean isStringPanagram = true;
        char[] lettersArr = letters.toCharArray();
        input = input.toUpperCase();
        for (int index = 0; index < lettersArr.length; index++) {
            if (input.indexOf(lettersArr[index]) == -1) {
                System.out.println(lettersArr[index] + "\t");
                isStringPanagram = false;
            }
        }
        return isStringPanagram;
    }
}

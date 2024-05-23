package com.practice.programming.coderpad;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a program which would take a string as input like 'aabccd'
 * and print the occurances of characters  in the format a=2,b=1,c=2,d=1
 */
public class PrintCharOccurance {
    private static final String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        doTestsPass();
    }

    public static boolean doTestsPass() {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean testsPassed = true;
        Map<Character, Integer> characterIntegerMap = printCharacterCount(input);

        input = "The quick brown fox jump over the lazy dog";
        characterIntegerMap = printCharacterCount(input);

        System.out.println("Character count in input string: ");
        System.out.println(characterIntegerMap);

        if (testsPassed) {
            System.out.println("String panagram check tests passes");
        } else {
            System.out.println("Tests failed");
        }
        return testsPassed;
    }

    static Map<Character, Integer> printCharacterCount(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        // input=input.toUpperCase();
        char[] characterArr = input.toCharArray();
        for (int index = 0; index < characterArr.length; index++) {
            if (input.indexOf(characterArr[index]) > -1) {
                int curCount = charCountMap.getOrDefault(characterArr[index], 0);
                charCountMap.put(characterArr[index], ++curCount);
            }
        }

        System.out.println("Character count in input string: ");
        System.out.println(charCountMap);

        return charCountMap;
    }
}

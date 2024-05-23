package com.practice.programming.coderpad;

import java.util.Arrays;

/**
 * Given the arrival and departure times of all trains that reach a railway station, the task is to find the minimum number of platforms required for the railway station so that no train waits. We are given two arrays that represent the arrival and departure times of trains that stop.
 * Examples: 
 * Input: arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}, dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00} 
 * Output: 3 
 * Explanation: There are at-most three trains at a time (time between 9:40 to 12:00)
 * <p>
 * Input: arr[] = {9:00, 9:40}, dep[] = {9:10, 12:00} 
 * Output: 1 
 * Explanation: Only one platform is needed.
 */
public class MaxPlatformCount {
    public static void main(String[] args) {
        doTestsPass();
    }

    public static boolean doTestsPass() {
        int[] arr1 = {900, 940, 950, 1100, 1500, 1800};
        int[] dep1 = {910, 1200, 1120, 1130, 1900, 2000};
        boolean testsPassed = true;
        testsPassed &= findPlatform(arr1, dep1) == 3;

        int[] arr2 = {100, 300, 600};
        int[] dep2 = {900, 400, 500};
        testsPassed &= findPlatform(arr2, dep2) == 2;

        if (testsPassed) {
            System.out.println("Tests passes");
        } else {
            System.out.println("Tests failed");
        }
        return testsPassed;
    }

    static int findPlatform(int[] arr, int[] dep) {
        int maxPlatformCount = 0;
        int nextArr = 0;
        Arrays.sort(dep);
        for (int countDep = 0; countDep < dep.length; countDep++) {
            int curPlatformCount = 0;
            for (int countArr = nextArr; countArr < arr.length; countArr++) {
                if (arr[countArr] < dep[countDep]) {
                    curPlatformCount++;
                } else {
                    nextArr = countArr;
                    break;
                }
            }
            if (curPlatformCount > maxPlatformCount) {
                maxPlatformCount = curPlatformCount;
            }
        }
        System.out.println("Platform Count: " + maxPlatformCount);
        return maxPlatformCount;
    }

    /**
     * Write the Java code to, the method should accept two strings and return Boolean, second string should contain only the chars present in 1st string
     */
    static boolean checkIfCharacterPresent(String str1, String str2) {
        boolean isCharacterPresent = true;
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();
        for (int index = 0; index < charArr2.length; index++) {
            if (str1.indexOf(charArr2[index]) < 0)
                isCharacterPresent = false;
        }
        return isCharacterPresent;
    }

    /**
     * Write the method which accepts the two strings, 2nd string should be the reverse of 1st string then return boolean
     */
    static boolean checkIfReverseString(String str1, String str2) {
        boolean isReverseString = true;
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();
        int str2Length = charArr2.length - 1;
        for (int index = 0; index < charArr1.length; index++) {
            if (charArr1[index] != charArr2[str2Length - index]) {
                isReverseString = false;
                break;
            }
        }
        return isReverseString;
    }
}

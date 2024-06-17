package com.practice.programming.personal.general;

import java.util.Arrays;

/**
 * Netcracker interview.
 * Write a program to check if two given Strings are rotations of each other.
 * e.g. - Strings "ZXY" and "YZX" are rotations of "XYZ"
 * example:
 * Input: "XYZ", "ZXY"
 * Output: true
 */
public class StringRotationCheck {
    public static void main(String[] args){
        boolean isRotation=true;

        String input1 = "XYZ";
        String input2 = "ZXY";
        isRotation &= checkRotationSolnFirst(input1, input2)==true;
        isRotation &= checkRotationSolnSecond(input1, input2)==true;

        input1 = "XYZ";
        input2 = "XZY";
        isRotation &= checkRotationSolnFirst(input1, input2)==false;
        isRotation &= checkRotationSolnSecond(input1, input2)==false;

        input1 = "ABCDEF";
        input2 = "DEFABC";
        isRotation &= checkRotationSolnFirst(input1, input2)==true;
        isRotation &= checkRotationSolnSecond(input1, input2)==true;

        input1 = "ABCDEF";
        input2 = "DECABF";
        isRotation &= checkRotationSolnFirst(input1, input2)==false;
        isRotation &= checkRotationSolnSecond(input1, input2)==false;

        input1 = "AABBACDE";
        input2 = "ACDEAABB";
        isRotation &= checkRotationSolnSecond(input1, input2)==true;

        if(isRotation){
            System.out.println("All tests to check String rotation PASSED.");
        } else {
            System.out.println("Some/all tests to check String rotation FAILED.");
        }
    }

    private static boolean checkRotationSolnFirst(String inFirst, String inSecond){
        /**
         * This is simplest check for String rotation which works if all characters
         * in input Strings are unique
         */
        boolean isRotation=true;
        char[] inputArrFirst = inFirst.toCharArray();
        char[] inputArrSecond = inSecond.toCharArray();
        int startIndex = inSecond.indexOf(inputArrFirst[0]);

        for(int index=0; index<inputArrFirst.length; index++){
            if(inputArrFirst[index]!=inputArrSecond[startIndex]){
                isRotation=false;
                break;
            } else {
                startIndex++;
                if(startIndex>=inputArrSecond.length){
                    startIndex=0;
                }
            }
        }

        return isRotation;
    }

    private static boolean checkRotationSolnSecond(String inFirst, String inSecond){
        /**
         * This solution can be used with duplicate charaters present in input Strings
         */
        boolean isRotation=false;
        int firstStrLength=inFirst.length();
        inFirst = inFirst.concat(inFirst);
        int maxLength = inSecond.length();

        for(int index=0; index<firstStrLength; index++){
            String compString = inFirst.substring(index, index+maxLength);
            if(inSecond.equals(compString)){
                isRotation=true;
                break;
            }
        }

        return isRotation;
    }
}

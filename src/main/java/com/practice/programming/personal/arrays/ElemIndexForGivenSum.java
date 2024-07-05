package com.practice.programming.personal.arrays;

import java.util.Arrays;

/**
 * Write a program to print indexes of elements in a given array of integers whose sum
 * equals given target number.
 *    Example:
 *         Input: nums = [1, 7, 11, 15,2], target = 9
 *         Output: [1, 4]
 *         Explanation: nums[1] + nums[4] = 7 + 2= 9, so the output is [1, 4].
 */
public class ElemIndexForGivenSum {
    public static void main(String[] args){
        int[] input = {1, 7, 11, 15,2};
        int target = 16;
        printElemIndexes(input, target);
    }

    private static void printElemIndexes(int[] input, int target) {
        int[] resultIndexes = new int[2];
        boolean matchFound=false;
        for(int index1=0; index1<input.length; index1++){
            int firstElem = input[index1];
            int targetElem = target-firstElem;
            for(int index2=index1; index2<input.length; index2++){
                if(input[index2]==targetElem){
                    resultIndexes[0]=index1;
                    resultIndexes[1]=index2;
                    matchFound=true;
                    break;
                }
            }
            if(matchFound) break;
        }

        Arrays.stream(resultIndexes).forEach(elem -> System.out.print(elem+"\t"));
    }
}

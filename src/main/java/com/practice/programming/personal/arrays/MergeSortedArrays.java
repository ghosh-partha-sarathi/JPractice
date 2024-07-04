package com.practice.programming.personal.arrays;

import java.util.Arrays;

/**
 * Write a program to merge two given sorted arrays so that the resultant array is also sorted.
 * Example -
 *         Input: arr1=[1, 3, 5, 7], arr2=[2, 4, 6, 8]
 *         Output: arr3=[1, 2, 3, 4, 5, 6, 7, 8, 9]
 */
public class MergeSortedArrays {
    public  static void main(String[] args){
        int[] inputArr1 = {1, 3, 4, 5, 7};
        int[] inputArr2 = {2, 4, 6, 8, 9};
        int[] mergedArr = merge(inputArr1, inputArr2);

        Arrays.stream(mergedArr).forEach(elem -> System.out.print(elem+"\t"));
    }

    private static int[] merge(int[] arr1, int[] arr2){
        int size1 = arr1.length;
        int size2 = arr2.length;
        int[] resultArr = new int[size1+size2];

        int counter1=0;
        int counter2=0;
        int resultIndex=0;

        while(counter1<size1 && counter2<size2){
            if(arr1[counter1]<arr2[counter2]){
                resultArr[resultIndex]=arr1[counter1];
                counter1++;
            } else if(arr2[counter2]<arr1[counter1]){
                resultArr[resultIndex]=arr2[counter2];
                counter2++;
            } else if(arr1[counter1]==arr2[counter2]) {
                resultArr[resultIndex]=arr1[counter1];
                resultIndex++;
                resultArr[resultIndex]=arr2[counter2];
                counter1++;
                counter2++;
            }
            resultIndex++;
        }

        while(counter1<size1){
            resultArr[resultIndex]=arr1[counter1];
            resultIndex++;
            counter1++;
        }

        while(counter2<size2){
            resultArr[resultIndex]=arr2[counter2];
            resultIndex++;
            counter2++;
        }

        return resultArr;
    }
}

package com.practice.programming.personal.general;

import java.util.ArrayList;
import java.util.List;

/**
 * Generates a sequence of numbers from a given input number by adding previous n digits
 * in the sequence (n being the number of integers in the input) untill the input number is reached.
 * example: input 742
 *    sequence: 13, 19, 34, 66 .... 742
 */
public class MagicalNumberSequence {
    public static void main(String[] args){
        int input = 12345;
        generateSequence(input);
    }

    private static void generateSequence(int number){
        List<Integer> resultList = new ArrayList<>();
        int digitCount=0;
        int inputNum=number;
        while(inputNum%10>=0 && inputNum>0){
            resultList.add(0, inputNum%10);
            digitCount++;
            inputNum=inputNum/10;
        }

        int nextSeq=0;
        int startIndex;
        while(nextSeq<number){
            nextSeq=0;
            startIndex=resultList.size()-1;
            for(int index=startIndex; index>startIndex-digitCount; index--){
                nextSeq=nextSeq+resultList.get(index);
            }
            resultList.add(nextSeq);
            System.out.print(nextSeq + "\t");
        }

        System.out.println();

        if(nextSeq==number)
            System.out.println("Input number is a magical number.");
    }
}

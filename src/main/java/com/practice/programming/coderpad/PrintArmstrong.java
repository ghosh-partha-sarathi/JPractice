package com.practice.programming.coderpad;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Write a program to print all Armstrong numbers between 1 to n.
 *
 * An Armstrong number is a number that is equal to the sum of its digits
 * each raised to the power of the number of digits. In other words,
 * if we take each digit in the number, raise it to the power of the
 * total count of digits in the number, and then sum them all together,
 * the result is the original number itself.
 *
 * e.g. 371 = 33 + 73 + 13 = 371
 */
public class PrintArmstrong {
    public static void main(String[] args){
        int maxLimit = 20;
        printArmstrongNumbers(maxLimit);
    }

    private static void printArmstrongNumbers(int maxLimit){
        for(int count=0; count<=maxLimit; count++){
            List<Integer> digitList = new ArrayList<>();
            int inputNumber=count;
            int digitCount=0;
            while(inputNumber%10>0 || inputNumber%10==0 && inputNumber>0){
                digitList.add(inputNumber%10);
                digitCount++;
                inputNumber=inputNumber/10;
            }

            int calculatedNumber=0;
            for(int dgCount=0; dgCount<digitList.size(); dgCount++){
                calculatedNumber += Math.pow(digitList.get(dgCount), digitCount);
            }

            System.out.println("Number: " +count+ "\tSum of power of digits: " + calculatedNumber);
        }
    }
}

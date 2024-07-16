package com.practice.programming.personal.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * Write a program to flatten a given array of numbers with nested array of numbers.
 *    The nesting could be upto n levels, where n is not known.
 *    Example -
 *         Input: inputArr=[1, 2, [3, [4, [5, 6]]], 7, [8, [9, [10]]]]
 *         Output: resultArr=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 */
public class FlattenNestedArray {
    public static void main(String[] args){
        // Object[] inputArr = {1, 2, new Object[]{3, new Object[]{4, new Object[]{5, 6}}}};
        Object[] inputArr = {1, 2, new Object[]{3, new Object[]{4, new Object[]{5, 6}}}};
        Integer[] flattenedArr = flatten(inputArr);

        System.out.println("Flattened array: ");
        Arrays.stream(flattenedArr).forEach(arrElem -> System.out.print(arrElem+"\t"));
    }

    private static Integer[] flatten(Object[] inputArr) throws IllegalArgumentException {
        List<Integer> resultList = new ArrayList<>();
        Arrays.stream(inputArr).forEach(elem -> {
            if(elem instanceof Object[]){
                resultList.addAll(Arrays.asList(flatten((Object[]) elem)));
            } else if(elem instanceof Integer){
                resultList.add((Integer)elem);
            } else {
                throw new IllegalArgumentException("Input must be an array of Integers or nested arrays of Integers");
            }
        });
        return resultList.toArray(new Integer[resultList.size()]);
    }
}

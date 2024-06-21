package com.practice.programming.personal.general;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * calculate the average of square of all odd numbers from a list of integers
 */
public class AverageOfOddSquare {
    public static void main(String[] args){
        List<Integer> randomInputList = getRandomListOfIntegers();
        System.out.println("Random input: " + randomInputList);

        double average = getAverageOfSquares(randomInputList);
        System.out.println("Average of square of odd numbers: " + average);
    }

    private static double getAverageOfSquares(List<Integer> inputList){
        int averageOfSquares=0;
        List<Integer> listOddSquares=inputList.stream()
                                            .filter(aNumber->aNumber%2==1)
                                            .map(aNumber -> aNumber*aNumber)
                                            .toList();
        int oddNumberCount=listOddSquares.size();
        averageOfSquares=listOddSquares.stream().reduce(averageOfSquares, Integer::sum);

        return averageOfSquares/oddNumberCount;
    }

    private static List<Integer> getRandomListOfIntegers() {
        List<Integer> listOfRandomIntegers=new ArrayList<>();
        Random random = new Random();

        /* Generating a random integer in range 0 to 99 */
        int inputSize = random.nextInt(100);
        int count=0;

        while(count<=inputSize){
            /* Generating a random integer in range 0 to 100 */
            int randomInt = random.nextInt(101);
            listOfRandomIntegers.add(randomInt);
            count++;
        }
        return listOfRandomIntegers;
    }
}

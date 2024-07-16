package com.practice.programming.personal.arrays;

import java.util.Arrays;

/**
 * Write a program to reverse all the words in a sentence
 */
public class ReverseWords {

    public static void main(String[] args){
        String inputSentence="Write program to reverse all words in a sentence";
        reverseWords(inputSentence);
        reverseCharactersInAllWords(inputSentence);
    }

    /**
     * reverses words and all characters in each word present in input sentence
     * @param input
     */
    private static void reverseCharactersInAllWords(String input){
        String[] arrWords = input.split(" ");

        for(int indexWord=0; indexWord<arrWords.length; indexWord++){
            char[] arrChar=arrWords[indexWord].toCharArray();
            int startIndex=0;
            int endIndex=arrChar.length-1;
            while(startIndex<endIndex){
                char tempChar=arrChar[startIndex];
                arrChar[startIndex]=arrChar[endIndex];
                arrChar[endIndex]=tempChar;
                startIndex++;
                endIndex--;
            }
            arrWords[indexWord]=String.valueOf(arrChar);
        }

        System.out.println(Arrays.toString(arrWords));
    }

    /**
     * reverses all the words present in input sentence
     * @param input
     */
    private static void reverseWords(String input){
        String[] arrWords=input.split(" ");

        int startIndex=0;
        int endIndex=arrWords.length-1;

        while(startIndex<endIndex){
            String tempWord = arrWords[startIndex];
            arrWords[startIndex]=arrWords[endIndex];
            arrWords[endIndex]=tempWord;
            startIndex++;
            endIndex--;
        }

        System.out.println(Arrays.toString(arrWords));
    }
}

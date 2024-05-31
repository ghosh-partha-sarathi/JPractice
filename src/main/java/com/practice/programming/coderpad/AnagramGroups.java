package com.practice.programming.coderpad;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Given an array of strings, write a program to group anagrams together.
 * Example:
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
 * Output: ["ate", "eat", "tea"], ["nat", "tan"], ["bat"]
 */
public class AnagramGroups {
    public static void main(String[] args){
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        printGroupedAnagrams(input);
    }

    private static void printGroupedAnagrams(String... words){
        LinkedList<String> listWords = new LinkedList<>(Arrays.asList(words));
        List<List<String>> groupedList = new ArrayList<>();

        while(listWords.size()>0){
            List<String> anagramGroup = new ArrayList<>();
            String aWord = listWords.get(0);
            anagramGroup.add(aWord);
            listWords.remove(aWord);
            for(int index=0; index<listWords.size(); index++){
                String secondWord = listWords.get(index);
                if(isAnagram(aWord, secondWord)){
                    anagramGroup.add(secondWord);
                    listWords.remove(secondWord);
                }
            }
            groupedList.add(anagramGroup);
        }

        System.out.println(groupedList);
    }

    private static boolean isAnagram(String input1, String input2){
        boolean isAnagram=true;
        char[] arrChars1 = input1.toCharArray();
        for(int index=0; index<arrChars1.length; index++){
            if(input2.indexOf(arrChars1[index])<0) {
                input2.replaceFirst(String.valueOf(arrChars1[index]), "");
                isAnagram=false;
            }
        }
        return isAnagram;
    }
}

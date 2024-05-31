package com.practice.programming.coderpad;

import java.util.*;

/**
 * Write a program to find first non-repeated character from the String
 * Ex:
 * Input : { "array", "apple", "rat"}
 * Output: y,a,r
 *
 * provide an alternate solution without using LinkedHashMap
 */
public class FirstNonRepeatedCharacter {
    public static void main(String[] args){
        String[] input = {"AAAAAAAAAAAAAAAAACCCCCCCCCCCCCCCCCBBBBBBBB",
                          "DDDDDDDEEEEEEEFGGGGGGGGGG"};
        printFirstNonRepeatedChar(input);
        printFirstNonRepeatedCharAlternate(input);
    }

    /**
     * Solution using linkedHashMap
     * @param input input String
     */
    private static void printFirstNonRepeatedChar(String... input){
        Arrays.stream(input).forEach(anInput -> {
            LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<>();
            anInput.chars().mapToObj(anAscii -> (char) anAscii).forEach(aChar -> {
                int charCount = charCountMap.getOrDefault(aChar, 0);
                charCountMap.put(aChar, ++charCount);
            });

            Optional<Map.Entry<Character, Integer>> firstEntryOptional =
                    charCountMap.entrySet().stream().filter(anEntry -> anEntry.getValue()==1).findFirst();
            System.out.println("Input string: " + anInput);
            if(!firstEntryOptional.isEmpty()){
                System.out.println("First non-repeating character: " + firstEntryOptional.get().getKey()+"\n");
            } else {
                System.out.println("No non repeating character found in input string.\n");
            }
        });
    }

    /**
     * alternate solution
     * @param input
     */
    private static void printFirstNonRepeatedCharAlternate(String... input){
        Arrays.stream(input).forEach(anInput -> {
            char[] arrChars = anInput.toCharArray();
            int curIndex=0;
            for(int index=1; index<arrChars.length; index++){
                if(arrChars[curIndex]==arrChars[index]){
                  index=curIndex;
                  curIndex++;
                }
            }
        });
    }
}

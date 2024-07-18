package com.practice.programming.personal.general;

import java.util.*;

public class MapSortingExample {
    private static String sentence = " ";
    public static void main(String[] args){
        String result = getFirstLongestEvenWord(sentence);
        System.out.println("Longest even word in input: " + result +
                           ", Word length: " + result.length());
    }

    private static String getFirstLongestEvenWord(String input){
        String longestFirstWord="00";
        if(null!=input && !input.isEmpty()) {
            String[] arrayInputWords = input.split(" ");
            List<String> evenWordsList = Arrays.asList(arrayInputWords)
                    .stream()
                    .filter(aWord -> aWord.length() % 2 == 0)
                    .toList();

            Map<String, Integer> mapWordSize = new HashMap<>();
            evenWordsList.stream().forEach(aWord -> mapWordSize.put(aWord, aWord.length()));

            List<Map.Entry<String, Integer>> listWordEntries = new LinkedList<>(mapWordSize.entrySet());

            /*
             * Syntax I for sorting a list of entries by values
             */
            listWordEntries.stream().sorted(new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                    return entry1.getValue().compareTo(entry2.getValue());
                }
            });

            /*
             * Syntax II for sorting a list of entries by values
             */
//        listWordEntries.stream().sorted(new Comparator<>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
//                return entry1.getValue().compareTo(entry2.getValue());
//            }
//        });

            /*
             * Syntax III for sorting a list of entries by values
             */
            // listWordEntries.stream().sorted((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()));

            /*
             * Syntax IV for sorting a list of entries by values
             */
            // listWordEntries.stream().sorted(Comparator.comparing(Map.Entry::getValue));

            /*
             * Syntax V for sorting a list of entries by values
             */
            // listWordEntries.stream().sorted(Map.Entry.comparingByValue());

            if (listWordEntries.size() > 0) {
                longestFirstWord = listWordEntries.get(0).getKey();
            }
        }

        return longestFirstWord;
    }
}

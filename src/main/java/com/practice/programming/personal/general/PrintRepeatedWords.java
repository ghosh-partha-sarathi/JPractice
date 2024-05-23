package com.practice.programming.personal.general;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Question : Print the first top 5 & top 10 repeated words in descending order from the given paragraph.
 * <p>
 * Sample input:
 * Output:
 */
public class PrintRepeatedWords {
    private static final String input = "caught Sunset is the time of day when our sky meets the outer space solar " +
            "winds. There are blue, pink, and purple swirls, spinning and twisting, " +
            "like clouds of balloons caught in a whirlwind. The sun moves slowly to " +
            "hide behind the line of horizon, while the moon races to take its place " +
            "in prominence atop the night sky. People slow to a crawl, entranced, " +
            "fully forgetting the deeds that must still be done. There is a coolness, " +
            "a calmness, when the sun does set.";

    public static void main(String[] args) {
        // String[] arrWords = input.splitWithDelimiters(" ", 2);
        String[] arrWords = input.split("[., ]+");
        // Arrays.stream(arrWords).forEach(word -> System.out.println(word));

        /*
        Scanner scanner = new Scanner(input);
        scanner.tokens().forEach(System.out::println);

        List<String> wordList = new ArrayList<>();
        while(scanner.hasNext()){
            wordList.add(scanner.next());
        }
        String[] arrWords = wordList.stream().toArray(String[]::new);
        Arrays.stream(arrWords).forEachOrdered(System.out::println);
         */

        Map<String, Integer> wordMap = new HashMap<>();
        Arrays.stream(arrWords).forEach(word -> {
            int wordCount = wordMap.getOrDefault(word, 0);
            if (wordCount == 0) {
                wordMap.put(word, 1);
            } else if (wordCount > 0) {
                wordMap.put(word, ++wordCount);
            }
        });
        // System.out.println(wordMap);
        sortMapByValues(wordMap);
    }

    public static void sortMapByValues(Map<String, Integer> inputMap) {
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>();
        inputMap.entrySet().forEach(entryList::add);
        // System.out.println(entryList);
        List<Map.Entry<String, Integer>> sortedList = entryList.stream().sorted(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry2.getValue().compareTo(entry1.getValue());
            }
        }).collect(Collectors.toList());
        // System.out.println(sortedList);

        for (int count = 0; count <= 5; count++) {
            System.out.println(sortedList.get(count));
        }
    }
}

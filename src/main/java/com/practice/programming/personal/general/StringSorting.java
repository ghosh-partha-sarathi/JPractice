package com.practice.programming.personal.general;

import java.util.ArrayList;
import java.util.Comparator;

import java.util.List;

public class StringSorting {
    public static void main(String[] args) {
        List<String> inputList = getInputList();
        Comparator<String> stringComparator = (str1, str2) -> (str1.length() > (str2.length())) ? 1 : -1;
        List<String> sortedList = inputList.stream().sorted(stringComparator).toList();

//        List<String> sortedList = inputList.stream().sorted(new Comparator<String>() {
//            public int compare(String str1, String str2) {
//                return (str1.length()>(str2.length()))?1:-1;
//            }
//        }).toList();

        System.out.println(sortedList);
    }

    private static List<String> getInputList() {
        List<String> arrList = new ArrayList<>();
        arrList.add("Delhi");
        arrList.add("Kolkata");
        arrList.add("Ahmedabad");
        arrList.add("Jamshedpur");
        arrList.add("Bangalore");
        arrList.add("Mumbai");
        arrList.add("Pune");
        return arrList;
    }
}

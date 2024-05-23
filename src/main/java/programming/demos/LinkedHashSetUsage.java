package programming.demos;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSetUsage {
    public static void main(String[] args) {
        String input = "ELEPHANT";
        LinkedHashSet linkedSet = new LinkedHashSet();
        char[] inputArr = input.toCharArray();
//        for(char aChar:inputArr){
//            linkedSet.add(aChar);
//        }
//
//        linkedSet.stream().forEach(System.out::print);

        input.chars().mapToObj(aChar -> (char) aChar).forEach(linkedSet::add);
        linkedSet.stream().forEach(System.out::print);
    }
}

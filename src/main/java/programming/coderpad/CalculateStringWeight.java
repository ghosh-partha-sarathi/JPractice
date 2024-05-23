package programming.coderpad;

import java.util.HashMap;
import java.util.Map;

/**
 * "4. Find the weight of given String.
 * (A-Z/a-z) we have 26 alphabetic, consider the position of a-z alphabets as 1-26.
 * Based on that find the weight of the given String.
 * Ex:
 * Given String: Apple
 * Output: 1+16+16+12+5 = 50"
 */
public class CalculateStringWeight {
    private static final String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        doTestsPass();
    }

    public static boolean doTestsPass() {
        String input = "Apple";
        boolean testsPassed = true;
        testsPassed &= calculateStringWeight(input) == 50;

        input = "Banana";
        testsPassed &= calculateStringWeight(input) == 33;

        if (testsPassed) {
            System.out.println("String panagram check tests passes");
        } else {
            System.out.println("Tests failed");
        }
        return testsPassed;
    }

    static int calculateStringWeight(String input) {
        char[] arrAlphabets = alphabets.toCharArray();
        Map<Character, Integer> mapAlphabets = new HashMap<>();
        for (int index = 0; index < arrAlphabets.length; index++) {
            mapAlphabets.put(arrAlphabets[index], index + 1);
        }

        input = input.toUpperCase();
        char[] arrInput = input.toCharArray();
        int weight = 0;
        for (int index = 0; index < arrInput.length; index++) {
            weight += mapAlphabets.get(arrInput[index]);
        }
        System.out.println("Input: " + input + "\tWeight calculated: " + weight);
        return weight;
    }
}

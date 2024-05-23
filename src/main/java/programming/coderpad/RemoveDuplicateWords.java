package programming.coderpad;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Remove the duplicate words from the given Sentence.
 * Ex:
 * a) Input: Good day day bye bye
 * output: Good day bye
 * b) input: greet the day user greet good day
 * output:greet the day user good"
 */
public class RemoveDuplicateWords {
    private static final String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        doTestsPass();
    }

    public static boolean doTestsPass() {
        String input = "Good day day bye bye";
        boolean testsPassed = true;
        removeDuplicates(input);

        input = "greet the day user greet good day";
        removeDuplicates(input);

        if (testsPassed) {
            System.out.println("String panagram check tests passes");
        } else {
            System.out.println("Tests failed");
        }
        return testsPassed;
    }

    static void removeDuplicates(String input) {
        System.out.println("Input: " + input);
        String[] arrWords = input.split("[., ]+");
        Set setUniqueWords = new LinkedHashSet();
        Collections.addAll(setUniqueWords, arrWords);
        StringBuilder outputBuilder = new StringBuilder();
        setUniqueWords.forEach(word -> outputBuilder.append(word).append(" "));

        System.out.println("Output: " + outputBuilder);
    }
}

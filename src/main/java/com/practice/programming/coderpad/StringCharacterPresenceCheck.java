package com.practice.programming.coderpad;

/**
 * Write the Java code to, the method should accept two strings and return Boolean,
 * second string should contain only the chars present in 1st string
 * e.g.: str1="GET",  valid strings are "TTTTTTT", "TEGGG", invalid strings: "ABCG"
 */
public class StringCharacterPresenceCheck {
    public static void main(String[] args) {
        doTestsPass();
    }

    public static boolean doTestsPass() {
        String input1 = "GET";
        String input2 = "TEGGG";
        boolean testsPassed = true;
        testsPassed &= checkIfCharacterPresent(input1, input2);

        input1 = "GET";
        input2 = "TAG";
        testsPassed &= !checkIfCharacterPresent(input1, input2);

        if (testsPassed) {
            System.out.println("Charater presence check in string tests passes");
        } else {
            System.out.println("Tests failed");
        }
        return testsPassed;
    }

    static boolean checkIfCharacterPresent(String str1, String str2) {
        boolean isCharacterPresent = true;
        char[] charArr2 = str2.toCharArray();
        for (int index = 0; index < charArr2.length; index++) {
            if (str1.indexOf(charArr2[index]) < 0)
                isCharacterPresent = false;
        }
        return isCharacterPresent;
    }
}

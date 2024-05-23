package programming.coderpad;

/**
 * Write the method which accepts the two strings,
 * 2nd string should be the upper /lower case of 1st string return boolean.
 * e.g. str1:"aPPLE" str2:"Apple"
 */
public class StringReverseCaseCheck {
    public static void main(String[] args) {
        doTestsPass();
    }

    public static boolean doTestsPass() {
        String input1 = "Elephant";
        String input2 = "eLEPHANT";
        boolean testsPassed = true;
        testsPassed &= checkIfCharacterCaseReversed(input1, input2);

        input1 = "TraIn";
        input2 = "tRAIN";
        testsPassed &= !checkIfCharacterCaseReversed(input1, input2);

        if (testsPassed) {
            System.out.println("Charater case reversal check tests passes");
        } else {
            System.out.println("Tests failed");
        }
        return testsPassed;
    }

    static boolean checkIfCharacterCaseReversed(String str1, String str2) {
        boolean isCharacterCaseReversed = true;
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();
        for (int index = 0; index < charArr1.length; index++) {
            char char1 = charArr1[index];
            char char2 = charArr2[index];
            if (Character.isUpperCase(char1) && Character.toLowerCase(char1) != char2 || Character.isLowerCase(char1) && Character.toUpperCase(char1) != char2) {
                isCharacterCaseReversed = false;
                break;
            }
        }
        return isCharacterCaseReversed;
    }
}

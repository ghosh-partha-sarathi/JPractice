package programming.coderpad;

/**
 * Write the method which accepts the two strings,
 * 2nd string should be the reverse of 1st string then return boolean
 * e.g.
 */
public class ReverseStringCheck {
    public static void main(String[] args) {
        doTestsPass();
    }

    public static boolean doTestsPass() {
        String input1 = "APPLE";
        String input2 = "ELPPA";
        boolean testsPassed = true;
        testsPassed &= checkIfReverseString(input1, input2);

        input1 = "CRICKET";
        input2 = "TEKCICR";
        testsPassed &= !checkIfReverseString(input1, input2);

        if (testsPassed) {
            System.out.println("Reverse string check tests passes");
        } else {
            System.out.println("Tests failed");
        }
        return testsPassed;
    }

    static boolean checkIfReverseString(String str1, String str2) {
        boolean isReverseString = true;
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();
        int str2Length = charArr2.length - 1;
        for (int index = 0; index < charArr1.length; index++) {
            if (charArr1[index] != charArr2[str2Length - index]) {
                isReverseString = false;
                break;
            }
        }
        return isReverseString;
    }
}

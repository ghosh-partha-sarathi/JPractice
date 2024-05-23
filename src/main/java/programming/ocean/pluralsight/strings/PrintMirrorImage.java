package programming.ocean.pluralsight.strings;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Create a class containing a method to create the mirror image of a String. The method
 * should return the two Strings separated with a pipe(|) symbol
 */
public class PrintMirrorImage {
    private static final int input = 10;

    public static void main(String... a) {
        PrintMirrorImage printMirrorImageObj = new PrintMirrorImage();
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Please enter a string");
        try {
            input = scanner.next();
        } catch (InputMismatchException exp) {
            System.out.println("Invalid input");
        }
    }
}

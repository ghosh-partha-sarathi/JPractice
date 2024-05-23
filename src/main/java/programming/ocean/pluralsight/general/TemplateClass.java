package programming.ocean.pluralsight.general;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 */
public class TemplateClass {
    private static final int input = 10;

    public static void main(String... a) {
        TemplateClass templateClassObj = new TemplateClass();
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        System.out.println("Please enter a number");
        try {
            input = scanner.nextInt();
        } catch (InputMismatchException exp) {
            System.out.println("Invalid input");
        }
    }
}

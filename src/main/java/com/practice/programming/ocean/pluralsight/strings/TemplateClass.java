package com.practice.programming.ocean.pluralsight.strings;

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
        String input;
        System.out.println("Please enter a string");
        try {
            input = scanner.next();
        } catch (InputMismatchException exp) {
            System.out.println("Invalid input");
        }
    }
}

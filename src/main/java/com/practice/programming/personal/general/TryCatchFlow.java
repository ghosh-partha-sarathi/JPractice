package com.practice.programming.personal.general;

public class TryCatchFlow {
    public static void main(String... args) {
        System.out.println(tryCatchFlow());
    }

    private static int tryCatchFlow() {
        try {
            return 1;
        } catch (Exception exp) {
            return 2;
        } finally {
            return 3;
        }
    }
}

package com.practice.programming.coderpad;

public class FindFibbonacci {
    public static void main(String... args) {
        int input = 11;
        int fibValue = findFibbonacci(input);
        System.out.println("Fibbonacci value: " + fibValue);
    }

    static int findFibbonacci(int n) {
        int fibVal = 0;
        if (n <= 0) return 0;
        if (n == 1 || n == 2) {
            fibVal = 1;
        } else {
            fibVal = findFibbonacci(n - 1) + findFibbonacci(n - 2);
        }
        return fibVal;
    }
}

package com.practice.programming.coderpad;

import java.util.Stack;

public class ExpressionValidator {
    public static void main(String[] args){
        boolean testsPassed = true;

        testsPassed &= validateExpression("()") == true;
        testsPassed &= validateExpression("(){}[]") == true;
        testsPassed &= validateExpression("({[]})") == true;
        testsPassed &= validateExpression("{[()]}") == true;
        testsPassed &= validateExpression("{[()]}(())") == true;
        testsPassed &= validateExpression("{[(])}") == false;
        testsPassed &= validateExpression("") == false;
        testsPassed &= validateExpression(null) == false;

        if(testsPassed){
            System.out.println("All tests PASSED.");
        } else {
            System.out.println("Test/tests FAILED.");
        }
    }

    private static boolean validateExpression(String inputExp){
        boolean isExpressionValid=true;
        if(inputExp==null || inputExp.isEmpty()) return false;
        char[] arrChars = inputExp.toCharArray();
        Stack<Character> stackCharacters = new Stack<>();
        for(char aChar : arrChars){
            if(aChar=='('||aChar=='{'||aChar=='['){
                stackCharacters.push(aChar);
            } else {
                if(stackCharacters.empty()) return false;
                char topCharacter=stackCharacters.pop();
                if(aChar==')' && topCharacter!='(' ||
                        aChar=='}' && topCharacter!='{' ||
                        aChar==']' && topCharacter!='['
                ) {
                    isExpressionValid=false;
                    break;
                }
            }
        }
        if(!stackCharacters.empty())
            isExpressionValid=false;
        return isExpressionValid;
    }
}

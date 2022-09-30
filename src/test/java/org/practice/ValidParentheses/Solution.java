package org.practice.ValidParentheses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> characterStack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (characterStack.isEmpty() && (s.charAt(i) == ']' || s.charAt(i) == '}' || s.charAt(i) == ')'))
                return false;
            else {
                if (characterStack.isEmpty()) {
                    characterStack.add(s.charAt(i));
                } else {
                    if (characterStack.peek() == '(' && s.charAt(i) == ')') {
                        characterStack.pop();
                    } else if (characterStack.peek() == '{' && s.charAt(i) == '}') {
                        characterStack.pop();
                    } else if (characterStack.peek() == '[' && s.charAt(i) == ']') {
                        characterStack.pop();
                    } else {
                        characterStack.add(s.charAt(i));
                    }
                }
            }
        }
        return characterStack.isEmpty();
    }

    @Test
    public void testIsValid() {
        Assertions.assertTrue(isValid("()"));
        Assertions.assertTrue(isValid("(){}[]"));
        Assertions.assertFalse(isValid("(]"));
        Assertions.assertFalse(isValid("({[)"));
    }
}

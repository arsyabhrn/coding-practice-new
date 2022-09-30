package org.practice.ValidPalindrome;

// https://leetcode.com/problems/valid-palindrome/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//        Given a string s, return true if it is a palindrome, or false otherwise.
//
//
//
//        Example 1:
//
//        Input: s = "A man, a plan, a canal: Panama"
//        Output: true
//        Explanation: "amanaplanacanalpanama" is a palindrome.
//        Example 2:
//
//        Input: s = "race a car"
//        Output: false
//        Explanation: "raceacar" is not a palindrome.
//        Example 3:
//
//        Input: s = " "
//        Output: true
//        Explanation: s is an empty string "" after removing non-alphanumeric characters.
//        Since an empty string reads the same forward and backward, it is a palindrome.
//
//
//        Constraints:
//
//        1 <= s.length <= 2 * 105
//        s consists only of printable ASCII characters.
public class Solution {
    public boolean isPalindrome(String s) {

        int beginningIndex = 0;
        int lastIndex = s.length() - 1;
        while (beginningIndex < lastIndex) {

            Character beginningChar = s.charAt(beginningIndex);
            Character lastChar = s.charAt(lastIndex);

            if (!Character.isLetterOrDigit(beginningChar)) {
                beginningIndex++;
                continue;
            }

            if (!Character.isLetterOrDigit(lastChar)) {
                lastIndex--;
                continue;
            }

            if (Character.toLowerCase(beginningChar) != Character.toLowerCase(lastChar)) {
                return false;
            }

            beginningIndex++;
            lastIndex--;
        }

        return true;
    }

    @Test
    public void testValidPalindrome() {
        Assertions.assertTrue(isPalindrome("A man, a plan, a canal: Panama"));
        Assertions.assertFalse(isPalindrome("race a car"));
        Assertions.assertTrue(isPalindrome(""));
    }
}

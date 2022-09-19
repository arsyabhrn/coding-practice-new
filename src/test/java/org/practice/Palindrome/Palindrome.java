package org.practice.Palindrome;

//Given an integer x, return true if x is palindrome integer.
//
//        An integer is a palindrome when it reads the same backward as forward.
//
//        For example, 121 is a palindrome while 123 is not.

public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        long newValue = x;
        long div = 1;
        while (newValue >= 10 * div) {
            div *= 10;
        }

        while (newValue > 0) {
            long right = newValue % 10;
            long left = newValue / div;

            if (left != right) return false;

            newValue =(newValue % div) / 10;
            div /= 100;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();

        System.out.println(palindrome.isPalindrome(
                1410110141));
    }
}

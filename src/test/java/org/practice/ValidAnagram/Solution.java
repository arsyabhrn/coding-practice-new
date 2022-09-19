package org.practice.ValidAnagram;

//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//
//
//
//        Example 1:
//
//        Input: s = "anagram", t = "nagaram"
//        Output: true
//        Example 2:
//
//        Input: s = "rat", t = "car"
//        Output: false
//
//
//        Constraints:
//
//        1 <= s.length, t.length <= 5 * 104
//        s and t consist of lowercase English letters.

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        if (s.equals(t)) return true;

        int[] countChar = new int[26];
        for (int i = 0; i < s.length(); i++ ) {
            countChar[s.charAt(i)-'a']++;
            countChar[t.charAt(i)-'a']--;
        }

        for (int character :countChar){
            if (character != 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        String string = "anagram";
        System.out.println(string.length());
        int[] nums = new int[26];
        System.out.println(string.charAt(1)-'a');
        nums[string.charAt(1)-'a']++;
        for (int num : nums) {
            System.out.println(num);
        }
    }
}

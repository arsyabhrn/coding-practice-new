package org.practice.ContainsDuplicate;

// https://leetcode.com/problems/contains-duplicate/
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
//
//
//        Example 1:
//
//        Input: nums = [1,2,3,1]
//        Output: true
//        Example 2:
//
//        Input: nums = [1,2,3,4]
//        Output: false
//        Example 3:
//
//        Input: nums = [1,1,1,3,3,4,3,2,4,2]
//        Output: true
//
//
//        Constraints:
//
//        1 <= nums.length <= 105
//        -109 <= nums[i] <= 109

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> number = new HashSet<>();
        for (int num : nums) {
            if (number.contains(num)) return true;
            number.add(num);
        }
        return false;
    }

    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    @Test
    public void testContainsDuplicate() {
        Assertions.assertTrue(containsDuplicate(new int[]{1,2,3,4,5,1}));
    }
}

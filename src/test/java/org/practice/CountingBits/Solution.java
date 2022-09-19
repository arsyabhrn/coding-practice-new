package org.practice.CountingBits;

//https://leetcode.com/problems/counting-bits/
//Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
//
//
//
//Example 1:
//
//Input: n = 2
//Output: [0,1,1]
//Explanation:
//0 --> 0
//1 --> 1
//2 --> 10
//Example 2:
//
//Input: n = 5
//Output: [0,1,1,2,1,2]
//Explanation:
//0 --> 0
//1 --> 1
//2 --> 10
//3 --> 11
//4 --> 100
//5 --> 101
//
//
//Constraints:
//
//0 <= n <= 105

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        int offset = 1;

        for (int i = 1; i <= n;i++) {
            if (2 * offset == i) {
                offset = i;
            }
            dp[i] = 1 + dp[i - offset];
        }
        return dp;
    }

    @Test
    void test() {
        Assertions.assertArrayEquals(new int[]{0,1,1}, countBits(2));
    }
}

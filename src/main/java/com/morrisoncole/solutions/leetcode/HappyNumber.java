package com.morrisoncole.solutions.leetcode;

import java.util.HashSet;

/**
 * A happy number is a number defined by the following process:
 * Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the
 * process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy numbers.
 */
public class HappyNumber {
    private static final HashSet<Integer> seen = new HashSet<>();

    public boolean isHappy(int n) {
        while (!seen.contains(n) && n != 1) {
            seen.add(n);
            n = sumDigits(n);
        }

        return n == 1;
    }

    private int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int current = n % 10;
            sum += Math.pow(current, 2);
            n /= 10;
        }
        return sum;
    }
}

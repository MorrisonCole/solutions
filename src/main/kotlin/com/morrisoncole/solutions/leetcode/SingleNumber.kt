package com.morrisoncole.solutions.leetcode

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
fun singleNumber(nums: IntArray): Int = nums.fold(0) { accumulator, num -> accumulator xor num }

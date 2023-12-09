package com.morrisoncole.solutions.leetcode

fun removeElement(nums: IntArray, `val`: Int): Int {
    var left = 0
    var right = nums.size

    while (left < right) {
        if (nums[left] == `val`) {
            nums[left] = nums[right - 1]
            right--
        } else {
            left++
        }
    }

    return left
}
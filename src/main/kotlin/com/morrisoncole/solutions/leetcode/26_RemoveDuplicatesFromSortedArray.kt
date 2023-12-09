package com.morrisoncole.solutions.leetcode

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) {
        return 0
    }

    var i = 0
    for (j in 1 until nums.size) {
        if (nums[i] != nums[j]) {
            i++
            nums[i] = nums[j]
        }
    }

    return i + 1
}

package com.morrisoncole.solutions.leetcode

fun subarraySum(nums: IntArray, k: Int): Int {
    val prefixCounts = mutableMapOf<Int, Int>()
    prefixCounts[0] = 1

    var current = 0
    var result = 0

    nums.forEach {
        current += it
        result += prefixCounts.getOrDefault(current - k, 0)
        prefixCounts[current] = prefixCounts.getOrDefault(current, 0) + 1
    }

    return result
}

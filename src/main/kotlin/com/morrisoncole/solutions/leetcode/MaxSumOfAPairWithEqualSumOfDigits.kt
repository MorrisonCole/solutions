package com.morrisoncole.solutions.leetcode

import kotlin.math.max

fun maximumSum(nums: IntArray): Int {
    val map = mutableMapOf<Int, Int>()
    var max = -1

    for (num in nums) {
        val digitSum = digitSum(num)
        if (map.contains(digitSum)) {
            max = max(max, num + map[digitSum]!!)
        }
        map[digitSum] = max(map.getOrDefault(digitSum, 0), num)
    }

    return max
}

fun digitSum(int: Int): Int {
    var result = 0
    var remainder = int
    while (remainder != 0) {
        result += remainder % 10
        remainder /= 10
    }
    return result
}

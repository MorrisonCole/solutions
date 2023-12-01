package com.morrisoncole.solutions.leetcode

fun missingNumber(nums: IntArray): Int {
    val notSeen = (0..nums.lastIndex).toMutableSet()

    nums.forEach {
        notSeen.remove(it)
    }

    return notSeen.first()
}

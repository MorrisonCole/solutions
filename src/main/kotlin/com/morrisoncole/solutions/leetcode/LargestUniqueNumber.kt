package com.morrisoncole.solutions.leetcode

import kotlin.math.max

fun largestUniqueNumber(nums: IntArray): Int {
    val seen = mutableMapOf<Int, Int>()

    for (num in nums) {
        seen[num] = seen.getOrDefault(num, 0) + 1
    }

    var maxSeen = -1
    seen.forEach { (num, timesSeen) ->
        if (timesSeen == 1) {
            maxSeen = max(num, maxSeen)
        }
    }

    return maxSeen
}
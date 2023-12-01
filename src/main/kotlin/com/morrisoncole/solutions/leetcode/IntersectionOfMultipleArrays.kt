package com.morrisoncole.solutions.leetcode

fun intersection(nums: Array<IntArray>): List<Int> {
    val counts = mutableMapOf<Int, Int>()
    val presentInAll = mutableListOf<Int>()

    nums.forEach { array ->
        array.forEach { digit ->
            counts[digit] = counts.getOrDefault(digit, 0) + 1

            if (counts[digit] == nums.size) {
                presentInAll.add(digit)
            }
        }
    }

    return presentInAll.sorted()
}

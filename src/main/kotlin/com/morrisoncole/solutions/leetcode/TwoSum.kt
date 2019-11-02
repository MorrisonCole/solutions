package com.morrisoncole.solutions.leetcode

import java.lang.UnsupportedOperationException

fun twoSum(numbers: IntArray, target: Int): IntArray {
    val wantedPair: MutableMap<Int, Int> = HashMap()
    numbers.forEachIndexed { i, it ->
        if (wantedPair.contains(it)) {
            return intArrayOf(i, wantedPair[it]!!)
        } else {
            wantedPair[target - it] = i
        }
    }

    throw UnsupportedOperationException("Bad algorithm or input didn't match specification.")
}

package com.morrisoncole.solutions.leetcode

fun twoSum(nums: IntArray, target: Int): IntArray {
    // when we see each element, store value to map value->indice
    // check target - current value (is pair in map?), return indices
    val seenNums = mutableMapOf<Int, Int>()
    nums.forEachIndexed { i, it ->
        seenNums[target - it]?.let { previous -> return intArrayOf(previous, i)}
        seenNums[it] = i
    }

    throw Exception("Didn't find any pair")
}

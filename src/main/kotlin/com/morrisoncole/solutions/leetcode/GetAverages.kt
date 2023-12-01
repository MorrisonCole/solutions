package com.morrisoncole.solutions.leetcode

import java.math.BigInteger

fun getAverages(nums: IntArray, k: Int): IntArray {
    val spanWidth = (k * 2) + 1
    if (nums.size < spanWidth) {
        return IntArray(nums.size) { -1 }
    }

    val output = Array<BigInteger>(size = nums.size) { BigInteger.ZERO }
    output[0] = nums[0].toBigInteger()

    // Build a prefix sum
    for (i in 1..nums.lastIndex) {
        output[i] = output[i - 1] + nums[i].toBigInteger()
    }

    for (i in k..(nums.lastIndex - k)) {
        val left = i - k
        val right = i + k

        output[i] = (output[right] - output[left] + nums[left].toBigInteger()) / spanWidth.toBigInteger()
    }

    val finalOutput = output.map { it.toInt() }.toIntArray()
    for (i in 0..<k) {
        finalOutput[i] = -1
    }
    for (i in (nums.lastIndex - k + 1)..nums.lastIndex) {
        finalOutput[i] = -1
    }

    return finalOutput
}

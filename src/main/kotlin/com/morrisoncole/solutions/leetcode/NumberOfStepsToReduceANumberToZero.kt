package com.morrisoncole.solutions.leetcode

fun numberOfSteps(num: Int): Int {
    val binary = Integer.toBinaryString(num)

    return binary.fold(-1) { acc, next ->
        if (next == '1') {
            acc + 2
        } else {
            acc + 1
        }
    }
}

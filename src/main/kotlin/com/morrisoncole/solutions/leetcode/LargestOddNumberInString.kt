package com.morrisoncole.solutions.leetcode

fun largestOddNumber(num: String): String {
    for (i in num.lastIndex downTo 0) {
        if (num[i].code % 2 != 0) {
            return num.substring(0, i + 1)
        }
    }

    return ""
}
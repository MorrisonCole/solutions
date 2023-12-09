package com.morrisoncole.solutions.leetcode

fun myAtoi(str: String): Int {
    if (str.isBlank()) return 0

    var start = 0
    while (str[start].isWhitespace()) {
        start++
    }

    var modifier = 1
    if (str[start] == '-') {
        modifier = -1
        start++
    } else if (str[start] == '+') {
        modifier = 1
        start++
    } else if (!str[start].isDigit()) {
        return 0
    }

    var end = 0
    for (i in start until str.length) {
        if (!str[i].isDigit()) break
        end = i
    }

    var sum = 0
    for (i in start..end) {
        val digit = Character.getNumericValue(str[i])
        if (sum > Int.MAX_VALUE / 10 || sum == Int.MAX_VALUE / 10 && digit > 7) {
            return if (modifier > 0) Int.MAX_VALUE else Int.MIN_VALUE
        }

        sum = sum * 10 + digit
    }

    return sum * modifier
}

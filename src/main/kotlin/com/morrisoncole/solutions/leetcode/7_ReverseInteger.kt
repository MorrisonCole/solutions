package com.morrisoncole.solutions.leetcode

fun reverse(x: Int): Int {
    val sign = if (x < 0) -1 else 1
    val absX = if (x < 0) -x else x

    val array = absX.toString().toCharArray()
    for (i in 0 until array.size / 2) {
        val temp = array[i]
        array[i] = array[array.size - 1 - i]
        array[array.size - 1 - i] = temp
    }
    return try {
        String(array).toInt() * sign
    } catch (e: NumberFormatException) {
        0
    }
}

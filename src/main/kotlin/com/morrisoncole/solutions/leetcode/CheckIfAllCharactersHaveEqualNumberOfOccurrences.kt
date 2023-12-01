package com.morrisoncole.solutions.leetcode

fun areOccurrencesEqual(s: String): Boolean {
    val counts = mutableMapOf<Char, Int>()

    s.forEach {
        counts[it] = counts.getOrDefault(it, 0) + 1
    }

    val frequencies = counts.values.toSet()
    return frequencies.size == 1
}
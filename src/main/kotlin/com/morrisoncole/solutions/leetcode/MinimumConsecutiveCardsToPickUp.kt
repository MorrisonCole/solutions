package com.morrisoncole.solutions.leetcode

import kotlin.math.min

fun minimumCardPickup(cards: IntArray): Int {
    val map = mutableMapOf<Int, Int>()

    var minDistance = Int.MAX_VALUE
    for (i in 0..cards.lastIndex) {
        val card = cards[i]
        if (map.contains(card)) {
            minDistance = min(minDistance, i - map[card]!! + 1)
        }

        map[card] = i
    }

    return if (minDistance == Int.MAX_VALUE) -1 else minDistance
}
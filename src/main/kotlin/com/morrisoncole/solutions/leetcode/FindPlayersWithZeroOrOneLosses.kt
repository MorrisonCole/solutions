package com.morrisoncole.solutions.leetcode

import kotlin.math.max

// O(n + k) time, where k is the highest player number.
// O(k) space, where k is the highest player number.
fun findWinners(matches: Array<IntArray>): List<List<Int>> {
    val losses = IntArray(100001) { -1 }
    var highestPlayer = 0

    for ((winner, loser) in matches) {
        if (losses[winner] == -1) {
            losses[winner] = 0
        }

        if (losses[loser] == -1) {
            losses[loser] = 1
        } else {
            losses[loser]++
        }

        highestPlayer = max(highestPlayer, max(winner, loser))
    }

    val neverLost = mutableListOf<Int>()
    val lostExactlyOnce = mutableListOf<Int>()
    for (i in 0..highestPlayer) {
        if (losses[i] == 0) {
            neverLost.add(i)
        } else if (losses[i] == 1) {
            lostExactlyOnce.add(i)
        }
    }

    return listOf(neverLost, lostExactlyOnce)
}

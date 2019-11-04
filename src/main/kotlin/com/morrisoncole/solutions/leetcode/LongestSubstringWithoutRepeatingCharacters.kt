package com.morrisoncole.solutions.leetcode

/**
 * Time: O(n), where n = string.length
 */
fun lengthOfLongestSubstring(string: String): Int {
    var longest = 0

    val slidingWindow = hashMapOf<Char, Int>()
    var backIndex = 0
    var frontIndex = 0

    while (frontIndex < string.length) {
        val frontCharacter = string[frontIndex]

        if (slidingWindow.containsKey(frontCharacter)) {
            backIndex = backIndex.coerceAtLeast(slidingWindow[frontCharacter]!!)
        }

        longest = longest.coerceAtLeast(frontIndex - backIndex + 1)
        frontIndex++
        slidingWindow[frontCharacter] = frontIndex
    }

    return longest
}

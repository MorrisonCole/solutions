package com.morrisoncole.solutions.leetcode

/*
    Runtime: O(m) - since
    Storage: O(k) - some characters may be duplicated, so not O(m)
*/
fun canConstruct(ransomNote: String, magazine: String): Boolean {
    if (ransomNote.length > magazine.length) {
        return false
    }

    val map = mutableMapOf<Char, Int>()
    magazine.forEach {
        val count = map[it] ?: 0
        map[it] = count + 1
    }

    ransomNote.forEach {
        val remainingCount = map[it] ?: 0
        if (remainingCount == 0) {
            return false
        }

        map[it] = remainingCount - 1
    }

    return true
}
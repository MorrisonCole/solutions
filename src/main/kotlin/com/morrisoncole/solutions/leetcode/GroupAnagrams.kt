package com.morrisoncole.solutions.leetcode

/**
 * O(n⋅m⋅log(m)) time, where n is the length of strs & m is the average length of the strings
 * O(n⋅m) space, (every string is stored in a list within the map)
 */
fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val sortedStrToStrings = mutableMapOf<String, List<String>>()

    for (string in strs) {
        val sorted = string.toCharArray().sorted().toString()
        sortedStrToStrings[sorted] = sortedStrToStrings.getOrDefault(sorted, emptyList()) + string
    }

    return sortedStrToStrings.values.toList()
}
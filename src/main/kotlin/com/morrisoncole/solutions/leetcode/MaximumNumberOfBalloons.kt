package com.morrisoncole.solutions.leetcode

fun maxNumberOfBalloons(text: String): Int {
    val characterCounts = mutableMapOf('b' to 0, 'a' to 0, 'l' to 0, 'o' to 0, 'n' to 0)

    for (char in text) {
        if (characterCounts.contains(char)) {
            characterCounts[char] = characterCounts.getOrDefault(char, 0) + 1
        }
    }

    characterCounts['l'] = characterCounts.getOrDefault('l', 0) / 2
    characterCounts['o'] = characterCounts.getOrDefault('o', 0) / 2

    return characterCounts.values.min()
}
package com.morrisoncole.solutions.leetcode

import com.google.common.truth.Truth.assertThat

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import java.util.Arrays
import java.util.stream.Stream

internal class LongestSubstringWithoutRepeatingCharactersKtTest {

    @ParameterizedTest
    @MethodSource("expectations")
    fun lengthOfLongestSubstring(expectation: Expectation) {
        val actual = lengthOfLongestSubstring(expectation.input)

        assertThat(actual).isEqualTo(expectation.expected)
    }

    private companion object {
        @JvmStatic
        @Suppress("Unused")
        fun expectations(): Stream<Expectation> =
            Arrays.stream(arrayOf(
                Expectation("abcabcbb", 3),
                Expectation("bbbbb", 1),
                Expectation("pwwkew", 3),
                Expectation("abba", 2),
                Expectation("tmmzuxt", 5)
            ))
    }

    data class Expectation(
        val input: String,
        val expected: Int
    )
}

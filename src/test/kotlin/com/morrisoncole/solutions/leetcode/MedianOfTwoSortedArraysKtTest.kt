package com.morrisoncole.solutions.leetcode

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import java.util.*
import java.util.stream.Stream

internal class MedianOfTwoSortedArraysKtTest {

    @ParameterizedTest
    @MethodSource("expectations")
    fun `finds median value of two sorted Int arrays`(expectation: Expectation) {
        val actual = findMedianSortedArrays(expectation.a, expectation.b)

        assertThat(actual).isEqualTo(expectation.expected)
    }

    companion object {
        @JvmStatic
        @Suppress("unused")
        fun expectations(): Stream<Expectation> = Arrays.stream(arrayOf(
            Expectation(intArrayOf(1, 3), intArrayOf(2), 2.0),
            Expectation(intArrayOf(1, 2), intArrayOf(3, 4), 2.5)
        ))
    }

    data class Expectation(
        val a: IntArray,
        val b: IntArray,
        val expected: Double
    ) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Expectation

            if (!a.contentEquals(other.a)) return false
            if (!b.contentEquals(other.b)) return false
            if (expected != other.expected) return false

            return true
        }

        override fun hashCode(): Int {
            var result = a.contentHashCode()
            result = 31 * result + b.contentHashCode()
            result = 31 * result + expected.hashCode()
            return result
        }
    }
}

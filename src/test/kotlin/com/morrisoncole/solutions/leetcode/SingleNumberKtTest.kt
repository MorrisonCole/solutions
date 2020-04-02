package com.morrisoncole.solutions.leetcode

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import java.util.*
import java.util.stream.Stream

internal class SingleNumberKtTest {

    @ParameterizedTest
    @MethodSource("expectations")
    fun `finds single number`(expectation: Expectation) {
        val actual = singleNumber(expectation.nums)

        assertThat(actual).isEqualTo(expectation.expected)
    }

    companion object {
        @JvmStatic
        @Suppress("unused")
        fun expectations(): Stream<Expectation> = Arrays.stream(arrayOf(
            Expectation(intArrayOf(2, 2, 1), 1),
            Expectation(intArrayOf(4, 1, 2, 1, 2), 4)
        ))
    }

    data class Expectation(
        val nums: IntArray,
        val expected: Int
    ) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Expectation

            if (!nums.contentEquals(other.nums)) return false
            if (expected != other.expected) return false

            return true
        }

        override fun hashCode(): Int {
            var result = nums.contentHashCode()
            result = 31 * result + expected
            return result
        }
    }
}

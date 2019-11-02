package com.morrisoncole.solutions.leetcode

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class TwoSumTest {

    @Test
    fun `returns indices of two numbers adding to target`() {
        val target = 9
        val actual = twoSum(intArrayOf(2, 7, 11, 15), target)

        assertThat(actual)
            .asList()
            .containsExactlyElementsIn(listOf(0, 1))
    }
}

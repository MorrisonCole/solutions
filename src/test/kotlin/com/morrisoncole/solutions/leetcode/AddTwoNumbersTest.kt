package com.morrisoncole.solutions.leetcode

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class AddTwoNumbersTest {

    @Test
    fun `adds two numbers`() {
        val firstNumber = ListNode(2).apply {
            next = ListNode(4).apply {
                next = ListNode(3)
            }
        }
        val secondNumber = ListNode(5).apply {
            next = ListNode(6).apply {
                next = ListNode(4)
            }
        }

        val actual = addTwoNumbers(firstNumber, secondNumber)

        assertThat(actual).isEqualTo(ListNode(7).apply {
            next = ListNode(0).apply {
                next = ListNode(8)
            }
        })
    }

    @Test
    fun `handles results of differing lengths`() {
        val firstNumber = ListNode(5)
        val secondNumber = ListNode(5)

        val actual = addTwoNumbers(firstNumber, secondNumber)

        assertThat(actual).isEqualTo(ListNode(0).apply { next = ListNode(1) })
    }
}

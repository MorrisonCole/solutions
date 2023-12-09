package com.morrisoncole.solutions.leetcode

fun addTwoNumbers(l1: ListNode?, l2: ListNode?, carry: Int = 0): ListNode? {
    if (l1 == null && l2 == null) {
        return if (carry > 0) {
            ListNode(carry)
        } else {
            null
        }
    }

    val first = l1?.`val` ?: 0
    val second = l2?.`val` ?: 0

    val sum = first + second + carry
    val nextCarry = sum / 10

    return ListNode(sum % 10).apply {
        next = addTwoNumbers(l1?.next, l2?.next, nextCarry)
    }
}

/**
 * Problem's definition of singly-linked list + comparisons for tests
 */
data class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        return "ListNode(`val`=$`val`, next=$next)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ListNode

        if (`val` != other.`val`) return false
        if (next != other.next) return false

        return true
    }

    override fun hashCode(): Int {
        var result = `val`
        result = 31 * result + (next?.hashCode() ?: 0)
        return result
    }
}

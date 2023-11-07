package com.morrisoncole.solutions.leetcode

fun middleNode(head: ListNode?): ListNode? {
    var slowPointer = head
    var fastPointer = head

    while (fastPointer?.next != null) {
        fastPointer = fastPointer.next?.next
        slowPointer = slowPointer?.next
    }

    return slowPointer
}
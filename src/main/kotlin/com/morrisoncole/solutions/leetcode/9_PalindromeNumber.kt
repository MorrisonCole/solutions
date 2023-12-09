package com.morrisoncole.solutions.leetcode

fun isPalindrome(x: Int): Boolean {
    if (x == 0) return true
    if (x < 0 || (x % 10 == 0)) return false

    var reversed = 0
    var remaining = x
    while (remaining > reversed) {
        reversed = (reversed * 10) + (remaining % 10)
        remaining /= 10
    }

    return remaining == reversed || remaining == (reversed / 10)
}

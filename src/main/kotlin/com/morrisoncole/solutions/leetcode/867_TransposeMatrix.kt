package com.morrisoncole.solutions.leetcode

fun transpose(matrix: Array<IntArray>): Array<IntArray> {
    val result = Array(matrix[0].size) {IntArray(matrix.size)}

    for (y in 0..matrix.lastIndex) {
        for (x in 0..matrix[y].lastIndex) {
            result[x][y] = matrix[y][x]
        }
    }

    return result
}
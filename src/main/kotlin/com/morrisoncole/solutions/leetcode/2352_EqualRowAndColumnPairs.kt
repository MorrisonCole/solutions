package com.morrisoncole.solutions.leetcode

fun equalPairs(grid: Array<IntArray>): Int {
    val rowMap = mutableMapOf<String, Int>()

    for (row in grid) {
        val rowKey = row.joinToString()
        rowMap[rowKey] = rowMap.getOrDefault(rowKey, 0) + 1
    }

    var result = 0
    for (x in 0..grid[0].lastIndex) {
        val column = mutableListOf<Int>()
        for (y in 0..grid.lastIndex) {
            column.add(grid[y][x])
        }
        val columnKey = column.joinToString()

        result += rowMap.getOrDefault(columnKey, 0)
    }

    return result
}
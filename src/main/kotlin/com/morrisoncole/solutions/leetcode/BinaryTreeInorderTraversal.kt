package com.morrisoncole.solutions.leetcode

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun inorderTraversal(root: TreeNode?): List<Int> {
    val result = mutableListOf<Int>()

    helper(root, result)

    return result
}

fun helper(root: TreeNode?, list: MutableList<Int>) {
    if (root == null) {
        return
    }

    list.addAll(inorderTraversal(root.left))
    list.add(root.`val`)
    list.addAll(inorderTraversal(root.right))
}
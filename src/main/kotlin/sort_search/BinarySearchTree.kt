package sort_search

import tree_graph.Tree

class BinarySearchTree {

    var root: Tree.Node? = null

    fun makeTree(a: Array<Int>) {
        root = makeTreeR(a, 0, a.size - 1)
    }

    private fun makeTreeR(arr: Array<Int>, start: Int, end: Int): Tree.Node? {
        if (start > end) return null

        val mid = (start + end) / 2
        val node = Tree.Node(arr[mid])

        node.left = makeTreeR(arr, start, mid-1)
        node.right = makeTreeR(arr, mid+1, end)
        return node

    }

    fun searchBinaryTree(node: Tree.Node?, findData: Int) {
        if (node != null) {
            when {
                findData < node.data!! -> {
                    println("Data is smaller than ${node.data}")
                    searchBinaryTree(node.left!!, findData)
                }
                findData > node.data!! -> {
                    println("Data is bigger than ${node.data}")
                    searchBinaryTree(node.right!!, findData)
                }
                else -> println("Data found!")
            }
        }
    }

}
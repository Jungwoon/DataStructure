package tree_graph

import java.util.*

class Graph(size: Int) {

    data class Node(
        var data: Int,
        var adjacent: LinkedList<Node> = LinkedList(),
        var marked: Boolean = false
    )

    private val nodes: Array<Node> = Array(size) { Node(it) }

    fun addEdge(idx1: Int, idx2: Int) {
        val node1 = nodes[idx1]
        val node2 = nodes[idx2]

        if (!node1.adjacent.contains(node2)) {
            node1.adjacent.add(node2)
        }

        if (!node2.adjacent.contains(node1)) {
            node1.adjacent.add(node1)
        }
    }

    fun dfs() {
        dfs(0)
    }

    // Stack
    private fun dfs(index: Int) {
        val root = nodes[index]
        val stack = Stack<Node>()
        stack.push(root)
        root.marked = true

        while(!stack.isEmpty()) {
            val r = stack.pop()

            for (n in r.adjacent) {
                if (!n.marked) {
                    n.marked = true
                    stack.push(n)
                }
            }
            visit(r)
        }
    }

    fun bfs() {
        bfs(0)
    }

    // Queue
    private fun bfs(index: Int) {
        // LinkedList로 Queue 사용할때
        // offer = enqueue
        // remove = dequeue

        val root = nodes[index]
        val queue = LinkedList<Node>()

        queue.offer(root)
        root.marked = true

        while(!queue.isEmpty()) {
            val r = queue.remove()

            for (n in r.adjacent) {
                if (!n.marked) {
                    n.marked = true
                    queue.offer(n)
                }
            }
            visit(r)
        }
    }

    fun dfsRecursive() {
        dfsRecursive(0)
    }

    fun dfsRecursive(index: Int) {
        val r = nodes[index]
        dfsRecursive(r)
    }

    private fun dfsRecursive(r: Node?) {
        if (r == null) return
        r.marked = true
        visit(r)

        for (n in r.adjacent) {
            if (!n.marked) {
                dfsRecursive(n)
            }
        }
    }


    private fun visit(node: Node) {
        print(" ${node.data} ")
    }

    private fun initMarks() {
        for (n in nodes) {
            n.marked = false
        }
    }

    fun search(i1: Int, i2: Int): Boolean {
        return search(nodes[i1], nodes[i2])
    }

    fun search(start: Node, end: Node): Boolean {
        initMarks()

        val q = LinkedList<Node>()
        q.offer(start)

        while(!q.isEmpty()) {
            val root = q.remove()
            if (root == end) {
                return true
            }

            for (n in root.adjacent) {
                if (!n.marked) {
                    n.marked = true
                    q.offer(n)
                }
            }
        }

        return false
    }


}
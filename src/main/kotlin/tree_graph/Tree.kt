package tree_graph

class Tree {

    data class Node(
        var data: Int? = null,
        var left: Node? = null,
        var right: Node? = null
    )

    var rootNode: Node? = null

    fun setRoot(node: Node) {
        rootNode = node
    }

    fun getRoot() = rootNode

    fun makeNode(left: Node?, data: Int, right: Node?) =
        Node(data, left, right)

    fun inorder(node: Node?) {
        if (node != null) {
            inorder(node.left)
            print(" ${node.data} ")
            inorder(node.right)
        }
    }

    fun preorder(node: Node?) {
        if (node != null) {
            print(" ${node.data} ")
            preorder(node.left)
            preorder(node.right)
        }
    }

    fun postorder(node: Node?) {
        if (node != null) {

            postorder(node.left)
            postorder(node.right)
            print(" ${node.data} ")
        }
    }



}
import java.util.*

class HashTable(size: Int) {

    var data: Array<LinkedList<Node>?> = Array(size) {null}

    private fun getHashCode(key: String): Int {
        var hashCode = 0

        for (char in key.toCharArray()) {
            hashCode += char.toInt()
        }

        return hashCode
    }

    private fun convertToIndex(hashCode: Int) = hashCode % data.size

    private fun searchKey(list: LinkedList<Node>, key: String): Node? {
        for (node in list) {
            if (node.key == key) {
                return node
            }
        }

        return null
    }

    fun put(key: String, value: String) {
        val hashCode = getHashCode(key)
        val index = convertToIndex(hashCode)

        println("$key hashcode($hashCode), index($index)")

        var list = data[index]

        if (list == null) {
            list = LinkedList()
            data[index] = list
        }

        val node = searchKey(list, key)

        if (node == null) {
            list.addLast(Node(key, value))
        } else {
            node.value = value
        }
    }

    fun get(key: String): String {
        val hashCode = getHashCode(key)
        val index = convertToIndex(hashCode)

        val list = data[index]

        return list?.let {linkedList ->
            searchKey(linkedList, key)?.let {node ->
                return node.value
            } ?: "Not Found"
        } ?: "Not Found"
    }

    data class Node(
        val key: String,
        var value: String
    )
}
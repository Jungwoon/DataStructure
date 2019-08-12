package linkedList

class MyLinkedList {

    data class Node(
        var data: Int? = null,
        var next: Node? = null
    )

    var header = Node()

    fun append(data: Int) {
        var n = header
        while(n.next != null) {
            n = n.next!!
        }

        n.next = Node(data)
    }

    fun delete(data: Int) {
        var n = header

        while(n.next != null) {
            if (n.next!!.data == data) {
                n.next = n.next!!.next
            } else {
                n = n.next!!
            }
        }
    }

    fun retrieve() {
        var n = header.next

        while(n?.next != null) {
            print("${n.data} -> ")
            n = n.next!!
        }

        println(n?.data)
    }



}
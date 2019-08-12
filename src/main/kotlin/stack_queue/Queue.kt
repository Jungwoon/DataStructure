package stack_queue

class Queue<T> {

    data class MyNode<T>(
        var data: T,
        var next: MyNode<T>? = null
    )

    var first: MyNode<T>? = null
    var last: MyNode<T>? = null


    fun add(data: T) {
        val item = MyNode(data)

        if (last != null) {
            last?.next = item
        }

        last = item

        if (first == null) {
            first = item
        }
    }

    fun remove(): T {

        if (first == null) {
            throw NoSuchElementException()
        }

        val data = first!!.data
        first = first!!.next

        if (first == null) {
            last = null
        }

        return data

    }

    fun peek(): T {
        if (first == null) {
            throw NoSuchElementException()
        }

        return first!!.data
    }

    fun isEmpty() = first == null

}
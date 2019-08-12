package stack_queue

import java.util.*

class MyStack<T> {

    data class MyNode<T>(
        var data: T,
        var next: MyNode<T>? = null
    )

    var top: MyNode<T>? = null

    fun pop(): T {
        if (top == null) {
            throw EmptyStackException()
        }

        val item = top?.data
        top = top?.next

        return item!!
    }

    fun push(data: T) {
        val item = MyNode(data)
        item.next = top
        top = item
    }

    fun peek(): T {
        if (top == null) {
            throw EmptyStackException()
        }

        return top!!.data
    }

    fun isEmpty() = top == null


}
package stack_queue

import java.util.*

class CustomQueue<T> {

    // 두 개의 스택으로 큐 만들기

    private val stackNewest = Stack<T>()
    private val stackOldest = Stack<T>()

    fun size() = stackNewest.size + stackOldest.size

    fun add(value: T) {
        stackNewest.push(value)
    }

    fun peek(): T {
        shiftStacks()
        return stackOldest.peek()
    }

    fun remove(): T {
        shiftStacks()
        return stackOldest.pop()
    }

    private fun shiftStacks() {
        if (stackOldest.isEmpty()) {
            while(!stackNewest.isEmpty()) {
                stackOldest.push(stackNewest.pop())
            }
        }
    }

}
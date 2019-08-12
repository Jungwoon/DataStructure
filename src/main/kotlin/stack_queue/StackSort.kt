package stack_queue

import java.util.*

class StackSort {

    fun sort(stack: Stack<Int>): Stack<Int> {

        val tempStack = Stack<Int>()

        while (!stack.empty()) {
            val temp = stack.pop()

            while (!tempStack.empty() && tempStack.peek() > temp) {
                stack.push(tempStack.pop())
            }

            tempStack.push(temp)
        }

        while (!tempStack.empty()) {
            stack.push(tempStack.pop())
        }

        return stack

    }

}
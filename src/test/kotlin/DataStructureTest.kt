import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import java.util.*

@RunWith(JUnit4::class)
class DataStructureTest {


    @Test
    fun test1() {
        solution1("aabaas")
    }

    fun solution1(S: String): Int {

        var result = 0
        for (eachWord in S.groupBy { it }) {
            if (eachWord.value.count() % 2 != 0) {
                result++
            }
        }

        return result
    }

    @Test
    fun test2() {
        MatcherAssert.assertThat(solution2(intArrayOf(2, 3, 4, 1, 5)), CoreMatchers.`is`(2))
    }

    fun solution2(A: IntArray): Int {
        val bulbList = arrayListOf<Boolean>()
        var result = 0

        for (i in 0 until A.size) bulbList.add(false)

        for (moments in A) {
            bulbList[moments - 1] = true

            var check = true
            for (index in 0 until moments) {
                if (!bulbList[index]) {
                    check = false
                    break
                }
            }

            if (check) result++
        }

        return result
    }

    @Test
    fun test3() {
        println(solution3(1, 3, 1))
    }

    private fun solution3(A: Int, B: Int, C: Int): String {
        val totalList = arrayListOf(
            assignToStack('a', A),
            assignToStack('b', B),
            assignToStack('c', C)
        )

        var loop = true
        var targetStack: MyStack?
        var emptyCount: Int

        var result = ""

        while (loop) {
            targetStack = null
            emptyCount = 0

            for (myStack in totalList) {

                if (myStack.lastUsed) {
                    myStack.lastUsed = false
                    continue
                }

                if (myStack.stack.size == 0) {
                    emptyCount += 1
                    if (emptyCount >= 2) loop = false
                    continue
                }


                if (targetStack == null) {
                    targetStack = myStack
                } else if (targetStack.stack.size < myStack.stack.size) {
                    targetStack = myStack
                }

            }

            if (targetStack != null) {
                if (!targetStack.stack.isEmpty()) {
                    result += targetStack.stack.pop()
                    targetStack.lastUsed = true
                }
            }


        }

        return result
    }

    private fun assignToStack(word: Char, count: Int): MyStack {
        val tempStack = Stack<String>()

        for (i in 0 until (count / 2)) tempStack.add("$word$word")
        for (i in 0 until (count % 2)) tempStack.add("$word")

        return MyStack(tempStack)
    }

    data class MyStack(
        var stack: Stack<String>,
        var lastUsed: Boolean = false
    )

    @Test
    fun reverseString() {
        val sample = "Hello World"

        val stack = Stack<Char>()

        for (char in sample.toCharArray()) {
            stack.push(char)
        }

        var result = ""
        while (!stack.empty()) {
            result += stack.pop()
        }

        println(result)
    }

}
package linkedList

class MyNode(private val data: Int) {

    var next: MyNode? = null

    fun append(data: Int) {
        val end = MyNode(data)
        var currentNode = this

        while(currentNode.next != null) {
            currentNode = currentNode.next!!
        }

        currentNode.next = end
    }

    fun delete(data: Int) {
        var currentNode = this

        while(currentNode.next != null) {
            if (currentNode.next!!.data == data) {
                currentNode.next = currentNode.next!!.next
            } else {
                currentNode = currentNode.next!!
            }
        }
    }

    fun retrieve() {
        var currentNode = this

        while(currentNode.next != null) {
            print("${currentNode.data} -> ")
            currentNode = currentNode.next!!
        }

        println(currentNode.data)
    }

}
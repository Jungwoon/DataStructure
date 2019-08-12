import sort_search.BinarySearchTree
import sort_search.BubbleSort
import sort_search.SelectionSort
import tree_graph.Graph

fun main() {

//    val hashTable = HashTable(4)
//    hashTable.put("sung", "She is pretty")
//    hashTable.put("jin", "She is model")
//    hashTable.put("hee", "She is an angel")
//    hashTable.put("min", "She is cute")
//    hashTable.put("sung", "She is beautiful")
//
//    println(hashTable.get("sung"))
//    println(hashTable.get("jin"))
//    println(hashTable.get("hee"))
//    println(hashTable.get("min"))
//    println(hashTable.get("jae"))


//    val sampleArray = arrayOf(3, 9, 4, 7, 5)
//    val quickSort = QuickSort()
//    val mergeSort = MergeSort()
//
//    printArray(sampleA rray)
//    mergeSort.mergeSort(sampleArray)

//    val ll = MyLinkedList()
//    ll.append(1)
//    ll.append(2)
//    ll.append(3)
//    ll.append(4)
//    ll.append(5)
//    ll.retrieve()

//    val customQueue = stack_queue.CustomQueue<Int>()
//
//    customQueue.add(1)
//    customQueue.add(3)
//    customQueue.add(4)
//
//    customQueue.remove()
//    customQueue.remove()
//    customQueue.remove()

//    val a = StackSort()
//
//    val stack_queue = Stack<Int>()
//    stack_queue.push(3)
//    stack_queue.push(1)
//    stack_queue.push(17)
//    stack_queue.push(11)
//
//    val sortedStack = a.sort_search(stack_queue)
//    println(sortedStack.pop())
//    println(sortedStack.pop())
//    println(sortedStack.pop())
//    println(sortedStack.pop())


//    val t = tree_graph.Tree()
//    val n4 = t.makeNode(null, 4, null)
//    val n5 = t.makeNode(null, 5, null)
//    val n2 = t.makeNode(n4, 2, n5)
//    val n3 = t.makeNode(null, 3, null)
//    val n1 = t.makeNode(n2, 1, n3)
//
//    t.setRoot(n1)
//    t.getRoot()?.let { t.inorder(it) }
//    println()
//    t.getRoot()?.let { t.preorder(it) }
//    println()
//    t.getRoot()?.let { t.postorder(it) }


//    val graph = Graph(9)
//    graph.addEdge(0, 1)
//    graph.addEdge(1, 2)
//    graph.addEdge(1, 3)
//    graph.addEdge(2, 4)
//    graph.addEdge(2, 3)
//    graph.addEdge(3, 4)
//    graph.addEdge(3, 5)
//    graph.addEdge(5, 6)
//    graph.addEdge(5, 7)
//    graph.addEdge(6, 8)

//    tree_graph.dfs()
//    graph.bfs()
//    tree_graph.dfsRecursive()

//    println(graph.search(1, 8))



//    val a = Array(10) { it }
//
//    val bst = BinarySearchTree()
//    bst.makeTree(a)
//
//    bst.searchBinaryTree(bst.root, 2)


//    val sampleArray = arrayOf(3, 9, 4, 7, 5)
//    val bubble = BubbleSort()
//
//    printArray(sampleArray)
//    printArray(bubble.bubbleSort(sampleArray))

//    val sampleArray = arrayOf(3, 9, 4, 7, 5)
//    val selection = SelectionSort()
//
//    printArray(sampleArray)
//    printArray(selection.selectionSort(sampleArray))

    val permutationPalindrome = PermutationPalindrome()

    println(permutationPalindrome.isPermutationOfPalindrome("aa bb cc dd"))
    println(permutationPalindrome.isPermutationOfPalindrome("aa bb cc dd d"))
    println(permutationPalindrome.isPermutationOfPalindrome("aa bb cc dd e fff"))

}

fun printArray(arr: Array<Int>) {

    for (element in arr) {
        print("$element ")
    }
    println()
}

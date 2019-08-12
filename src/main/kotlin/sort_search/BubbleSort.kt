package sort_search

// O (n^2)

class BubbleSort {

    fun bubbleSort(arr: Array<Int>): Array<Int> {
        return bubbleSort(arr, arr.size - 1)
    }

    private fun bubbleSort(arr: Array<Int>, last: Int): Array<Int> {
        if (last > 0) {
            for (i in 1..last) {
                if (arr[i - 1] > arr[i]) {
                    swap(arr, i - 1, i)
                }
            }
            bubbleSort(arr, last - 1)
        }

        return arr
    }


    private fun swap(arr: Array<Int>, start: Int, end: Int) {
        val temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
    }
}
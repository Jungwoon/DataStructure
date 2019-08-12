package sort_search

// O (n^2)

class SelectionSort {

    fun selectionSort(arr: Array<Int>): Array<Int> {
        return selectionSort(arr, 0)
    }

    fun selectionSort(arr: Array<Int>, start: Int): Array<Int> {
        if (start < arr.size -1) {
            var minIndex = start

            for (i in start until arr.size) {
                if (arr[i] < arr[minIndex]) minIndex = i
            }

            swap(arr, start, minIndex)
            selectionSort(arr, start + 1)
        }

        return arr
    }


    private fun swap(arr: Array<Int>, start: Int, end: Int) {
        val temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
    }

}
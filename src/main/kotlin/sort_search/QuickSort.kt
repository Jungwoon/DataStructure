package sort_search
// 평균 : O(n log n)
// 최악 : O(n^2)

class QuickSort {

    fun quickSort(arr: Array<Int>): Array<Int> {
        return quickSort(arr, 0, arr.size-1)
    }

    private fun quickSort(arr: Array<Int>, start: Int, end: Int): Array<Int> {
        val subPartition = partition(arr, start, end)
        
        if (start < subPartition - 1) {
            quickSort(arr, start, subPartition-1)
        }
        
        if (subPartition < end) {
            quickSort(arr, subPartition, end)
        }

        return arr

    }

    private fun partition(arr: Array<Int>, idxStart: Int, idxEnd: Int): Int {
        var start = idxStart
        var end = idxEnd

        val pivot = arr[(start+end) / 2]

        while (start <= end) {
            while (arr[start] < pivot) start += 1
            while (arr[end] > pivot) end -= 1
            
            if (start <= end) {
                swap(arr, start, end)
                start += 1
                end -= 1
            }
        }

        return start
    }

    private fun swap(arr: Array<Int>, start: Int, end: Int) {
        val temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
    }

}
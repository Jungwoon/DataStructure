package sort_search
// 시간 복잡도 : O (n log n)
class MergeSort {

    lateinit var sortedList: Array<Int>

    fun mergeSort(originList: Array<Int>){
        sortedList = Array(originList.size) {0}
        mergeSort(originList, 0, originList.size - 1)
    }

    private fun mergeSort(originList: Array<Int>, start: Int, end: Int) {
        if (start < end) {
            val mid = (start + end) / 2
            mergeSort(originList, start, mid)
            mergeSort(originList, mid + 1, end)
            merge(originList, start, mid, end)
        }
    }

    private fun merge(originList: Array<Int>, start: Int, mid: Int, end: Int) {
        var part1 = start // Part1의 첫번째 인덱스
        var part2 = mid + 1 // Part2의 첫번째 인덱스
        var index = start

        while (part1 <= mid && part2 <= end) {
            if (originList[part1] <= originList[part2]) {
                sortedList[index] = originList[part1]
                part1++
            } else {
                sortedList[index] = originList[part2]
                part2++
            }
            index++
        }

        if (part1 <= mid) {
            for (idx in part1..mid) {
                sortedList[index] = originList[idx]
                index++
            }
        } else {
            for (idx in part2..end) {
                sortedList[index] = originList[idx]
                index++
            }
        }

        for (idx in start..end)
            originList[idx] = sortedList[idx]

        println("\nMege Sort >> ")

        for (element in originList) {
            print("$element ")
        }
        println()
    }

}
package done

class MergeIntervals {
    fun test() {
        val intervals = arrayOf(intArrayOf(1, 5),  intArrayOf(0, 5))

        val result = merge(intervals)

        for (ar in result)
            println("[${ar.get(0)}, ${ar.get(1)}]")


    }

    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        if (intervals.size < 2)
            return intervals

        val sorted = intervals.sortedWith(Comparator {a1, a2 -> (a1[0] - a2[0])})

        var result = mutableListOf<IntArray>()
        var start = sorted[0][0]
        var end = sorted[0][1]

        for (i in 1 until sorted.size) {
            if (end < sorted[i][0]) {
                result.add(intArrayOf(start, end))
                start = sorted[i][0]
                end = sorted[i][1]
            }
            else if (end < sorted[i][1]) {
                end = sorted[i][1]

            }
        }

        if (end >= sorted[sorted.size - 1][0])
            result.add(intArrayOf(start, end))

        return result.toTypedArray()
    }
}
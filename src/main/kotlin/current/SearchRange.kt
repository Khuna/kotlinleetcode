package current

class SearchRange {

    fun test() {
        val nums = intArrayOf(5,7,7,8,8,10)
        println(searchRange(nums, 8))
    }

    fun searchRange(nums: IntArray, target: Int): IntArray {
        if (nums.size == 0)
            return intArrayOf(-1, -1)

        if (nums.size == 1) {
            if (nums[0] == target)
                return intArrayOf(0, 0)
            else
                return intArrayOf(-1, -1)
        }

        var start = 0
        var end = nums.size - 1

        if (target < nums[start])
            return intArrayOf(-1, -1)

        if (target > nums[end])
            return intArrayOf(-1, -1)


        var findedIndex = -1

        while (start < end) {
            var middle = (start + end) / 2
            if (target == nums[middle]) {
                findedIndex = middle
                break
            }
            else if (target > nums[middle])
                start = middle
            else
                end = middle
        }

        return intArrayOf(-1, -1)
    }
}
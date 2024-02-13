package todo

class ThreeSum {

    fun test() {
        val nums = intArrayOf()
        println(threeSum(nums))
    }

    fun threeSum(nums: IntArray): List<List<Int>> {

        nums.sort()
        val len = nums.size
        var result = mutableListOf<List<Int>>()

        if (nums.size < 3 || nums[0] > 0 || nums[len - 1] < 0)
            return result

        for (first in 0 until len - 2) {
            if (first == 0 || nums[first-1] != nums[first]) {
                var start = first + 1;
                var end = len - 1

                while (start < end) {
                    var sum = nums[first] + nums[start] + nums[end]
                    if (sum == 0) {
                        result.add(listOf(nums[first], nums[start], nums[end]))
                        start++
                        end--
                        while (start < end && nums[start] == nums[start + 1]) start++
                        while (end > start && nums[end] == nums[end - 1]) end--
                    }
                    else if (sum < 0) {
                        start++
                        while (start < end && nums[start] == nums[start + 1]) start++
                    }
                    else if (sum > 0) {
                        end--
                        while (end > start && nums[end] == nums[end - 1]) end--
                    }
                }
            }
        }

        return result
    }
}
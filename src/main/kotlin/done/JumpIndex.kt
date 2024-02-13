package done

class JumpIndex {

    fun test() {
        val nums = intArrayOf(2, 0)
        println(canJump(nums))
    }

    fun canJump(nums: IntArray): Boolean {

        if (nums.size == 0)
            return false

        if (nums.size == 1)
            return nums[0] > 0

        var max = 0;
        for (i in 0 until nums.size) {
            if (i > max)
                break
            max = maxOf(max, nums[i] + i)
        }

        return max >= nums.size
    }

}
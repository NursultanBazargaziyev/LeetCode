class Solution {
     fun leftRightDifference(nums: IntArray): IntArray {
        if (nums.isEmpty() || nums.size == 1)
            IntArray(1){0}

        val leftSum = IntArray(nums.size) {0}
        val rightSum = IntArray(nums.size) {0}

        for (i in 0 until nums.size - 1){
            leftSum[i + 1] = leftSum[i] + nums[i]
        }

        for (i in nums.size - 1 downTo 1) {
            rightSum[i - 1] = rightSum[i] + nums[i]
        }

        return nums.mapIndexed{ index, _ ->
            abs((leftSum[index] - rightSum[index]))
        }.toIntArray()
    }
}
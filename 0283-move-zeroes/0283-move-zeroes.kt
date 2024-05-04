class Solution {
    fun moveZeroes(nums: IntArray){
        var zeroPointer = 0

        for (i in nums.indices){
            if (nums[i] != 0){
                var temp = nums[zeroPointer]
                nums[zeroPointer] = nums[i]
                nums[i] = temp

                zeroPointer++
            }
        }
    }
}
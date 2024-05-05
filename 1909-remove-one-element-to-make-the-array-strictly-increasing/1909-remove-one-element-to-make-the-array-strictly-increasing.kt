class Solution {
   fun canBeIncreasing(nums: IntArray): Boolean {
        var counter = 0

        nums.drop(1).forEachIndexed { index, num ->
            if (counter >= 2) return@forEachIndexed

            if (nums[index] >= num){
                counter++
                if (index > 0 && nums[index - 1] >= num){
                    nums[index + 1] = nums[index]
                }
            }
        }
        return counter < 2
    }
}
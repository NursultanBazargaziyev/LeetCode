class Solution {
   
    fun prefixesDivBy5(nums: IntArray): List<Boolean> {
      return nums.run {
        var sum = 0
        map { num ->
            sum = (sum shl 1 or num) % 5
            sum == 0
        }
    }
    }
}
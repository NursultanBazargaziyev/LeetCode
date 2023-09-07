class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {

    for(i in 0..<n){
        nums[i] = nums[i] shl 10
        nums[i] = nums[i] or nums[i+n]
    }

    var j = 2 * n - 1
    for (i in n-1 downTo 0){
        val y = nums[i] and ((2.0.pow(10.0)).toInt() - 1)
        val x = nums[i] shr 10

        nums[j] = y
        nums[j-1] = x
        j-=2
    }


    return nums
}
}
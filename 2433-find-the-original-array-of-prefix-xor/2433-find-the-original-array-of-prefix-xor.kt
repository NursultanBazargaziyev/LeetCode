class Solution {
    fun findArray(pref: IntArray): IntArray {
        val result = IntArray(pref.size)
        result[0] = pref[0]
        for (i in 1 until pref.size){
            result[i] = pref[i-1] xor pref[i]
        }
        return result
    }
}
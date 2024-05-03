class Solution {
    fun decode(encoded: IntArray, first: Int): IntArray {
    val result = IntArray(encoded.size + 1)

    result[0] = first
    encoded.forEachIndexed { index, i ->
        result[index+1] = result[index] xor i
    }

    return result
}

}
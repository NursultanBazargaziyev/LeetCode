class Solution {
    fun findWordsContaining(words: Array<String>, x: Char): List<Int> {
        val result = mutableListOf<Int>()
        words.forEachIndexed { index, item ->
            if (item.contains(x))
                result.add(index)
        }

        return result
    }
}
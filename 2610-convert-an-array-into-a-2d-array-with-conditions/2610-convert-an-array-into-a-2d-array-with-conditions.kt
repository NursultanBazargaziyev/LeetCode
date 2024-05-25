class Solution {
     
 fun findMatrix(nums: IntArray): List<List<Int>> {
        val hashMap = mutableMapOf<Int, Int>()
        val result = mutableListOf<List<Int>>()

        nums.forEach {
            hashMap[it] = hashMap.getOrDefault(it, 0) + 1
        }

        while (hashMap.isNotEmpty()) {
            val temp = mutableListOf<Int>()
            val iterator = hashMap.iterator()

            while(iterator.hasNext()){
                val entry = iterator.next()
                temp.add(entry.key)
                if (entry.value == 1) {
                    iterator.remove()
                } else {
                    hashMap[entry.key] = entry.value - 1
                }
            }
            result.add(temp)
        }
        return result
    }
}
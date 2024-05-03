class Solution {
      fun mostWordsFound(sentences: Array<String>): Int { 
        var result = 0

       sentences.forEach {
           var length = it.split(" ").size
           result = max(length, result)
       }

        return result
    }
}
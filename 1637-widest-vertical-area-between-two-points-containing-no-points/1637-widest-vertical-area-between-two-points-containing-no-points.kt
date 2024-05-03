class Solution {
    fun maxWidthOfVerticalArea(points: Array<IntArray>): Int {
        points.sortBy { it[0] }
        var answer = 0
        for (i in 1..< points.size){
            answer = max(answer, points[i][0] - points[i-1][0])
        }
        return answer
    }
}
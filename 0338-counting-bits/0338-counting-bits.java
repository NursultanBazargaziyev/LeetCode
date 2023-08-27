class Solution {
 static public int[] countBits(int n) {

        if(n == 0) return new int[]{0};
        int[] ans = new int[n+1];

        int index = 0;
        for(int i = 1; i <= n; i++){
            if(index * 2 == i)
                index = 0;
            ans[i] = ans[index] + 1;
            index++;
        }
        return ans;
    }
}
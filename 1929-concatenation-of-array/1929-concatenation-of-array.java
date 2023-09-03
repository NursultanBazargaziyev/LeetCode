class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] answer = new int[nums.length + nums.length];
        
        int i = 0;
        int n = nums.length;
        
        while(i != nums.length){
            answer[i] = nums[i];
            answer[i + n] = nums[i];
            i++;
        }
        
        return answer;
    }
}
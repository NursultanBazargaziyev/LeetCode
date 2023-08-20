class Solution {
    public int maxArea(int[] height) {
        int highest = 0;
        
        int left = 0, right = height.length - 1;

        while(left < right){
            int currentVol = Math.min(height[left], height[right]) * (right - left);
            
            highest = Math.max(currentVol, highest);
            
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
            
        }
        
        return highest;
    }
}
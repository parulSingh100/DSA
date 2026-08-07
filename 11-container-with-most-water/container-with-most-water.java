class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        
        int volume = 0;
        while(left < right){
            int length = Math.min(height[left],height[right]);
            int wridth = right - left;
            volume = Math.max(volume, length * wridth);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return volume;
        
    }
}
import java.lang.Integer;
class Solution {
    public int findPeakElement(int[] nums) {
        
        for(int i = 0; i < nums.length; i++){
            boolean smaller = (i==0)||nums[i]>nums[i-1];
            boolean larger = (i==nums.length - 1)|| nums[i]>nums[i+1];
            if(smaller && larger){
                return i;
            }
        }
    return 0;    
    }
}
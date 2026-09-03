class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        double maxAverage = Double.NEGATIVE_INFINITY; 
        for(int right = 0; right < nums.length; right++){
            sum+=nums[right];
            if((right-left + 1)==k){
                maxAverage = Math.max(maxAverage, (double)(sum)/(right-left+1));
                sum = sum -nums[left];
                left++;
            }
        }
    return maxAverage;    
    }
}
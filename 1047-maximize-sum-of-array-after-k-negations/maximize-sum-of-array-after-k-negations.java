class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int sum =0;
        int min = Math.abs(nums[0]);
        
            Arrays.sort(nums);
            for(int i = 0; i < nums.length; i++){
                if(nums[i]< 0&& k>0){
                    nums[i] = -1* (nums[i]);
                    k--;
                }
            min = Math.min(min,Math.abs(nums[i]));   
            }
            for(int i = 0; i < nums.length; i++){
                sum += nums[i];
            }
            
            k = k % 2;
            if(k!= 0){
                sum = sum - (2*min);
                k--;
            }    
        
        
        return sum;
        
    }
}
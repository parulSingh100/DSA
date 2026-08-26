class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int sum =0;
        int min = nums[0];
        
            Arrays.sort(nums);
            for(int i = 0; i < nums.length; i++){
                if(nums[i]< 0&& k>0){
                    nums[i] = -1* (nums[i]);
                    k--;
                }
                
            }
            Arrays.sort(nums);
            k = k % 2;
            if(k!= 0){
                nums[0] = -1* (nums[0]);
                k--;
            }    
        
        for(int i = 0; i < nums.length; i++){
                sum += nums[i];
            }
        return sum;
        
    }
}
class Solution {
    public int robHelper(int [] nums, int n,int[] dp){
        if(n==0){
            return nums[n] ;
        }
        if(n==1){
            return Math.max(nums[0],nums[1]);
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n] =  Math.max((nums[n] + robHelper(nums,n-2,dp)),robHelper(nums,n-1,dp));
        return dp[n];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int [] dp = new int[n];
        Arrays.fill(dp,-1);
        return robHelper(nums, n-1,dp);
        
    }
}
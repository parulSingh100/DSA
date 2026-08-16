class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        
        int n = nums.length + 1;
        int [] prefix = new int[n];
        prefix[0] = 0;
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + nums[i-1];
        }
        
        for(int left = 0; left < nums.length; left++){
            for(int right = left; right < nums.length; right++){
                int sum = prefix[right+ 1]- prefix[left];

                if(sum==k){
                    count++;
                }
            }
        }
        return count;
        // int count = 0;
        // for(int left = 0; left < nums.length; left++){
        //     int sum = 0;
        //     for(int right = left; right < nums.length; right++){
        //         sum+=nums[right];
        //         if(sum==k){
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }
}
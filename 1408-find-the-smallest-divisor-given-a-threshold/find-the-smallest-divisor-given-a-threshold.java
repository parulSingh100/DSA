class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(max<nums[i]){
                max = nums[i];
            }
        }
        int left = 0;
        int right = max;
        int target = 0;
        while(left<=right){
            int mid = left + (right - left)/2;
            int sum = 0;
            
            for(int i = 0; i < nums.length; i++){
                sum+= Math.ceil((double)nums[i]/mid);
                if(sum>threshold){
                    break;
                }
            }
            if(sum<=threshold){
                target = mid;
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }
    return target;    
    }
}
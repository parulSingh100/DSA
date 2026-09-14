class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums[nums.length - 1];
        int target = 0;
        while(left<=right){
            int mid = left + (right - left)/2;
            int sum = 0;
            
            for(int i = 0; i < nums.length; i++){
                sum+= Math.ceil((double)nums[i]/mid);
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
class Solution {
    public static void rotation(int left, int right,int [] nums){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        for(int i = nums.length-2; i >= 0; i--){
            if(nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot == -1){
            int left = 0;
            int right = nums.length-1;
            while(left<right){
                rotation(left, right, nums);
                left++;
                right--;
            }
            return;
        }
        for(int i = nums.length-1; i >pivot; i--){
            if(nums[i]>nums[pivot]){
                rotation(pivot, i, nums);
                break;
            }
        }
        
        int left = pivot + 1;
        int right = nums.length-1;
        while(left<right){
            rotation(left,right,nums);
            left++;
            right--;
        }
    }
}
class Solution {
    
    public static void swap(int left, int right, int [] nums ){
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k% n ;
        swap(0, n-1,nums);
        swap(0,k-1,nums);
        swap(k,n-1,nums);
    }
    
}
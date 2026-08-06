class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length ;
        int [] prefixArray = new int[n];
        int [] suffixArray = new int[n];
        int mul1 = 1;
        prefixArray[0] = 1;

        for(int i = 1; i < nums.length; i++){
            mul1 = nums[i-1]*mul1;
            prefixArray[i] = mul1; 
            
        }
        int mul2 = 1;
        suffixArray[n-1] = 1;
        for(int i = nums.length-2 ; i >= 0 ; i--){
            mul2 = nums[i + 1]*mul2;
            suffixArray[i] = mul2;

        }
        for(int i = 0; i < nums.length; i ++){
            nums[i] = prefixArray[i] * suffixArray[i];
        }
        return nums;


        
    }
}
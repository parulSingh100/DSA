class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [][] num = new int[nums.length][2];
        for(int i = 0; i < nums.length; i++){
            num [i][0] = nums[i];
            num [i][1] = i;
        }
        Arrays.sort(num,(a,b)->a[0]-b[0]);
        
        int left = 0 ;
        int right = nums.length-1;
        for(int i = 0; i < num.length; i++){
            int sum = num[left][0] + num[right][0]; 
           if( sum ==target){
            return new int[]{num[left][1], num[right][1]}; 
           }else if (sum < target){
            left++;
           }else{
            right--;
           }

        }
        return new int[]{left, right};
    }
         
        
}

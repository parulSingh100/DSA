class Solution {
    public boolean canJump(int[] nums) {
        int fathrest = 0;
        for(int i =0; i < nums.length; i++){
            if(i > fathrest){
                return false;
            }
            fathrest = Math.max(fathrest, i + nums[i]);
        }
        return true;
        
    }
}
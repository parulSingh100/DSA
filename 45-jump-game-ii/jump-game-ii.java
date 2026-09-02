class Solution {
    public int jump(int[] nums) {
        int currentPosition = 0;
        int jump = 0;
        int fatherest = 0;
        for(int i = 0; i < nums.length-1; i++){
            fatherest = Math.max(fatherest , i + nums[i]);
            
            if(i== currentPosition){
                jump++;
                currentPosition = fatherest;
            }
            
            
            
        }
    return jump;    
    }
}
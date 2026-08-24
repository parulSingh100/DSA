class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 0;
        int length = 0;
        HashSet<Integer> set = new HashSet<>();
        if(nums.length==0){
            return 0;
        }
        
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        for(int num : set){
            
            if(!set.contains(num-1)){
                length = 1;
                while(set.contains(num+1)){
                    length++;
                    num = num + 1;
                }
            }
            count = Math.max(count, length);

        }
        return count;
        
    }
}
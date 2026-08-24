class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                index = Math.abs(i - map.get(nums[i]));
                if(index<=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
        
    }
}
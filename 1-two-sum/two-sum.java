class Solution {
    public int[] twoSum(int[] nums, int target) {
        int requiredNumber = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int  i = 0; i < nums.length; i++){
            requiredNumber = target - nums[i];
            if(map.containsKey(requiredNumber)){
            return new int []{i, map.get(requiredNumber) };
        }
        map.put(nums[i], i);
        
        }
     return new int []{};   
    }
    
    
}
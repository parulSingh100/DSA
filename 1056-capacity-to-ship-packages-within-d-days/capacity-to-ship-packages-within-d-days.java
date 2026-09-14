class Solution {
    public boolean isPossible(int mid,int [] weights, int days){
        int load = 0;
        int d = 1;
        for(int i = 0; i < weights.length; i++){
            if(load + weights[i]<= mid){
                load = load + weights[i];
                
            }else{
                load = weights[i];
                d++;
        }
        }
    if(d>days){
        return false;
    }else{
        return true;
    }    
    }
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int totalWeight = 0;
        for(int i = 0; i < weights.length; i++){
            totalWeight+= weights[i];
            if(max<weights[i]){
                max = weights[i];
            }
        }
        int left = max;
        int target = 0;
        int right = totalWeight;
        while(left<=right){
        int mid = left + (right - left)/2;
        if(isPossible(mid, weights,days)==true){
            target = mid;
            right = mid - 1;
        }else{
            left = mid + 1;
        }
        
      }
      return target;   
    }
}
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for(int i = 0; i < piles.length; i++){
            if(piles[i]>max){
                max = piles[i];
            }
        }
        
        int left = 1;
        int right = max;
        int answer = 0;
        while(left<=right){
            int mid = left + (right - left)/2;
            int totalTime = 0;
            for(int i = 0; i < piles.length; i++){
                totalTime += Math.ceil((double)piles[i]/mid);
            }
            if(totalTime<=h){
                answer = mid;
                right = mid - 1;    
            }
            else{
                left = mid + 1;
            }
            
        }
    return answer;    
    }
}
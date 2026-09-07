class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        int count = 0;
        
        Arrays.sort(s);
        Arrays.sort(g);
        int j = 0;
        for(int i = 0;  i < s.length&& j<g.length; i++){
            if(s[i]>=g[j]){
                count++;
                j++;
            }
            
            
            
        }
        return count;
    }
}
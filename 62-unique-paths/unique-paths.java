class Solution {
    public int path(int row, int col, int m, int n, int [][] dp){
        if(row == m + 1 || col == n + 1){
            return 0;
        }
        if(row == m || col == n){
            return 1;
        }
        if(dp[row][col]!= -1){
            return dp[row][col];
        }
        dp[row][col] = path(row + 1, col, m, n, dp) + path(row, col +1, m , n, dp);
        return dp[row][col];
    }
    
    public int uniquePaths(int m, int n) {
        int [][] dp = new int[m][n];
        for(int i = 0; i <m; i++){
            Arrays.fill(dp[i], -1);
        }
        
        return path(1, 1, m, n,dp);
    }
}
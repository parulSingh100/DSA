class Solution {
    public static int path(int i, int j, int m, int n,int [][] dp){
        if(i>m || j> n){
            return 0;
        }
        if(i==m || j==n){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        dp[i][j] = path(i + 1, j, m, n, dp) + path(i , j+1, m, n, dp);
        return dp[i][j];
    }
    public int uniquePaths(int m, int n) {
        int [][] dp = new int[m][n];
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                dp[i][j] = -1;
            }
        }
        return path(1,1, m, n, dp);

        
        
    }
}
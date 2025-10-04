// Last updated: 10/4/2025, 10:00:30 PM
class Solution {
    public int uniquePaths(int m, int n) {

        int dp[][]=new int[m][n];
        return solve(0,0,m,n,dp); 
    }

    public static int solve(int cr,int cc,int m,int n,int dp[][]){

        if(cc>=n|| cr>=m) return 0;
        if(cr==m-1&& cc==n-1) return 1;

        if(dp[cr][cc]!=0) return dp[cr][cc];

        int h=solve(cr,cc+1,m,n,dp);
        int l=solve(cr+1,cc,m,n,dp);
        dp[cr][cc]=h+l;
        return dp[cr][cc];

    }


}
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;++i){
            Arrays.fill(dp[i],-1);
        }
        return helper(n,m,text1,text2,dp);
    }
    public int helper(int i, int j, String text1, String text2,int [][]dp){
        if(i==0 || j==0){
            dp[i][j]=0;
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(text1.charAt(i-1)==text2.charAt(j-1)){
            dp[i][j]=1+helper(i-1,j-1,text1,text2,dp);
            return dp[i][j];
        }else{
            int a=helper(i-1,j,text1,text2,dp);
            int b=helper(i,j-1,text1,text2,dp);
            dp[i][j]=Math.max(a,b);
            return dp[i][j];
        }
    }
}
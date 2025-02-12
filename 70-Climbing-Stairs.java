class Solution {
    public int climbStairs(int n) {
        // int [] dp=new int[n+1];
        // Arrays.fill(dp,-1);
        // return memorization(n,dp);
        if(n<=2)return n;
        int prev1=2;
        int prev2=1;
        for(int i=3;i<=n;++i){
            int a=prev1+prev2;
            prev2=prev1;
            prev1=a;
        }
        return prev1;

    }
    // public int memorization(int n, int [] dp){
    //     if(n<=2){
    //         return n;
    //     }
    //     if(dp[n]!=-1){
    //         return dp[n];
    //     }
    //     dp[n]=memorization(n-1,dp)+memorization(n-2,dp);
    //     return dp[n];
    // }
}
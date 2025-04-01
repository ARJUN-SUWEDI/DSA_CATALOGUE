class Solution {
    Long[] dp;
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        dp = new Long[n];
        return solve(questions, 0);
    }
    private long solve(int[][] arr, int i){
        if(i>=arr.length)
            return 0;
        if(dp[i]!=null)
            return dp[i];
        long take = arr[i][0] + solve(arr, i+arr[i][1]+1);
        long notTake = solve(arr, i+1);
        return dp[i] = Math.max(take, notTake);
    }
}
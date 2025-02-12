import java.util.Arrays;

class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[][] = new int[n][amount + 1];
        for (int i = 0; i < n; i++) Arrays.fill(dp[i], -1);
        
        int res = helper(coins, amount, dp, n - 1);
        return res == (int)(1e9) ? -1 : res;
    }

    private int helper(int[] coins, int amount, int[][] dp, int index) {
        if (amount == 0) return 0;
        if (index == 0) return (amount % coins[0] == 0) ? amount / coins[0] : (int)(1e9);
        if (dp[index][amount] != -1) return dp[index][amount];

        int pick = (amount >= coins[index]) ? 1 + helper(coins, amount - coins[index], dp, index) : (int)(1e9);
        int nopick = helper(coins, amount, dp, index - 1);

        return dp[index][amount] = Math.min(pick, nopick);
    }
}

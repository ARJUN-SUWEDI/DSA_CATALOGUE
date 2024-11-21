class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        if (2*k+1 > n) return ans;
        long ws = 0;
        for (int i = 0; i < 2*k+1; i++) ws += nums[i];
        ans[k] = (int)(ws/(2*k+1));
        
        for (int i = k+1; i < n-k; i++) {
            ws += nums[i+k] - nums[i-k-1];
            ans[i] = (int)(ws / (2*k+1));
        }
        
        return ans;
    }
}

class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        
        int maxI = nums[0];  // Track max nums[i] seen so far
        int maxDiff = Integer.MIN_VALUE;  // Track max (nums[i] - nums[j])
        long maxValue = 0; // Track final maximum value
        
        for (int j = 1; j < n - 1; j++) {
            maxDiff = Math.max(maxDiff, maxI - nums[j]); // Best (nums[i] - nums[j])
            maxI = Math.max(maxI, nums[j]); // Update max nums[i] for next rounds

            if (maxDiff > 0) { // Only consider valid (i, j) pairs
                maxValue = Math.max(maxValue, (long) maxDiff * nums[j + 1]);
            }
        }
        
        return maxValue;
    }
}
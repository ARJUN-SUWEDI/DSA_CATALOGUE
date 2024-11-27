class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0; // No subarray can satisfy the condition if k <= 1

        int product = 1, count = 0;
        int start = 0;

        for (int end = 0; end < nums.length; end++) {
            product *= nums[end];
            
            while (product >= k) {
                product /= nums[start];
                start++;
            }
            
            count += (end - start + 1);
        }

        return count;
    }
}

class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums[0] < k) {
            return -1;
        }

        int result = 0;
        int prev = nums[nums.length - 1];
        for(int i = nums.length - 1; i >= 0; i--) {
            if(prev != nums[i]) {
                result++;
                prev = nums[i];
            }
        }

        if(nums[0] > k) {
            result++;
        }

        return result;
    }
}
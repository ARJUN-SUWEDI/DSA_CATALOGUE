class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxRes = nums[0], minRes = nums[0], maxEnding = nums[0], minEnding = nums[0];

        for(int i = 1; i < nums.length; i++){
            maxEnding = Math.max(maxEnding + nums[i], nums[i]);
            minEnding = Math.min(minEnding + nums[i], nums[i]);

            maxRes = Math.max(maxEnding, maxRes);
            minRes = Math.min(minEnding, minRes);
        }
        return Math.max(Math.abs(maxRes), Math.abs(minRes));
    }
}
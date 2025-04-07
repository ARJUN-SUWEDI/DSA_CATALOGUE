class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 == 1) {
            return false;
        }
        Boolean [][] sumPartitions = new Boolean[nums.length][sum / 2 + 1];
        return findPartitions(nums, 0, 0, sum, sumPartitions);
    }

    private boolean findPartitions(int[] nums, int index, int currentSum, int totalSum, Boolean[][] sumPartitions) {
        if (index == nums.length || currentSum > totalSum / 2) {
            return false;
        }
        if (sumPartitions[index][currentSum] == null) {
            sumPartitions[index][currentSum] = false;
            // pick
            int nextSum = currentSum + nums[index];
            if (nextSum == totalSum / 2) {
                sumPartitions[index][currentSum] = true;
                return true;
            } else {
                sumPartitions[index][currentSum] = findPartitions(nums, index  + 1, nextSum, totalSum, sumPartitions);
            }
            // skip
            if (!sumPartitions[index][currentSum]) {
                sumPartitions[index][currentSum] = findPartitions(nums, index + 1, currentSum, totalSum, sumPartitions);
            }
        }
        return sumPartitions[index][currentSum];
    }
}
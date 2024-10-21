class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int p1 = 0; // Pointer for even indices
        int p2 = 1; // Pointer for odd indices
        int n = nums.length;

        while (p1 < n && p2 < n) {
            if (nums[p1] % 2 != 0 && nums[p2] % 2 == 0) {
                int temp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
            }

            if (nums[p1] % 2 == 0) {
                p1 += 2;
            }

            if (nums[p2] % 2 != 0) {
                p2 += 2;
            }
        }

        return nums;
    }
}

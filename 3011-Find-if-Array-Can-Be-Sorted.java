class Solution {
    public boolean canSortArray(int[] nums) {
        boolean swapped;

        
        for (int j = 0; j < nums.length - 1; j++) {
            swapped = false;

            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    
                    if (count(nums[i]) == count(nums[i + 1])) {
                        nums[i]=nums[i]^nums[i+1];
                        nums[i+1]=nums[i]^nums[i+1];
                        nums[i]=nums[i]^nums[i+1];
                        swapped = true;
                    }
                }
            }
            if (!swapped) {
                break;
            }
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }
    public int count(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

}

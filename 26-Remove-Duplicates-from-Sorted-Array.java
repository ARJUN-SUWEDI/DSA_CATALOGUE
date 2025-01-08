class Solution {
    public int removeDuplicates(int[] nums) {
        int idx=1;
        int j=1;
        while(idx<nums.length){
            if(nums[idx-1]!=nums[idx]){
                nums[j]=nums[idx];
                j++;
            }
            idx++;
        }
        return j;
    }
}
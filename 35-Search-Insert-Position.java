class Solution {
    public int searchInsert(int[] nums, int target) {
        int j=1;
        int c=0;
        for(int i=0;i<nums.length-1;++i){
            if(nums[i]==target){
                return i;
            }
            if(nums[j-1]<target && nums[j]>target){
                c=j;
            }
            j++;
        }
        if(target==nums[nums.length-1]){
            return nums.length-1;
        }
        if(target>nums[nums.length-1]){
            return nums.length;
        }
        
        return c;
    }
}
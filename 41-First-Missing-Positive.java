class Solution {
    public int firstMissingPositive(int[] nums) {
        int idx=0;
        int c=1;
        while(idx<nums.length){
            int curr=nums[idx]-1;
            if(nums[idx]>0 && nums[idx]<=nums.length && nums[idx]!=nums[curr]){
                nums[idx]=nums[idx]^nums[curr];
                nums[curr]=nums[idx]^nums[curr];
                nums[idx]=nums[idx]^nums[curr];
            }
            else{
                idx++;
            }
        }
        for(int i=0;i<nums.length;++i){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
}
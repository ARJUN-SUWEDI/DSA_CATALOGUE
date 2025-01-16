class Solution {
    public int findDuplicate(int[] nums) {
        int idx=0;
        int n= nums.length;
        while(idx<n){
            if(nums[idx]!=idx+1){
                int curr=nums[idx]-1;
                if(nums[idx]!=nums[curr]){
                    nums[idx]=nums[idx]^nums[curr];
                    nums[curr]=nums[idx]^nums[curr];
                    nums[idx]=nums[idx]^nums[curr];
                }
                else{
                    return nums[idx];
                }
            }
            else{
                idx++;
            }
        }
        return 404;
    }
}
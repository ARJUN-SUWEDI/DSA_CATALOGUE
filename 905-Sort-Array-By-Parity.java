class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while(l<r){
            if(nums[r]%2!=0){
                --r;
                continue;
            }
            if(nums[l]%2==0){
                l++;
                continue;
            }
            else{
                nums[l]=nums[l]^nums[r];
                nums[r]=nums[l]^nums[r];
                nums[l]=nums[l]^nums[r];
            }
        }
        return nums;

    }
}
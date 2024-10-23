class Solution {
    public int findMin(int[] nums) {
        for(int i=1;i<nums.length;++i){
            if(i==nums.length-1){
                if(nums[i]<nums[i-1]&&nums[i]<nums[0]){
                    return nums[i];
                }
            }
            
            else if(nums[i]<nums[i-1]&&nums[i]<nums[i+1]){
                return nums[i];
            }
        }
        return nums[0];
    }
}
class Solution {
    public int findMin(int[] nums) {
        /*for(int i=1;i<nums.length;++i){
            if(i==nums.length-1){
                if(nums[i]<nums[i-1]&&nums[i]<nums[0]){
                    return nums[i];
                }
            }
            
            else if(nums[i]<nums[i-1]&&nums[i]<nums[i+1]){
                return nums[i];
            }
        }
        return nums[0];*/

        int l=0;
        int r=nums.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]>=nums[r]){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return nums[l];
    }
}
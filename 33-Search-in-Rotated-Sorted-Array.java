class Solution {
    public int search(int[] nums, int target) {
        /*int j=0;
        for(int i=1;i<nums.length-1;++i){
            if(nums[i]<nums[i-1] && nums[i]<nums[i+1]){
                j=i;//this will give me the indeex of shorteest element in this scenario;
            }
        }*/
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }

            if(nums[l]<=nums[mid]){
                if(nums[l]<=target && nums[mid]>=target){
                    r=mid-1;;
                }
                else l=mid+1;
            }
            else{
                if(nums[mid]<=target && nums[r]>=target){
                    l=mid+1;
                }
                else r=mid-1;
            }
        }
        return -1;


    }
}
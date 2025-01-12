class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans=new int[nums.length];
        int idx=0;
        int xdi=1;
        for(int i=0;i<nums.length;++i){
            if(nums[i]>0){
                ans[idx]=nums[i];
                idx+=2;
            }
            else{
                ans[xdi]=nums[i];
                xdi+=2;
            }
        }
        return ans;
    }
}
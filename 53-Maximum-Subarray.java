class Solution {
    public int maxSubArray(int[] nums) {
        int ans=Integer. MIN_VALUE;
        int pro=0;
        for(int i=0;i<nums.length;++i){
            pro=Math.max(nums[i],pro+nums[i]);
            if(ans<pro)ans=pro;
        }
        return ans;

    }
}
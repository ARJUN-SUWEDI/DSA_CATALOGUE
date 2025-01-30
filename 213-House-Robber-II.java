class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        return Math.max(helper(nums,0,n-2),helper(nums,1,n-1));

    }
    public int helper(int [] nums,int i,int j){
        int pre2=0;
        int pre1=0;
        for(int x=i;x<=j;++x){
            int c=Math.max(pre1,pre2+nums[x]);
            pre2=pre1;
            pre1=c;
        }
        return pre1;
    }
}
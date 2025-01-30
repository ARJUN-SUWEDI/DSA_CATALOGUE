class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        if(n==2){
            return Math.max(nums[0],nums[1]);
        }
        int pr2=nums[0];
        int pr1=Math.max(pr2,nums[1]);
        for(int i=2;i<n;++i){
            int a=Math.max(pr1,pr2+nums[i]);
            pr2=pr1;
            pr1=a;
        }
        return pr1;
    }
}
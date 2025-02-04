class Solution {
    public int maxAscendingSum(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int ans=0;
        int prev=nums[0];
        for(int i=1;i<nums.length;++i){

            if(nums[i-1]<nums[i]){
                prev+=nums[i];
            }
            else{
                ans=Math.max(ans,prev);
                prev=nums[i];
            }
        }
        return ans>prev?ans:prev;
    }
}
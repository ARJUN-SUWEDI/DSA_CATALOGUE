class Solution {
    public int maxSubArray(int[] nums) {
        /*int cm=nums[0];
        int m=nums[0];
        for(int i=1;i<nums.length;++i){
            cm=max(nums[i],cm+nums[i]);
            m=max(m,cm);
        }
        return m;*/
        int sum=0;
        int max=nums[0];
        for(int i=0;i<nums.length;++i){
            sum+=nums[i];
            max=sum>max?sum:max;
            if(sum<0){
                sum=0;
            }
        }
        return max;

    }
}
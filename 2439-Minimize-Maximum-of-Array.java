class Solution {
    public int minimizeArrayValue(int[] nums) {
        long sum=0,r=0;
        for(int i=0;i<nums.length;++i){
            sum+=nums[i];
            r=Math.max(r,(sum+i)/(i+1) );
        }
        return (int)r;
    }
}
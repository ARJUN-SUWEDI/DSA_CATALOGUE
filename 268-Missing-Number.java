class Solution {
    public int missingNumber(int[] nums) {
        int a=nums.length;
        int n=((a*a)+a)/2;
        int sum=0;
        for(int i=0;i<nums.length;++i){
            sum=sum+nums[i];
        }
        return n-sum;
    }
}
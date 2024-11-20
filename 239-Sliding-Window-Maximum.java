class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int[] ans=new int[nums.length-k+1];
        for(int i=0;i<nums.length;++i){
            if(i%k==0)left[i]=nums[i];
            else{
                left[i]=Math.max(left[i-1],nums[i]);
            }
        }
        for(int i=nums.length-1;i>=0;--i){
            if(i%k==0 || i==nums.length-1)right[i]=nums[i];
            else{
                right[i]=Math.max(right[i+1],nums[i]);
            }
            
        }
        for(int i=0;i<ans.length;++i){
            ans[i]=Math.max(right[i],left[i+k-1]);
        }
        return ans;

    }
}
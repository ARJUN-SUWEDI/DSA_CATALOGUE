class Solution {
    public long maximumTripletValue(int[] nums) {
        long res=0;
        int left =0;
        for(int j =1;j<nums.length;j++){
            for(int k =j+1;k<nums.length;k++){
                long val = ((long)(nums[left]-nums[j]) * nums[k]*1L);
                res= Math.max(res, val);
                if(nums[left]<nums[j]) left = j;
            }
        }
        return res;
    }
}
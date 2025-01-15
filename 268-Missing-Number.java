class Solution {
    public int missingNumber(int[] nums) {
        // int idx=0;
        // while(idx<nums.length){
        //     int correct=nums[idx];
        //     if(nums[idx]<nums.length && nums[idx] != nums[correct]){
        //         nums[idx]=nums[idx]^nums[correct];
        //         nums[correct]=nums[idx]^nums[correct];
        //         nums[idx]=nums[idx]^nums[correct];
        //     }else{
        //         idx++;
        //     }
        // }
        // for(int i=0;i<nums.length;++i){
        //     if(nums[i]!=i){
        //         return i;
        //     }
        // }
        // return nums.length;

        int xorA=0;
        int xorB=0;
        int n=nums.length;
        for(int i=0;i<=n;++i){
            xorA^=i;
            if(i<n){
                xorB^=nums[i];
            }
        }
        
        return xorA^xorB;
    }
}
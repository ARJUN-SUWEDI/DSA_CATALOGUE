class Solution {
    public int findDuplicate(int[] nums) {
        /*Arrays.sort(nums);
        for(int i=0;i<nums.length-1;++i){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return nums[0];*/
        boolean arr[]=new boolean[nums.length];
        for(int n:nums){
            if(arr[n]){
                return n;
            }
            arr[n]=true;
        }
        return 404;

    }
}
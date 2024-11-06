class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0;i<k;++i){
            int c=min(nums);
            nums[c] = (int)((long)nums[c] * multiplier);
        }
        return nums;
    }
    public static int min(int[] arr){
        int m=Integer. MAX_VALUE ;
        int j=0;
        for(int i=0;i<arr.length;++i){
            if(arr[i]<m){m=arr[i];j=i;}
        }
        return j;
    }
}
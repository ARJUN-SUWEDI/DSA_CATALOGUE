class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        for(int i=0;i<k;++i){
            int a=min(nums);
            nums[a]=-nums[a];
        }
        int a=0;
        for(int i=0;i<nums.length;++i){
            a+=nums[i];
            
        }
        return a;
    }
    public static int min(int[] a){
        int m=101;
        int j=0;
        for(int i=0;i<a.length;++i){
            if(a[i]<m){
                m=a[i];
                j=i;
            }
        }
        return j;
    }
    
}
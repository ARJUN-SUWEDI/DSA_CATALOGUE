class Solution {
    public int countGoodTriplets(int[] nums, int a, int b, int c) {
        
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int abs1 = Math.abs(nums[i]-nums[j]);
                if(abs1<=a){
                    for(int k=j+1;k<n;k++){
                        int abs2 = Math.abs(nums[j]-nums[k]);
                        int abs3 = Math.abs(nums[i]-nums[k]);
                        if(abs2<=b && abs3<=c)count++;
                    }   
                }
            }
        }
        return count;
    }
}
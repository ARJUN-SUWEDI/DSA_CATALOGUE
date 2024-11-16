class Solution {
    public int[] resultsArray(int[] nums, int k) {

        int res[]=new int[nums.length-k+1];
        int f=0;
        if(k==1)
            return nums;
        
        for(int i=0;i<res.length;i++)
        {
            int j=i+1;
            while(j<i+k)
            {
                if(nums[j-1]+1==nums[j])
                    f=nums[j];
                else
                {
                    f=0;
                    break;
                }
                j++;
            }
            res[i]=f!=0?f:-1;
        }
        return res;
    }
}
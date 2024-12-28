class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        int n = nums.size();
        if(n == 0)
            return -1;
        vector<int> prefix_sum(n,0);
        prefix_sum[0]=nums[0];
        for(int i=1;i<n;++i){
            prefix_sum[i]=prefix_sum[i-1]+nums[i];
        }
        for(int i=0;i<n;++i){
            int l=(i==0)?0:prefix_sum[i-1];
            int r=prefix_sum[n-1] - prefix_sum[i];
            if(r==l){
                return i;
            }
        }
        return -1;
    }
};
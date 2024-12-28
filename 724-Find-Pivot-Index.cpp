class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        int n = nums.size();
        if(n == 0)
            return -1;
        vector<int>Prefix(n,0);
        Prefix[0] = nums[0];

        for(int i=1;i<n;i++){
            Prefix[i] = Prefix[i-1] + nums[i];
        }

        for(int i=0;i<n;i++){
            int left = (i == 0)? 0: Prefix[i-1];
            int right = Prefix[n-1] - Prefix[i];
            if(left == right){
                return i;
            }
        }
        return -1;
    }
};
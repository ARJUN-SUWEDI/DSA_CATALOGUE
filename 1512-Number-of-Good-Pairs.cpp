class Solution {
public:
    int f(int x, vector<int>& nums){
        int c=0;
        for(int i=0;i<x;++i){
            if(nums[i]==nums[x]){
                c++;
            }
        }
        return c;
    }
    int numIdenticalPairs(vector<int>& nums) {
        int ans=0;
        for(int x=0;x<nums.size();++x){
            ans+=f(x,nums);
        }
        return ans;
    }

};
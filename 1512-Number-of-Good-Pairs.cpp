class Solution {
public:
    /* frugal n^2 approach
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
    }*/
    /*O(n) approach*/
    int numIdenticalPairs(vector<int>& nums) {
        int ans=0;
        int count[101]={0};
        for(int i=0;i<nums.size();++i){
            ans+=count[nums[i]];
            count[nums[i]]+=1;
        }
        return ans;
    }

};
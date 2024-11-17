class Solution {
    public int shortestSubarray(int[] nums, int k) {
        long s[]=new long[nums.length+1];
        for(int i=0;i<nums.length;i++){
            s[i+1]=s[i]+nums[i];
        }
        int q[]=new int[nums.length+1];
        int l=0;
        int r=0;
        int m=nums.length+1;
        for(int i=0;i<s.length;i++){
            while(r>l && s[i]>=s[q[l]]+k){
                m=Math.min(m,i-q[l]);
                l++;
            }
            while(r>l && s[i]<=s[q[r-1]]){
                r--;
            }
            q[r]=i;
            r++;
        }
        if(m<=nums.length) return m;
        else return -1;
        
    }
}
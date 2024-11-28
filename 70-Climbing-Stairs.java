class Solution {
    public int climbStairs(int n) {
        int[] d_p=new int[n+1];
        if(n==1){
            return 1;
        }
        d_p[1]=1;
        d_p[2]=2;
        for(int i=3;i<=n;++i){
            d_p[i]=d_p[i-1] + d_p[i-2];
        }
        return d_p[n];
    }
}
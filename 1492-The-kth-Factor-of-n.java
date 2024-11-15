class Solution {
    public int kthFactor(int n, int k) {
        int index=0;
        int duple=k;
        int count=0;
        for(int i=1;i<=n;++i){
            if(k==0){
                return index;
            }
            if(n%i==0){
                k--;
                count++;
                index=i;
            }
        }
        return count<duple?-1:index;
    }
}
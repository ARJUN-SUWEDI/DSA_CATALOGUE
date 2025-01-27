class Solution {
    public int maxScore(int[] arr, int k) {
        int i=0;
        int ans=Integer.MIN_VALUE;
        int sum=0;
        int n=arr.length;
        if(arr.length==k){
            for(int j=0;j<n;++j){
                sum+=arr[j];
            }
            return sum;
        }
        while(i<k){
            sum+=arr[i];
            ++i;
        }
        ans=Math.max(ans,sum);
        k=k-1;
        while(k>=0){
            sum=sum-arr[k]+arr[--n];
            ans=Math.max(ans,sum);
            --k;
        }
        return ans;
    }
}
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] arr=new int[51];
        int c=0;
        int[] ans=new int[A.length];
        for(int i=0;i<A.length;++i){
            if(++arr[A[i]]%2==0){
                c++;
            }
            if(++arr[B[i]]%2==0){
                c++;
            }
            ans[i]=c;
        }
        return ans;
    }
}
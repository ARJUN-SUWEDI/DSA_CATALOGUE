class Solution {
    public int numOfSubarrays(int[] arr) {
        int p = 0;
        int pp = 0;
        int lidx = -1;
        long res = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                res += p;
            }else{
                int curr = i - lidx + pp;
                pp = p;
                p = curr;
                res += curr;
                lidx = i;
            }
        }
        return (int)(res % ((int)1e9 + 7));
    }
}
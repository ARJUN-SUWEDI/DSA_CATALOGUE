class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int ans=0;
        int count=0;
        for(int i=0;i<arr.length;++i){
            if(arr[i]==1){
                count++;
            }
            else{
                ans=Math.max(ans,count);
                count=0;
            }
        }
        return Math.max(ans,count);
    }
}
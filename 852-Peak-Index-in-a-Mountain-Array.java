class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        /*int i=0;
        for(i=1;i<arr.length;++i){
            if(i!=arr.length-1){
                if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                    return i;
                }
            }
        }
        return i;*/
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(arr[mid]<arr[mid+1]){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return l;
    }
}
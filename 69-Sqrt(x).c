int mySqrt(int x) {
    if(x<2){
            return x;
        }
        int l=0;
        int r=x;
        int res=0;
        while(l<=r){
            int mid=l + (r-l)/2;
            if(mid<=x/mid){
                res=mid;
                l=mid+1;
            }
            else {
                r=mid-1;
            }
        }
        return res;
}
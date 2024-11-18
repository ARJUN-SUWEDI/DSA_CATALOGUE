class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) {
            return -1;
        }
        int left=1;
        int right=0;
        for(int i:bloomDay)right=right>i?right:i;
        while(left<right){
            int mid=left + ((right-left)/2);
            if(can_make_bouquet(m, k , mid, bloomDay)){
                right=mid;
            }
            else left=mid+1;
        }
        return left;  
    }
    public boolean can_make_bouquet(int m, int k, int mid, int []arr){
        int f=0;
        int b=0;
        for(int i:arr){
            if(i<=mid){
                f++;
                if(f==k){
                    f=0;
                    b++;
                    if(b>=m)return true;
                }
            }
            else f=0;
        }
        return b>=m;
    }
}
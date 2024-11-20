class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int lm=height[l];
        int rm=height[r];
        int water=0;
        while(l<r){
            if(lm<rm){
                l++;
                lm=lm>height[l]?lm:height[l];
                water=water+lm-height[l];
            }
            else{
                r--;
                rm=rm>height[r]?rm:height[r];
                water=water+rm-height[r];
            
            }
        }
        return water;
    }
}
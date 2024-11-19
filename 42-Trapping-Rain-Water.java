class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int lm=height[left];
        int rm=height[right];int water=0;
        while(left<right){
            if(lm<rm){
                left++;
                lm=lm>height[left]?lm:height[left];
                water=water+lm-height[left];
            }
            else{
                right--;
                rm=rm>height[right]?rm:height[right];
                water=water+rm-height[right];
            }
        }
        return water;
    }
}
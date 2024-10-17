class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int result=0;
        int area=0;
        while(start<end){
            int width=end-start;
            int h=Math.min(height[start],height[end]);
            area=width*h;
            result=Math.max(area, result);

            if(height[start]<height[end]){
                start++;
            }
            else end--;
        }
        return result;
    }
}
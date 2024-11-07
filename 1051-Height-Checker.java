class Solution {
    public int heightChecker(int[] heights) {
        int c=0;
        int[] h = Arrays.copyOf(heights, heights.length);
        Arrays.sort(h);
        for(int i=0;i<heights.length;++i){
            if(h[i]!=heights[i])c++;
        }

        return c;
    }
}
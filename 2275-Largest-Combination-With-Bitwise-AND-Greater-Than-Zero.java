class Solution {
    public int largestCombination(int[] candidates) {
        int count=0;
        int max=0;
        for(int i=0;i<24;++i){
            count=0;
            for(int j=0;j<candidates.length;++j){
                if((candidates[j]&(1<<i))!=0){
                    count++;
                }
            }
            max=m(count,max);
        }
        return max;

    }
    public static int m(int n, int f){
        if(n>f){
            return n;
        }
        return f;
    }
}
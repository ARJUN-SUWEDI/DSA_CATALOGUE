class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int[] account : accounts){
            int c_sum = 0 ;
            for(int a : account){
                c_sum += a;
            }
            max=(max>c_sum)?max:c_sum;
        }
        return max;
    }
}
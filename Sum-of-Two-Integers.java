class Solution {
    public int getSum(int a, int b) {
        int x=a^b;
        int c=a&b;
        return c==0?x:getSum(x,c << 1);
    }
}
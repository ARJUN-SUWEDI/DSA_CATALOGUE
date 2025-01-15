class Solution {
    public int minimizeXor(int num1, int num2) {
        int bitsNums2 = Integer.bitCount(num2);
        int bitsNums1 = Integer.bitCount(num1);
        int res = 0;
    
        if (bitsNums1>=bitsNums2) {
            for (int i=31; i>=0 && bitsNums2>0;i--) {
                if((num1&(1<<i))!=0) {
                    res|=(1<<i);
                    bitsNums2--;
                }
            }
        } else {
            res=num1;
            bitsNums2-=bitsNums1;
            for (int i=0;i<32 && bitsNums2>0;i++) {
                if ((res&(1<<i))==0) {
                    res|= (1<<i);
                    bitsNums2--;
                }
            }
        }
        return res;
    }
}
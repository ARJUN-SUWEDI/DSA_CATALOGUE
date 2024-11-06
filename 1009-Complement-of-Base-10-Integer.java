class Solution {
    public int bitwiseComplement(int n) {
        int a=0,mul=1;
        if(n==0)return 1;
        while(n!=0){
            int rem=n%2;
            rem^=1;
            n/=2;
            a=a+rem*mul;
            mul*=2;
        }
        return a;
    }
}
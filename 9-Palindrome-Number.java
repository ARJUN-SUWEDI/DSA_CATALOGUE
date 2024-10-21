class Solution {
    public boolean isPalindrome(int x) {
        /*int a=x;
        int d=0;
        if(x<0){
            return false;
        }
        while(x>0){
            int digit=x%10;
            d=d*10 +digit;
            x=x/10;
        }
        return d==a;*/
        if(x<0){
            return false;
        }
        if(x>-1 && x<10){
            return true;
        }
        if(x%10==0){
            return false;
        }
        int rem=0;
        while(x>rem){
            rem=rem*10 + x%10;
            x=x/10;
        }
        return (x==rem || x==rem/10);
    }
}
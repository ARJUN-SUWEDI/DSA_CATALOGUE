class Solution {
    public boolean canWinNim(int n) {
        if(n==1){
            return true;
        }
        if(n%2==0){
            int a=n/2;
            if(a%2==0){
                return false;
            }
            else return true;
        }

        if(n%3==0){
            int a=n/3;
            if(a%2==0){
                return false;
            }
            else return true;
        }
        return true;
    }
}
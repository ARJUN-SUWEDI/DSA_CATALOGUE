class Solution {
    public boolean checkPowersOfThree(int n) {
        
        int r=0;
        while(n>0){
            r = n%3;
            n = n/3;

            if(r==2) return false;
        }

        return true;
    }
}
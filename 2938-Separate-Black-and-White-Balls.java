class Solution {
    public long minimumSteps(String s) {

        long c=0;
        long st=0;
        int n=s.length();
        for(int i=0;i<n;++i){
            if(s.charAt(i)=='1')c++;
            else st+=c;
        }
        if(n==c)return 0;
        return st;
    }
}
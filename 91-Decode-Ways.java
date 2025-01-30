class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        int cache[]=new int[n+1];
        cache[n]=1;
        for(int i=n-1;i>=0;--i){
            if(s.charAt(i)=='0'){
                cache[i]=0;
            }
            else{
                int f=cache[i+1];
                int ss=0;
                if(i<=(n-2)){
                    int no = (s.charAt(i)-'0')*10 + (s.charAt(i+1)-'0');
                    if(no<=26){
                        ss=cache[i+2];
                    }
                }
                cache[i]=f+ss;
            }
            
        }
        return cache[0];
    }
}
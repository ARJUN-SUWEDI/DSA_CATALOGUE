class Solution {
    public void reverseString(char[] s) {
        int p2=s.length-1;
        for(int i=0;i<s.length/2;++i){
            char temp=s[i];
            s[i]=s[p2];
            s[p2]=temp;
            p2--;
        }
    }
}
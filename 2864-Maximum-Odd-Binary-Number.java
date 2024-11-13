class Solution {
    public String maximumOddBinaryNumber(String s) {
        String output="";
        int index=0;
        int c=0;
        while(index<s.length()){
            if(s.charAt(index)=='1'){
                c++;
                if(c>1){
                    output+="1";
                }
            }
            
            ++index;
        }
        return addzero(output,output.length(),s.length());
    }
    public static String addzero(String ss, int st, int e){
        for(int i=st; i<e-1;++i){
            ss+="0";
        }
        return ss+"1";
    }
}
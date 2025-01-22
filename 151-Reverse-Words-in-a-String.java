class Solution {
    public String reverseWords(String s) {
        String ans[]=s.trim().split("\\s+");
        String dummy[]=new String[ans.length];
        int z=ans.length-1;
        for(int i=0;i<ans.length;++i){
            dummy[z]=ans[i];
            z--;
        }
        String a=String.join(" ",dummy);
        return a;
    }
}
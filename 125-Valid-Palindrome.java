class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll(\[^a-zA-Z0-9]\, \\);
        s = s.toLowerCase();
        char[] charArray = s.toCharArray();
        
        int p2=charArray.length-1;
        int i=0;
        for(i=0;i<charArray.length/2;++i){
            if(charArray[i]==charArray[p2]){p2--;continue; }
            else break;
        }
        if(i==charArray.length/2){
            return true;
        }
        else return false;

        
    }
}
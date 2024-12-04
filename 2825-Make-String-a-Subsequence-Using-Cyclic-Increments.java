class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int point2 = 0;
        for(int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(point2);
            if(c2 == c1 || c2 == c1 + 1 || (c1 == 'z' && c2 == 'a')) {
                point2 ++;
                if(point2 >= str2.length()) return true;
            }
        }
        return false;
    }
}
class Solution {
    public long countOfSubstrings(String word, int k) {
        return atleastK(word,k) - atleastK(word,k+1);
    }

    public long atleastK(String word, int k){
        int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0, charCount = 0;

        long subStrCount = 0;

        int left = 0, right = 0;
        char ch;

        while(right < word.length() || left < word.length()){
            if(charCount >= k && checkVowel(aCount, eCount , iCount, oCount,uCount)){
                subStrCount += word.length() - right + 1;
                ch = word.charAt(left++);

                if(ch == 'a') aCount--;
                else if(ch == 'e') eCount--;
                else if(ch == 'i') iCount--;
                else if(ch == 'o') oCount--;
                else if(ch == 'u') uCount--;
                else charCount--;
            }
            else{
                if(right == word.length()) break;

                ch = word.charAt(right++);
                if(ch == 'a') aCount++;
                else if(ch == 'e') eCount++;
                else if(ch == 'i') iCount++;
                else if(ch == 'o') oCount++;
                else if(ch == 'u') uCount++;
                else charCount++;
            }

            
        }
        return subStrCount;
    }

    public boolean checkVowel(int aCount, int eCount, int iCount, int oCount,int uCount){
        if(aCount > 0 && eCount > 0 && iCount > 0 && oCount > 0 && uCount > 0){
            return true;
        }

        return false;
    }
}
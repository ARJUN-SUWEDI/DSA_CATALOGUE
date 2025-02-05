class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        if(s1.equals(s2)) return true;

        char[] s1ToArray = s1.toCharArray();
        char[] s2ToArray = s2.toCharArray();

        Arrays.sort(s1ToArray);
        Arrays.sort(s2ToArray);

        if(!Arrays.equals(s1ToArray, s2ToArray)) return false;

        int count = 0;
        for(int i = 0, j = 0; i < s1.length() && j < s2.length(); i++, j++) {
            if(s1.charAt(i) != s2.charAt(j)) count++;
        }

        return count == 2;
    }
}
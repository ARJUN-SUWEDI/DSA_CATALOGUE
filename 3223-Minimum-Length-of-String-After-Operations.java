class Solution {
    public int minimumLength(String s) {
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            freq[idx]++;
        }
        int ans = 0;
        for (int ele : freq) {
            if (ele % 2 == 0 && ele != 0) {
                ans += 2;
            } else if (ele != 0)
                ans += 1;
        }
        return ans;
    }
}
class Solution {
    public int numberOfSubstrings(String s) {
        int[] count = new int[3]; // count[0]=a, count[1]=b, count[2]=c
        int left = 0, result = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'a']++; // Update count for current char

            // Check if all a, b, and c are present in current window
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                // For each such valid window, all substrings till end are valid
                result += s.length() - right;

                // Try to shrink the window from left
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return result;
    }
}
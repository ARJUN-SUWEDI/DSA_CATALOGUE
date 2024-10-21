class Solution {
    public int strStr(String haystack, String needle) {
        // Check if the needle is an empty string
        if (needle.isEmpty()) {
            return 0; // Return 0 if the needle is empty
        }

        int m = haystack.length(); // Fixed typo here
        int n = needle.length();

        // If the haystack and needle have the same length, compare them directly
        if (m == n) {
            if (haystack.equals(needle)) {
                return 0;
            } else {
                return -1;
            }
        }

        // Loop through haystack to find the first occurrence of needle
        for (int i = 0; i <= m - n; ++i) { // Changed to <= to cover full range
            int j = 0;
            // Check each character of needle against haystack
            while (j < n && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            // If the whole needle is found, return the starting index
            if (j == n) {
                return i;
            }
        }

        // Return -1 if the needle is not found in haystack
        return -1;
    }
}


class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] arr = new int[n];
        int lastPosition = -1;

        // Forward pass: find distances to the closest 'c' from left to right
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                lastPosition = i;
                arr[i] = 0; // Distance to itself is zero
            } else if (lastPosition != -1) {
                arr[i] = i - lastPosition; // Distance to the last 'c'
            } else {
                arr[i] = Integer.MAX_VALUE; // No 'c' found yet
            }
        }

        // Backward pass: find distances to the closest 'c' from right to left
        lastPosition = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                lastPosition = i;
            } else if (lastPosition != -1) {
                arr[i] = Math.min(arr[i], lastPosition - i); // Minimum distance to 'c'
            }
        }

        return arr;
    }
}

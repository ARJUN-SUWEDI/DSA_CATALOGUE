class Solution {
    public int[] distributeCandies(int c, int n) {
        int[] arr = new int[n];
        int idx = 0;
        while (c > 0) {
            arr[idx++ % n] += Math.min(idx, c);

            c = Math.max(c - idx, 0);
        }
        return arr;
    }
}
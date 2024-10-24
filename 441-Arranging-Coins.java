class Solution {
    public int arrangeCoins(int n) {
        int l = 0;
        int r = n;
        int ans = 0;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            long coinsUsed = (long) mid * (mid + 1) / 2;

            if (coinsUsed == n) {
                return mid;
            } else if (coinsUsed < n) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return ans;
    }
}

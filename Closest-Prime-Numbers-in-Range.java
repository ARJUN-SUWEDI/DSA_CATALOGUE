class Solution {
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num == 2 || num == 3)
            return true;
        if (num % 2 == 0 || num % 3 == 0)
            return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }
        return true;
    }

    public int[] closestPrimes(int left, int right) {
        List<Integer> list = new ArrayList<>();
        int minGap = Integer.MAX_VALUE;

        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        if (list.size() < 2) {
            return new int[] { -1, -1 };
        }

        int[] ans = new int[] { -1, -1 };
        for (int i = 1; i < list.size(); i++) {
            int diff = list.get(i) - list.get(i-1);
            if (diff < minGap) {
                minGap = diff;
                ans[0] = list.get(i-1);
                ans[1] = list.get(i);

            }
        }
        return ans;
    }
}

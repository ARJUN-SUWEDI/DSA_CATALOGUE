class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c = 0; // Counter for the number of flowers we can place
        int len = flowerbed.length;
        
        // Handle the special case of flowerbed with only one plot
        if (len == 1) {
            if (flowerbed[0] == 0) {
                c++;
            }
            return c >= n;
        }

        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            c++;
        }

        for (int i = 1; i < len - 1; ++i) {
            if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                c++;
            }
        }
        if (flowerbed[len - 1] == 0 && flowerbed[len - 2] == 0) {
            c++;
        }
        return c >= n;
    }
}

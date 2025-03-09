class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int res = 0, count = 0, prev = -1;

        for(int i = 0; i < 2; ++i){
            int len = (i == 0 ? colors.length : k - 1);
            for(int j = 0; j < len; ++j){
                if(prev != colors[j]) ++count;
                else count = 1;
                prev = colors[j];

                if(count >= k) ++res;
            }
        }

        return res;
    }
}
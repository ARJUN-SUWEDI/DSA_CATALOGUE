import java.util.HashMap;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, -1); 
        int cumulativeSum = 0;
        
        for (int i = 0; i < nums.length; ++i) {
            cumulativeSum += nums[i];
            int remainder = cumulativeSum % k;
            if (remainder < 0) {
                remainder += k;
            }

            if (remainderMap.containsKey(remainder)) {
                if (i - remainderMap.get(remainder) > 1) { 
                    return true;
                }
            } else {
                remainderMap.put(remainder, i); 
            }
        }
        return false;
    }
}

class Solution {
public:
    int search(vector<int>& nums, int target) {
        int l = 0;
        int r = nums.size() - 1;
        
        while (l <= r) {
            // Correct midpoint calculation
            int mid = l + (r - l) / 2;
            
            if (nums[mid] == target) {
                return mid; // Target found, return its index
            } else if (nums[mid] < target) {
                l = mid + 1; // Search in the right half
            } else {
                r = mid - 1; // Search in the left half
            }
        }
        
        return -1; // Target not found
    }
};

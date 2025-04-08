// -------------------------------SOLUTION 1----------------------------------------

// Time Complexity	O(n)
// Space Complexity	O(n)

class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        count = checkArray(nums, count);

        return count;
    }
    public int checkArray(int[] nums, int count) {
        Set<Integer> set1 = new HashSet<>();
        int count1 = count;

        for (int i = 0; i < nums.length; i++) {
            set1.add(nums[i]);
        }

        if(set1.size() == nums.length){
            return count;
        }

        if (nums.length < 3 && nums.length > 0) {
            return count1 + 1;
        }

        if (set1.size() != nums.length) {
            int[] newArray = Arrays.copyOfRange(nums, 3, nums.length);
            set1 = new HashSet<>();
            count1++;
            return checkArray(newArray, count1);
        }

        return count;
    }
}



//--------------------------- SOLUTION 2 ------------------------------------

// Time Complexity	O(n^2)
// Space Complexity	O(n)

// class Solution {
//     public int minimumOperations(int[] nums) {
//         int count = 0;
//         count = checkArray(nums, count);

//         return count;

//     }

//     public int checkArray(int[] nums, int count) {
//         int count1 = count;
//         for(int i=0;i<nums.length-1;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i] == nums[j] && nums.length > 2){
//                     int[] newArray = Arrays.copyOfRange(nums, 3, nums.length);
//                     count1++;
//                     return checkArray(newArray, count1++);
//                 }
//                 else if(nums[i] == nums[j] && nums.length < 3){
//                     return count1 + 1;
//                 }
//             }
//         }
//         return count1;
//     }
// }
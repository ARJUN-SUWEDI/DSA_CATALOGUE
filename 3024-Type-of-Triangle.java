class Solution {
    public String triangleType(int[] nums) {
        if((nums[0]+nums[1]>nums[2]) && (nums[1]+nums[2]>nums[0]) && (nums[0]+nums[2]>nums[1])){
            if(nums[0]==nums[1]){
            if(nums[1]==nums[2]){
                return "equilateral";
            }
            else return "isosceles";
            }
            if(nums[1]==nums[2]){
                return "isosceles";
            }
            if(nums[0]==nums[2]){
                return "isosceles";
            }
            else return "scalene";
        }
        else return "none";
        
    }
}
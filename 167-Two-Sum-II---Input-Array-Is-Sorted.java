class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //practiing clean coding
        int left = 0 ;
        int right = numbers.length-1 ;

        //binary search

        while( left < right ){
            int curr_sum = numbers[left] + numbers[right] ;
            if( curr_sum == target ){
                return new int[]{left+1 , right+1 } ;
            }
            else if( curr_sum > target ){
                right -= 1 ;
            }
            else{
                left += 1 ;
            }
        }
        return new int[]{} ;
    }
}
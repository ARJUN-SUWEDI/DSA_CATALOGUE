class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;++i){
            int a = count(nums[i]);
            if(a%2==0)c++;
            else continue;
        }
        return c;
    }
    public static int count(int n){
        int c=0;
        while(n>0){
            n/=10;
            c++;
        }
        return c;
    }
}
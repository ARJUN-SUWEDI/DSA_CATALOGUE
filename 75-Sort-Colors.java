class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int k=0;
        int n=nums.length-1;
        while(i<=n){
            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                i++;
                k++;
            }
            else if(nums[i]==1){
                i++;
            }
            else{
                int temp=nums[i];
                nums[i]=nums[n];
                nums[n]=temp;
                --n;
            }
        }
    }
}
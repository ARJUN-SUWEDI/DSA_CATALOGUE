class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> answer=new ArrayList<>();
        int idx=0;
        while(idx<nums.length){
            int correct=nums[idx]-1;
            if(nums[idx] != nums[correct]){
                nums[idx]=nums[idx]^nums[correct];
                nums[correct]=nums[idx]^nums[correct];
                nums[idx]=nums[idx]^nums[correct];
            }else{
                idx++;
            }
        }
        for(int i=0;i<nums.length;++i){
            if(nums[i]!=i+1){
                answer.add(i+1);
            }
        }
        return answer;

    }
}
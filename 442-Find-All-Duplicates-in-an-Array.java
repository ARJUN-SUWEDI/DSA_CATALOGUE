class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int idx=0;
        int n= nums.length;
        while(idx<n){
            int curr=nums[idx]-1;
            if(nums[idx]!=nums[curr]){
                nums[idx]=nums[idx]^nums[curr];
                nums[curr]=nums[idx]^nums[curr];
                nums[idx]=nums[idx]^nums[curr];
            }else{
                idx++;
            }
        }
        for(int i=0;i<n;++i){
            if(nums[i]!=i+1){
                list.add(nums[i]);
            }
        }
        return list;
    }
}
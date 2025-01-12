class Solution {
    private int[] arr;
    private Random random;
    public Solution(int[] nums) {
        this.arr=nums;
        random = new Random();
    }
    
    public int pick(int target) {
        int idx=-1;
        int count=0;
        for(int i=0;i<arr.length;++i){
            if(arr[i]!=target){
                continue;
            }
            if(random.nextInt(++count)==0){
                idx=i;
            }
        }
        return idx;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max_len=0;
        int sum=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;++i){
            sum+=(nums[i]==0)?1:-1;
            if(map.containsKey(sum)){
                max_len=Math.max(i-map.get(sum),max_len);
            }
            else{
                map.put(sum,i);
            }
        }
        return max_len;
    }
}
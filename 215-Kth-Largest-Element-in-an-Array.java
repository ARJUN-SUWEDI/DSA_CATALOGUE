class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int a=nums.length-k;
        for(int i:nums){
            pq.add(i);
        }
        while(a-->0){
            pq.remove();
        }
        return pq.remove();
    }
}
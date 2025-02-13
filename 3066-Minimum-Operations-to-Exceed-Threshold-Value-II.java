class Solution {
    public int minOperations(int[] nums, int k) {
        int op=0;
        PriorityQueue<Long> pq=new PriorityQueue();
        for(int i: nums){
            pq.offer((long)(i));
        }
        while(pq.peek()<k && pq.size()>1){
            long a=pq.poll();
            long b=pq.poll();
            long c = Math.min(a,b)*2 + Math.max(a,b);
            pq.offer(c);
            op++;
        }
        return op;
    }
}
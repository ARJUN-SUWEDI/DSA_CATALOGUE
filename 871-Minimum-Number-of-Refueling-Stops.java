class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int fl=startFuel;
        int stop=0;
        int prevpos=0;
        for(int[] st:stations){
            fl-=st[0]-prevpos;
            while(fl<0){
                if(pq.isEmpty()){
                    return -1;
                }
                fl+=pq.poll();
                stop++;
            }
            pq.add(st[1]);
            prevpos=st[0];
        }

        fl-=(target-prevpos);
        while(fl<0){
            if(pq.isEmpty()){
                return -1;
            }
            fl+=pq.poll();
            stop++;
        }
        return stop;
    }
}
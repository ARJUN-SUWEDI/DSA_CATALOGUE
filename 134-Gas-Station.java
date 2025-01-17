class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tg=0;
        int tc=0;
        int si=0;
        int cs=0;
        for(int i=0;i<gas.length;++i){
            tg+=gas[i];
            tc+=cost[i];
            cs+=gas[i]-cost[i];
            if(cs<0){
                cs=0;
                si=i+1;
            }
        }
        return tg>=tc?si:-1;
    }
}
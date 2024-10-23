class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int l=1;
        int r=10000000;
        int result=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(check(dist,hour,mid)){
                result=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return result;
    }
    private boolean check(int[] dist, double hour, int speed) {
        double totalTime = 0.0;
        
        for (int i = 0; i < dist.length; i++) {
            double time = (double) dist[i] / speed;
            
            if (i != dist.length - 1) {
                totalTime += Math.ceil(time);
            } else {
                totalTime += time;
            }
        }
        
        return totalTime <= hour; 
    }
}
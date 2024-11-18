class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        Arrays.sort(worker);
        int n=difficulty.length;
        int[][] jobs=new int[n][2];
        for(int i=0;i<n;++i){
            jobs[i][0]=difficulty[i];
            jobs[i][1]=profit[i];
        }

        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, jobs[i][1]);
            jobs[i][1] = maxProfit;
        }
        
        int total = 0;
        int idx = 0;
        for (int ability : worker) {
            while (idx < n && jobs[idx][0] <= ability) {
                idx++;
            }
            if (idx > 0) {
                total += jobs[idx - 1][1];
            }
        }
        
        return total;
    }
}
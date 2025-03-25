class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        List<int[]> xList = new ArrayList<>();
        List<int[]> yList = new ArrayList<>();
        for(int[] r: rectangles){
            xList.add(new int[]{r[0], r[2]});
            yList.add(new int[]{r[1], r[3]});
        }
        Collections.sort(xList, (a, b) -> a[0] - b[0]);
        Collections.sort(yList, (a, b) -> a[0] - b[0]);
        int res = Math.max(nonOverlap(xList), nonOverlap(yList));
        return res >= 3;
    }
    private int nonOverlap(List<int[]> intervals){
        int res = 0;
        int prev = -1;

        for(int[] i: intervals){
            if(prev <= i[0]) res++;
            prev = Math.max(prev, i[1]);
        }
        return res;
    }
}
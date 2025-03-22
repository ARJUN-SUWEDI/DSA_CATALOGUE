class Solution {
    public int firstCompleteIndex(int[] arr, int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] rows = new int[m];
        int[] cols = new int[n];
        int[][] map = new int[m*n+1][2];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                map[matrix[i][j]][0] = i;
                map[matrix[i][j]][1] = j;
            }
        }

        for(int i=0;i<arr.length;i++){
            int row = map[arr[i]][0];
            int col = map[arr[i]][1];
            rows[row]++;
            cols[col]++;
            if(rows[row]==n || cols[col]==m)return i;
        }
        return -1;
    }
}
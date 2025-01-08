class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int c=mat[0].length;
        for(int i=0;i<mat.length;++i){
            int primary_diagonal = mat[i][i];
            int secondary_diagonal = mat[i][c-1-i];
            sum += primary_diagonal;
            if(i != c-1-i){
                sum += secondary_diagonal;
            }
        }
        return sum;

    }
}
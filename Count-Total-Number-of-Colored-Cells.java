class Solution {
    public long coloredCells(int n) {

        return(2L * n * (n - 1) + 1); //2L is used for larger values of n
    }
}
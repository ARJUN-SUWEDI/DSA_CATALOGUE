class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length, res = 0;
        Map<Integer, Integer> map = new HashMap<>(); // Map to track frequency of normalized rows
        
        for (int i = 0; i < n; i++) {
            // Normalize the row to a consistent representation
            if (matrix[i][m - 1] == 1) { // If last element is 1, flip the entire row
                for (int j = 0; j < m; j++) {
                    matrix[i][j] ^= matrix[i][m - 1]; // XOR to flip 1 to 0 and vice versa
                }
            }
            
            // Compute the hash of the normalized row
            int rowHash = Arrays.hashCode(matrix[i]);
            
            // Update the map with the normalized row hash and find max frequency
            res = Math.max(res, map.merge(rowHash, 1, Integer::sum));
        }
        
        return res;
    }
}
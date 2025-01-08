class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int l = 0; 
        int r = matrix[0].length - 1; 
        int up = 0; 
        int down = matrix.length - 1;

        while (up <= down && l <= r) {
            // Left to right
            for (int i = l; i <= r; ++i) {
                list.add(matrix[up][i]);
            }

            up++;

            // Up to down
            for (int i = up; i <= down; ++i) {
                list.add(matrix[i][r]);
            }

            r--;

            // Right to left (if there's a row remaining)
            if (up <= down) {
                for (int i = r; i >= l; --i) {
                    list.add(matrix[down][i]);
                }
                down--;
            }

            // Down to up (if there's a column remaining)
            if (l <= r) {
                for (int i = down; i >= up; --i) {
                    list.add(matrix[i][l]);
                }
                l++;
            }
        }
        return list;
    }
}

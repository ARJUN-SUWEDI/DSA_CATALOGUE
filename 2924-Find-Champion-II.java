class Solution {
    public int findChampion(int n, int[][] edges) {
        int[] inDeg = new int[n];

        for (int[] edge : edges) {
            // int u = edge[0];
            int v = edge[1];
            inDeg[v]++;
        }

        int champion = -1;

        for (int i = 0; i < n; i++) {
            if (inDeg[i] == 0) {
                if (champion == -1) {
                    champion = i;
                } else
                    return -1;
            }
        }

        return champion;
    }
}
class Solution {
    private int[] visited;

    private void dfs(int index, ArrayList<ArrayList<Integer>> ff, ArrayList<ArrayList<Integer>> bb, int[] ans) {
        visited[index] = 1;

        for (int i : ff.get(index)) { 
            if (visited[i] == 0) {
                ans[0]++; // Increase count when moving in original direction
                dfs(i, ff, bb, ans);
            }
        }

        for (int i : bb.get(index)) {
            if (visited[i] == 0) {
                dfs(i, ff, bb, ans);
            }
        }
    }

    public int minReorder(int n, int[][] connections) {
        ArrayList<ArrayList<Integer>> forward = new ArrayList<>();
        ArrayList<ArrayList<Integer>> backward = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            forward.add(new ArrayList<>());
            backward.add(new ArrayList<>());
        }

        for (int[] edge : connections) {
            int a = edge[0];
            int b = edge[1];
            forward.get(a).add(b);   // Edge in original direction
            backward.get(b).add(a);  // Reverse edge
        }

        visited = new int[n];
        int[] ans = {0}; // Use an array to store answer
        dfs(0, forward, backward, ans);
        return ans[0];  // Extract final answer
    }
}

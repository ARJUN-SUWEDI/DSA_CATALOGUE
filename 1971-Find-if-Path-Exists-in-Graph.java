class Solution {
    private int[] visited;

    public void helper(List<List<Integer>> g, int index) {
        visited[index] = 1;
        for (int i : g.get(index)) {
            if (visited[i] == 0) {
                helper(g, i);
            }
        }
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int a = edge[0], b = edge[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        visited = new int[n];
        helper(graph, source);
        
        return visited[destination] == 1;
    }
}

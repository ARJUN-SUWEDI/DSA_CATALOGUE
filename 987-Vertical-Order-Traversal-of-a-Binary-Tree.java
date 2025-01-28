class Pair {
    int val, height;

    public Pair(int val, int height) {
        this.val = val;
        this.height = height;
    }
}

class Solution {
    private HashMap<Integer, List<Pair>> map = new HashMap<>();
    private int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

    private void traverse(TreeNode node, int col, int height) {
        if (node == null) return;
        min = Math.min(min, col);
        max = Math.max(max, col);
        map.computeIfAbsent(col, k -> new ArrayList<>()).add(new Pair(node.val, height));
        traverse(node.left, col - 1, height + 1);
        traverse(node.right, col + 1, height + 1);
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        traverse(root, 0, 0);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = min; i <= max; ++i) {
            if (map.containsKey(i)) {
                List<Pair> nodes = map.get(i);
                nodes.sort((p1, p2) -> p1.height == p2.height ? p1.val - p2.val : p1.height - p2.height);
                List<Integer> colValues = new ArrayList<>();
                for (Pair p : nodes) colValues.add(p.val);
                ans.add(colValues);
            }
        }
        return ans;
    }
}

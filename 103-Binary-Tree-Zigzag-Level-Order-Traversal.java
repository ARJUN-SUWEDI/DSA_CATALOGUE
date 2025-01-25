class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean reverse = false;
        
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> ls = new ArrayList<>();
            
            for (int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                ls.add(temp.val);
                if (temp.left != null) q.offer(temp.left);
                if (temp.right != null) q.offer(temp.right);
            }
            
            if (reverse) {
                Collections.reverse(ls);
            }
            
            ans.add(ls);
            reverse = !reverse;
        }
        
        return ans;
    }
}

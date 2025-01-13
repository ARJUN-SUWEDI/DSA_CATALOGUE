/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private void helper(TreeNode root, List<Integer> fans)
    {
        if(root==null) return;
        
        helper(root.left, fans);
        fans.add(root.val);
        helper(root.right, fans);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
                List<Integer> fans=new ArrayList<>();
        helper(root, fans);
        return fans;
    }
}

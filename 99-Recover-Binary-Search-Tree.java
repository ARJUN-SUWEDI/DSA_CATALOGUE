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
    TreeNode a;
    TreeNode b;
    TreeNode prev;
    public void helper(TreeNode curr){
        if(curr==null){
            return;
        }
        helper(curr.left);
        if(prev!=null && prev.val>curr.val){
            if(a==null){
                a=prev;
            }
            b=curr;
        }
        prev=curr;
        helper(curr.right);

    }
    public void recoverTree(TreeNode root) {
        helper(root);
        int temp=a.val;
        a.val=b.val;
        b.val=temp;
    }
}